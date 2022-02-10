package db.day02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import db.day01.OracleConnectUtil;

public class DeleteTest {
//원하는 고객 ID를 입력받아서 회원탈퇴를 진행
	private static Connection conn = OracleConnectUtil.connect();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sql = "DELETE FROM TBL_CUSTOM# WHERE CUSTOM_ID=?";
				
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			String custom_id = null;

			while(true){ //ID가 없는 경우 다시 입력 실행
				System.out.print("탈퇴 원하는 고객의 ID를 입력하세요 : ");
				custom_id = sc.nextLine();
				if(!idCheck(custom_id)) {
					System.out.println("요청하신 탈퇴가 진행되었습니다.");
					break;
				}else {
				System.out.println("없는 ID입니다."); 	
				}
			}
			pstmt.setString(1, custom_id);
			pstmt.execute();
			pstmt.close();
		
		} catch (SQLException e) {
			System.out.println("sql 실행오류 :"+e.getMessage());
		}
		
		
		sc.close();
	}//main end
	private static boolean idCheck(String custom_id) {
		boolean result = false;
		String sql = "SELECT * FROM TBL_CUSTOM# WHERE CUSTOM_ID=?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;	
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,custom_id);	
			rs = pstmt.executeQuery();	
			
			if(!rs.next())	//값이 있으면 true 없으면 false
			 result=true;
			
			pstmt.close();
			//
		}catch(SQLException e) {
			System.out.println("SQL 실행 오류:"+e.getMessage());
		}
		return result;	//ID가 중복되면 false, 중복되지않으면 true
	}
}

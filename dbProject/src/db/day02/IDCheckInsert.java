package db.day02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import db.day01.OracleConnectUtil;

public class IDCheckInsert {

	private static Connection conn = OracleConnectUtil.connect();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("main메소드 확인용:" + conn);

		String sql = "INSERT INTO TBL_CUSTOM#" + "(CUSTOM_ID, NAME, EMAIL, AGE, REG_DATE)"
				+ "VALUES(?, ?, ?, ?, sysdate)";

		System.out.println("데이터베이스에 추가할 정보를 입력받습니다.");
		System.out.println("먼저 사용할 ID를 입력하고 중복확인 합니다.");
		String id = null;
		while(true){	//ID 중복검사
			System.out.print("ID를 입력하세요 :");
			id = sc.nextLine();
			if(idCheck(id)) {
				System.out.println("사용 가능한 ID입니다.");
				break;
			}else {
			System.out.println("중복된 ID입니다.");
			 	
			}
		}
		System.out.println("등록된 ID:"+id+"입니다.");
		System.out.print("이름을 입력하세요 :");
		String name = sc.nextLine();

		System.out.print("이메일을 입력하세요 :");
		String email = sc.nextLine();

		System.out.print("나이를 입력하세요 :");
		int age = Integer.parseInt(sc.nextLine());

		// insert 할 값을 Scanner 클래스를 사용해서 직접 입력 받기
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, email);
			pstmt.setInt(4, age);

			pstmt.execute();
			System.out.println("회원가입을 축하합니다.");
			pstmt.close();
		} catch (SQLException e) {
			System.out.println("sql 실행 오류" + e.getMessage());
		}
		OracleConnectUtil.close(conn);
		sc.close();
		
		
	}//main end

	private static boolean idCheck(String id) {
		boolean result = false;
		String sql = "SELECT * FROM TBL_CUSTOM# WHERE CUSTOM_ID=?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;	
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,id);	
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

package db.day01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class SelectTest3 {
//	ResultSet 타입 쿼리 결과를 조건식으로 조회하여 출력하기
	// 조건 컬럼 custom_id (기본키 컬럼)
		// 조회결과는 0 또는 1개이다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection conn = OracleConnectUtil.connect();
		String sql = "SELECT * FROM TBL_CUSTOM# WHERE CUSTOM_ID=?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;	
		
		System.out.print("조회할 고객 ID를 입력하세요 : ");
		String custom_id = sc.nextLine();
		try {
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, custom_id);	//쿼리 실행에 필요한 매개변수(?) 전달
		rs = pstmt.executeQuery();	// select

		if(rs.next()) {
			System.out.print(String.format("%-20s", rs.getString("custom_id")));
			System.out.print(String.format("%-20s", rs.getString("name")));
			System.out.print(String.format("%-20s", rs.getString("email")));
			System.out.print(String.format("%-5d", rs.getInt("age")));
			System.out.println(String.format("%-20s", rs.getDate("reg_date")));
		}else {
			System.out.println("조회하신 "+custom_id+"는 없는 ID입니다.");
		}
//		System.out.println("조회 결과"+rs.next());


		pstmt.close();
			sc.close();
		}catch(SQLException e) {
			System.out.println("SQL 실행 오류:"+e.getMessage());
			
		}
		
		OracleConnectUtil.close(conn);
	}//main end
}

package db.day01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertTest2 { // 오라클 idev 스키마 custom# 테이블에 고객을 추가하는 연습

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection conn = OracleConnectUtil.connect();
		System.out.println("main메소드 확인용:" + conn);

		String sql = "INSERT INTO TBL_CUSTOM#" + "(CUSTOM_ID, NAME, EMAIL, AGE, REG_DATE)"
				+ "VALUES(?, ?, ?, ?, sysdate)";

		System.out.println("데이터베이스에 추가할 정보를 입력받습니다.");

		System.out.print("ID를 입력하세요 :");
		String id = sc.nextLine();

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
			System.out.println("데이터베이스에 추가되었습니다.");
			pstmt.close();
		} catch (SQLException e) {
			System.out.println("sql 실행 오류" + e.getMessage());
		}
		OracleConnectUtil.close(conn);
	}//main end

}

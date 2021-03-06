package db.day01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SelectTest2 {
//	ResultSet 타입 쿼리 결과를 모두 출력하기 : rs.next() 반복조건으로 이용
	
	public static void main(String[] args) {

		Connection conn = OracleConnectUtil.connect();
		String sql = "SELECT * FROM TBL_CUSTOM#";
		PreparedStatement pstmt = null;
		ResultSet rs = null;	
		
		try {
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();	

		while(rs.next()) {
			System.out.print(String.format("%-20s", rs.getString("custom_id")));
			System.out.print(String.format("%-20s", rs.getString("name")));
			System.out.print(String.format("%-20s", rs.getString("email")));
			System.out.print(String.format("%-5d", rs.getInt("age")));
			System.out.println(String.format("%-20s", rs.getDate("reg_date")));
		}
//		System.out.println("조회 결과"+rs.next());


		pstmt.close();
			
		}catch(SQLException e) {
			System.out.println("SQL 실행 오류:"+e.getMessage());
			
		}
		
		OracleConnectUtil.close(conn);
	}//main end
}

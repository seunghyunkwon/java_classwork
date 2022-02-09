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
			System.out.println("ID\tNAME\tEMAIL\t\tAGE\tREG_DATE");
			System.out.print(rs.getString("custom_id"));
			System.out.print("\t"+rs.getString("name"));
			System.out.print("\t"+rs.getString("email"));
			System.out.print("\t"+rs.getInt("age"));
			System.out.println("\t"+rs.getDate("reg_date"));
//			System.out.println(rs.getTimestamp("reg_date"));
		}
//		System.out.println("조회 결과"+rs.next());


		pstmt.close();
			
		}catch(SQLException e) {
			System.out.println("SQL 실행 오류:"+e.getMessage());
			
		}
		
		OracleConnectUtil.close(conn);
	}//main end
}

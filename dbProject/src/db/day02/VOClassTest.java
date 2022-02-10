package db.day02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.day01.OracleConnectUtil;
import dbvo.Custom;

public class VOClassTest {
	//SelectTest2.java 를 vo 이용하여 자바변수에 저장하는 연습
	public static void main(String[] args) {

		Connection conn = OracleConnectUtil.connect();
		String sql = "SELECT * FROM TBL_CUSTOM#";
		PreparedStatement pstmt = null;
		ResultSet rs = null;	
		List<Custom> customs = new ArrayList<>();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();	
//			int i=1;
			while(rs.next()) {
				//SELECT 조회 결과를 한행씩 가져와서 List에 추가한다.
				customs.add(new Custom(rs.getString(1),
							rs.getString(2),
							rs.getString(3),
							rs.getInt(4),
							rs.getDate(5)));
				
//				System.out.pring(i++ + "행  ");
//				System.out.print(String.format("%-20s", rs.getString("custom_id")));
//				System.out.print(String.format("%-20s", rs.getString("name")));
//				System.out.print(String.format("%-20s", rs.getString("email")));
//				System.out.print(String.format("%-5d", rs.getInt("age")));
//				System.out.println(String.format("%-20s", rs.getDate("reg_date")));
			}
			System.out.println("List에 저장된 값 확인");
			System.out.println(customs);
			System.out.println("List의 데이터를 1행씩 출력");
			for(int j=0;j<customs.size();j++) {
				System.out.print(String.format("j: %-3s", j+1));
				System.out.println(customs.get(j));
			}
			
				pstmt.close();
		} catch (SQLException e) {
			System.out.println("SQL 실행 오류:"+e.getMessage());
		}
		OracleConnectUtil.close(conn);
	}//main end
}

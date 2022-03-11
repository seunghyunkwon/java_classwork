package proc_0311;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

import db.day01.OracleConnectUtil;

//데이터베이스에서 만든 회원이 도서를 대여하는 프로시저를 jdbc방식으로 실행한다.
public class exam {

	public static void main(String[] args) {
		Connection conn = OracleConnectUtil.connect();
		Scanner sc = new Scanner(System.in);
		String sql="{call return_book(?,?,?,?)}";		
		
		//프로시저에서 실행할 때 필요한 매개변수 선언
		System.out.println("회원번호 입력 : ");
		int mem_idx = Integer.parseInt(sc.nextLine());
		System.out.println("도서번호 입력 : ");
		String bcode = sc.nextLine();
		//bcode의 경우 type이 char인데 입력받는 명령어를 모르겠어요.
		//이와같은 경우에는 어떻게 해야할까요 ?
		System.out.println("반납일자 입력 : ");
		String return_date = sc.nextLine();
		//마찬가지로 날짜 또한 date type인데 BEGIN에 입력하는 것 기준
		//문자열 처럼 '' 사이에 들어가는 것으로 생각해서 우선 String 으로 작성해봅니다.
		
		CallableStatement cstmt=null;
		
		try {
			
			cstmt = conn.prepareCall(sql);
			//매개변수값 설정
			cstmt.setInt(1, mem_idx);
			cstmt.setString(2, bcode);
			cstmt.setString(3, return_date);
			
			cstmt.registerOutParameter(4, Types.VARCHAR);
			cstmt.executeUpdate();
			
			System.out.println("실행결과 : " + cstmt.getString(4));
			cstmt.close();
		}catch(SQLException e) {
			System.out.println("실행오류 : " + e.getMessage());
		}finally {
			OracleConnectUtil.close(conn);
			sc.close();
		}
	}
}

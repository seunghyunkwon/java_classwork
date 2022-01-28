package koreait.day15;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileWriteTest {
//System.out : 표준출력 (콘솔/모니터 출력)	
//	파일출력 연습
//	파일출력의 기본 : 경로(어디에 있는 파일인지), 파일명(이름)
	public static void main(String[] args) {
		
		String filename="E:\\test\\자바테스트.txt";	
		//역슬래쉬\는 \\로 해야한다.
		
		//파일 객체 생성
		File file = new File(filename);
		
		//file 참조하는 파일객체를 데이터 출력에 사용하기 위한 클래스는 PrintWriter 입니다.
		try {	//파일입력 또는 파일출력할 때 자바는 꼭 try ~ catch로 처리하도록 한다.
			PrintWriter pw = new PrintWriter(file);
			
			pw.println("모모 90 88 79");
			pw.println("사나99");
			
			pw.close();		//파일작업종료
			System.out.println("생성완료");
			
		} catch (FileNotFoundException e) {	//파일 출력은 파일이 없으면 자동생성한다(Exception이 발생하지않는다)
				//하지만 없는 경로를 지정하면 Exception이 생성한다.
			System.out.println("없는 파일을 선택했습니다.("+e.getMessage()+")");
			
		}
	
	
	
	
	}
}

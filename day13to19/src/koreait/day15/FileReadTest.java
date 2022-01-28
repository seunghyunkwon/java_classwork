package koreait.day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadTest {
//System.in : 표준 입력
	
	public static void main(String[] args) {
		//파일입력 : 데이터를 파일에서 읽어온다.
	
		
		String filename="E:\\test\\자바테스트.txt";	
		//역슬래쉬\는 \\로 해야한다.
		
		//파일 객체 생성
		File file = new File(filename);
		
		try {
			Scanner fsc = new Scanner(file);
			
			String temp = fsc.nextLine();
			System.out.println("읽어온 문자열:" + temp);
			System.out.println("-------------------");
			
			
			//hasXXX()메소드 : 다음 토큰(구분기호로 분리)
			while(fsc.hasNext()) {//읽어올 라인이 있다면 반복
				System.out.println(fsc.nextLine());
				
			}
			
			fsc.close();
			
			
		} catch (FileNotFoundException e) {
		
		}
		
		
		
		
		
		
	}
}

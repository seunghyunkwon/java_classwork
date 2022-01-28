package koreait.day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MyFileRW {

	
		static void fileWrite(String filename,Object[]data) {
			File file = new File(filename);
			try {
				PrintWriter pw = new PrintWriter(file);
	
				for(int i=0;i<data.length;i++)
					pw.println(data[i]);
				
				pw.close();		
				System.out.println("생성완료");
			} catch (FileNotFoundException e) {	
				System.out.println("없는 파일을 선택했습니다.("+e.getMessage()+")");				
			}
			
		}//메소드 종료
	
		static void fileRead(String filename) {
			File file = new File(filename);				//파일 생성
			try {
				Scanner fsc = new Scanner(file);		//파일 내용 입력			
				while(fsc.hasNext()) {							
					System.out.println(fsc.nextLine());	//파일 내용 출력
				}
				fsc.close();
			} catch (FileNotFoundException e) {
				System.out.println("경로/파일명 오류 : "+e.getMessage());
			}
		}//메소드 종료
		
		
		
		
		
	}


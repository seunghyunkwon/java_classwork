package koreait.day15;

public class MyFileRWTest {

	public static void main(String[] args) {
		
		MyFileRW.fileRead("E:\\test\\자바테스트.txt");
		
		MyFileRW.fileRead("E:\\test\\directx.log");
		
		String[] menu = {"삼겹살","스파게티","곱창전골","불고기","탕수육"};
		Member[] members = {new Member("모모",17),new Member("사나",21),null,null,null};
		System.out.println(members.length);
		members[2] = new Member("쯔위",22);
		members[3] = new Member("나연",19);
		members[4] = new Member("다현",18);
		
		//위 2개 배열을 E:\test\members.txt 파일에 쓰기
		String filename = "E:\\test\\members.txt";
		
		MyFileRW.fileWrite(filename, menu);
		
		MyFileRW.fileWrite(filename, members);	//같은 파일인 경우 덮어쓰기 처리된다.
		
		
		
		
		
	}
}

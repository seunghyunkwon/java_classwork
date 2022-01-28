package koreait.day19;

import java.util.List;

public class Word {//��ü�� �����ϴ� ���� ������ Ŭ���� (��ü:����������,�޼ҵ����)
	
	private String english;
	private List<String> koreans;	//����ܾ� 1���� �������� ���� ������ .���� list�� add�մϴ�.
	private int level;
	
	public Word(String english) {
		this.english = english;
	}
	
	public Word(String english, List<String> koreans) {
		this(english);
		this.koreans = koreans;			//������(�ּ�) �� �����մϴ�.(���ڰ��� �ʵ尪���� ����)
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return english + ":" + koreans;
	}
	
	public List<String> getKoreans() {
		return koreans;
	}
	
	public String getEnglish() {
		return english;
	}
	
	public void setKoreans(List<String> koreans) {
		this.koreans = koreans;
	}
	

}

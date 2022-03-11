package project;

import javax.swing.ImageIcon;

//import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class JFrameSet {

	public static void main(String[] args) {
		
		//프레임 생성
		JFrame frame = new JFrame("가제:걸그룹 조회하기");
		//라벨 생성
		JLabel lb1 = new JLabel();

		//버튼 생성
		JButton btn1 = new JButton("트와이스");

		//프레임 크기 설정
		frame.setSize(550, 500);
		
		//프레임을 화면 가운데 배치
		frame.setLocationRelativeTo(null);
		
		//종료시 콘솔 종료
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//FlowLayout fLay = new FlowLayout();	//Flow로 작성시 맨위 상단 머리글 위치로 자동 설정
		//레이아웃 설정
		frame.getContentPane().setLayout(null);
		
		//버튼 위치와 크기 설정
		btn1.setBounds(100, 50, 150, 150);
		//프레임에 버튼 추가
		frame.getContentPane().add(btn1);
		
		//라벨 위치와 크기 설정
		lb1.setBounds(100, 150, 200, 200);
		//라벨 텍스트 문구
		lb1.setText("TWICE");
		//프레임에 라벨 추가
		frame.getContentPane().add(lb1);
		//라벨명 + . + setHorizontalAlignment + 수평 정렬 ( 위치 )
//		lb1.setHorizontalAlignment(JLabel.CENTER);
		
		//행동 감지 기능 추가
		//버튼 객체.addActionListener(event{버튼이 눌러지면 실행할 내용});
		btn1.addActionListener(event ->{
			lb1.setText("트와이스 멤버를 보여줍니다.");
		});
		
		//그림을 넣을 버튼 생성
		JButton imgbtn1 = new JButton();
		//버튼에 넣을 아이콘 생성	//ImageIcon(클래스명.clss.getResource("/이미지파일이있는패키지명/클래스이름/파일이름.확장자(jpg,png)")
		ImageIcon btimg = new ImageIcon(JFrameSet.class.getResource("/project/img/aespa.jpg"));
		//버튼에 아이콘 설정
		imgbtn1.setIcon(btimg);
		//위치 설정
		imgbtn1.setBounds(40,200,250,250);
		//수평 위치 설정
		imgbtn1.setHorizontalAlignment(SwingConstants.CENTER);
		//프레임에 버튼아이콘 추가
		frame.getContentPane().add(imgbtn1);
		
		
		//프레임이 보이도록 설정
		frame.setVisible(true);

		//컨텐츠 영역의 크기 확인
//		System.out.println(frame.getContentPane().getSize());
		
	}
}

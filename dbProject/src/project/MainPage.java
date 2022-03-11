package project;


import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;






public class MainPage extends JFrame {
	
	private static final long serialVersionUID = 1L;
		// 프레임 생성
		JFrame frame = new JFrame("가제:걸그룹 조회하기");
		JLabel lb0,lb1,lb2,lb3,lb4,lb5,lb6;
		JLabel glb,glb1,glb2,glb3,glb4,glb5,glb6,glb7,glb8,glb9;
		JButton btn,btn1,btn2,btn3,btn4,btn5,btn6;
		JButton gbtn1,gbtn2,gbtn3,gbtn4,gbtn5,gbtn6;
		ImageIcon img,img1,img2,img3,img4,img5,img6;
		ImageIcon gimg1,gimg2,gimg3,gimg4,gimg5,gimg6;
		JPanel p_main,p_twice,p_blackpink,p_itzy,p_aespa,p_missa,p_fx;
		
		
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
	         public void run() {
	            try {
	               MainPage window = new MainPage();
	               window.frame.setVisible(true);
	            } catch (Exception e) {
	               e.printStackTrace();
	            }
	         }
	      });
	}

	public MainPage() {	//프레임을 구성하는 요소
		init();
	}

	private void init() {
		
		frame = new JFrame("걸그룹 정보조회 프로그램");
		frame.setBounds(30, 0, 700, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
//		--------------프레임 관련 사항 종료----------------------
		p_main = new JPanel();
	    p_main.setBounds(0, 0, 700, 900);
	    frame.getContentPane().add(p_main);
	    p_main.setLayout(null);
	   
	    
		lb0 = new JLabel();
		lb0.setBounds(180, 20, 350, 50);
		lb0.setText("걸그룹 조회하기 프로그램");
		lb0.setFont(new Font("휴먼모음T",Font.BOLD,30));
		frame.getContentPane().add(lb0);
		p_main.add(lb0);
		
		//트와이스
		//패널
		p_twice = new JPanel();
	    p_twice.setBounds(0, 0, 900, 900);
	    frame.getContentPane().add(p_twice);
	    p_twice.setLayout(null);
	    p_twice.setVisible(false);
	    
	    
	    img = new ImageIcon(MainPage.class.getResource("/project/groupimg/twice_1.jpg"));
	    glb = new JLabel();
		glb.setIcon(img);
		glb.setBounds(50, 10, 400, 300);
		glb.setHorizontalAlignment(SwingConstants.CENTER);
		p_twice.add(glb);
		
	    glb1 = new JLabel("그룹명 : TWICE");
	    glb1.setFont(new Font("휴먼모음T",Font.BOLD,14));
		glb1.setBounds(55, 300, 200, 50);
		p_twice.add(glb1);
		
		glb2 = new JLabel("소속 가수 : ");
		glb2.setFont(new Font("휴먼모음T",Font.BOLD,14));
		glb2.setBounds(55, 350, 200, 50);
		p_twice.add(glb2);
		
		glb3 = new JLabel("소속사 : ");
		glb3.setFont(new Font("휴먼모음T",Font.BOLD,14));
		glb3.setBounds(55, 400, 200, 50);
		p_twice.add(glb3);
		
		glb4 = new JLabel("앨범 : ");
		glb4.setFont(new Font("휴먼모음T",Font.BOLD,14));
		glb4.setBounds(55, 450, 200, 50);
		p_twice.add(glb4);
		
		glb5 = new JLabel("멤버수 : 9명");
		glb5.setFont(new Font("휴먼모음T",Font.BOLD,14));
		glb5.setBounds(55, 500, 200, 50);
		p_twice.add(glb5);
		
		glb6 = new JLabel("데뷔곡 : Ooh-Ahh 하게");
		glb6.setFont(new Font("휴먼모음T",Font.BOLD,14));
		glb6.setBounds(55, 550, 200, 50);
		p_twice.add(glb6);
		
		glb7 = new JLabel("데뷔일 : 2015년 10월 19일");
		glb7.setFont(new Font("휴먼모음T",Font.BOLD,14));
		glb7.setBounds(55, 600, 200, 50);
		p_twice.add(glb7);
		
		glb8 = new JLabel("팬카페명 : Twinkle");
		glb8.setFont(new Font("휴먼모음T",Font.BOLD,14));
		glb8.setBounds(55, 650, 200, 50);
		p_twice.add(glb8);
		
		glb9 = new JLabel("리더 : 지효");
		glb9.setFont(new Font("휴먼모음T",Font.BOLD,14));
		glb9.setBounds(55, 700, 200, 50);
		p_twice.add(glb9);
	    
	    //메인
		img1 = new ImageIcon(MainPage.class.getResource("/project/mainimg/twice.jpg"));
		btn1 = new JButton();
		btn1.setIcon(img1);
		btn1.setBounds(20,90,300,200);
		btn1.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(btn1);
		lb1 = new JLabel("TWICE");
		lb1.setFont(new Font("휴먼둥근헤드라인",Font.BOLD,25));
		lb1.setBounds(90,280,150,50);
		lb1.setHorizontalAlignment(SwingConstants.CENTER);
		p_main.add(lb1);
		p_main.add(btn1);
		
		
		
		//액션리스너
		btn1.addActionListener(new ActionListener() { //트와이스 이미지 클릭시
	         @Override
	         public void actionPerformed(ActionEvent e) {         
	            if(e.getSource()==btn1) {
	            frame.setBounds(30, 0, 510, 900);
	            frame.getContentPane().setLayout(null);
	            frame.setResizable(false);
	    		frame.setLocationRelativeTo(null);
	            p_twice.setVisible(true);
	            p_main.setVisible(false);
	            }
	         }      
	      });
		
		
		
		
		//블랙핑크
		p_blackpink = new JPanel();
		p_blackpink.setBounds(0, 0, 900, 900);
	    frame.getContentPane().add(p_blackpink);
	    p_blackpink.setLayout(null);
	    p_blackpink.setVisible(false);
	    
	    img = new ImageIcon(MainPage.class.getResource("/project/groupimg/blackpink_1.jpg"));
	    glb = new JLabel();
		glb.setIcon(img);
		glb.setBounds(50, 10, 400, 300);
		glb.setHorizontalAlignment(SwingConstants.CENTER);
		p_blackpink.add(glb);
		
		   	glb1 = new JLabel("그룹명 : BLACKPINK");
		    glb1.setFont(new Font("휴먼모음T",Font.BOLD,14));
			glb1.setBounds(55, 300, 200, 50);
			p_blackpink.add(glb1);
			
			glb2 = new JLabel("소속 가수 : ");
			glb2.setFont(new Font("휴먼모음T",Font.BOLD,14));
			glb2.setBounds(55, 350, 200, 50);
			p_blackpink.add(glb2);
			
			glb3 = new JLabel("소속사 : ");
			glb3.setFont(new Font("휴먼모음T",Font.BOLD,14));
			glb3.setBounds(55, 400, 200, 50);
			p_blackpink.add(glb3);
			
			glb4 = new JLabel("앨범 : ");
			glb4.setFont(new Font("휴먼모음T",Font.BOLD,14));
			glb4.setBounds(55, 450, 200, 50);
			p_blackpink.add(glb4);
			
			glb5 = new JLabel("멤버수 : 4명");
			glb5.setFont(new Font("휴먼모음T",Font.BOLD,14));
			glb5.setBounds(55, 500, 200, 50);
			p_blackpink.add(glb5);
			
			glb6 = new JLabel("데뷔곡 : 휘파람");
			glb6.setFont(new Font("휴먼모음T",Font.BOLD,14));
			glb6.setBounds(55, 550, 200, 50);
			p_blackpink.add(glb6);
			
			glb7 = new JLabel("데뷔일 : 2016년 08월 08일");
			glb7.setFont(new Font("휴먼모음T",Font.BOLD,14));
			glb7.setBounds(55, 600, 200, 50);
			p_blackpink.add(glb7);
			
			glb8 = new JLabel("팬카페명 : Blink");
			glb8.setFont(new Font("휴먼모음T",Font.BOLD,14));
			glb8.setBounds(55, 650, 200, 50);
			p_blackpink.add(glb8);
			
			glb9 = new JLabel("리더 : ");
			glb9.setFont(new Font("휴먼모음T",Font.BOLD,14));
			glb9.setBounds(55, 700, 200, 50);
			p_blackpink.add(glb9);
			
	    //메인
		img2 = new ImageIcon(MainPage.class.getResource("/project/mainimg/blackpink.jpg"));
		btn2 = new JButton();
		btn2.setIcon(img2);
		btn2.setBounds(360,90,300,200);
		btn2.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(btn2);
		lb2 = new JLabel("BLACKPINK");
		lb2.setFont(new Font("휴먼둥근헤드라인",Font.BOLD,25));
		lb2.setBounds(420,280,200,50);
		lb2.setHorizontalAlignment(SwingConstants.CENTER);
		p_main.add(lb2);
		p_main.add(btn2);
		//액션리스너
		btn2.addActionListener(new ActionListener() { 
	         @Override
	         public void actionPerformed(ActionEvent e) {         
	            if(e.getSource()==btn2) {
	            frame.setBounds(30, 0, 510, 900);
	 	        frame.getContentPane().setLayout(null);
	 	        frame.setResizable(false);
	 	        frame.setLocationRelativeTo(null);
	            p_blackpink.setVisible(true);
	            p_main.setVisible(false);
	            }
	         }      
	      });
		
	    //메인
			img3 = new ImageIcon(MainPage.class.getResource("/project/mainimg/ITZY.jpg"));
			btn3 = new JButton();
			btn3.setIcon(img3);
			btn3.setBounds(20,350,300,200);
			btn3.setHorizontalAlignment(SwingConstants.CENTER);
			frame.getContentPane().add(btn3);
			lb3 = new JLabel("ITZY");
			lb3.setFont(new Font("휴먼둥근헤드라인",Font.BOLD,25));
			lb3.setBounds(90,540,150,50);
			lb3.setHorizontalAlignment(SwingConstants.CENTER);
			p_main.add(lb3);
			p_main.add(btn3);
			
		//있지패널
		p_itzy = new JPanel();
		p_itzy.setBounds(0, 0, 900, 900);
	    frame.getContentPane().add(p_itzy);
	    p_itzy.setLayout(null);
	    p_itzy.setVisible(false);
	    
	    img = new ImageIcon(MainPage.class.getResource("/project/groupimg/itzy_1.jpg"));
	    glb = new JLabel();
		glb.setIcon(img);
		glb.setBounds(50, 10, 400, 300);
		glb.setHorizontalAlignment(SwingConstants.CENTER);
		p_itzy.add(glb);
		
		   	glb1 = new JLabel("그룹명 : ITZY");
		    glb1.setFont(new Font("휴먼모음T",Font.BOLD,14));
			glb1.setBounds(55, 300, 200, 50);
			p_itzy.add(glb1);
			
			glb2 = new JLabel("소속 가수 : ");
			glb2.setFont(new Font("휴먼모음T",Font.BOLD,14));
			glb2.setBounds(55, 350, 200, 50);
			p_itzy.add(glb2);
			
			glb3 = new JLabel("소속사 : ");
			glb3.setFont(new Font("휴먼모음T",Font.BOLD,14));
			glb3.setBounds(55, 400, 200, 50);
			p_itzy.add(glb3);
			
			glb4 = new JLabel("앨범 : ");
			glb4.setFont(new Font("휴먼모음T",Font.BOLD,14));
			glb4.setBounds(55, 450, 200, 50);
			p_itzy.add(glb4);
			
			glb5 = new JLabel("멤버수 : 5명");
			glb5.setFont(new Font("휴먼모음T",Font.BOLD,14));
			glb5.setBounds(55, 500, 200, 50);
			p_itzy.add(glb5);
			
			glb6 = new JLabel("데뷔곡 : 달라달라");
			glb6.setFont(new Font("휴먼모음T",Font.BOLD,14));
			glb6.setBounds(55, 550, 200, 50);
			p_itzy.add(glb6);
			
			glb7 = new JLabel("데뷔일 : 2019년 02월 12일");
			glb7.setFont(new Font("휴먼모음T",Font.BOLD,14));
			glb7.setBounds(55, 600, 200, 50);
			p_itzy.add(glb7);
			
			glb8 = new JLabel("팬카페명 : midzy");
			glb8.setFont(new Font("휴먼모음T",Font.BOLD,14));
			glb8.setBounds(55, 650, 200, 50);
			p_itzy.add(glb8);
			
			glb9 = new JLabel("리더 : 예지");
			glb9.setFont(new Font("휴먼모음T",Font.BOLD,14));
			glb9.setBounds(55, 700, 200, 50);
			p_itzy.add(glb9);
			
		//액션리스너
		btn3.addActionListener(new ActionListener() {
	         @Override
	         public void actionPerformed(ActionEvent e) {         
	            if(e.getSource()==btn3) {
	            	frame.setBounds(30, 0, 510, 900);
		 	        frame.getContentPane().setLayout(null);
		 	        frame.setResizable(false);
		 	        frame.setLocationRelativeTo(null);
	            p_itzy.setVisible(true);
	            p_main.setVisible(false);
	            }
	         }      
	      });
		
	    //메인
		img4 = new ImageIcon(MainPage.class.getResource("/project/mainimg/aespa.jpg"));
		btn4 = new JButton();
		btn4.setIcon(img4);
		btn4.setBounds(360,350,300,200);
		btn4.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(btn4);
		lb4 = new JLabel("AESPA");
		lb4.setFont(new Font("휴먼둥근헤드라인",Font.BOLD,25));
		lb4.setBounds(440,540,150,50);
		lb4.setHorizontalAlignment(SwingConstants.CENTER);
		p_main.add(lb4);
		p_main.add(btn4);
		
		//에스파
		p_aespa = new JPanel();
		p_aespa.setBounds(0, 0, 900, 900);
	    frame.getContentPane().add(p_aespa);
	    p_aespa.setLayout(null);
	    p_aespa.setVisible(false);
	    
	    img = new ImageIcon(MainPage.class.getResource("/project/groupimg/aespa_1.jpg"));
	    glb = new JLabel();
		glb.setIcon(img);
		glb.setBounds(50, 10, 400, 300);
		glb.setHorizontalAlignment(SwingConstants.CENTER);
		p_aespa.add(glb);
	    
	    glb1 = new JLabel("그룹명 : AESPA");
	    glb1.setFont(new Font("휴먼모음T",Font.BOLD,14));
		glb1.setBounds(55, 300, 200, 50);
		p_aespa.add(glb1);
		
		glb2 = new JLabel("소속 가수 : ");
		glb2.setFont(new Font("휴먼모음T",Font.BOLD,14));
		glb2.setBounds(55, 350, 200, 50);
		p_aespa.add(glb2);
		
		glb3 = new JLabel("소속사 : ");
		glb3.setFont(new Font("휴먼모음T",Font.BOLD,14));
		glb3.setBounds(55, 400, 200, 50);
		p_aespa.add(glb3);
		
		glb4 = new JLabel("앨범 : ");
		glb4.setFont(new Font("휴먼모음T",Font.BOLD,14));
		glb4.setBounds(55, 450, 200, 50);
		p_aespa.add(glb4);
		
		glb5 = new JLabel("멤버수 : 4명");
		glb5.setFont(new Font("휴먼모음T",Font.BOLD,14));
		glb5.setBounds(55, 500, 200, 50);
		p_aespa.add(glb5);
		
		glb6 = new JLabel("데뷔곡 : black mamba");
		glb6.setFont(new Font("휴먼모음T",Font.BOLD,14));
		glb6.setBounds(55, 550, 200, 50);
		p_aespa.add(glb6);
		
		glb7 = new JLabel("데뷔일 : 2020년 11월 17일");
		glb7.setFont(new Font("휴먼모음T",Font.BOLD,14));
		glb7.setBounds(55, 600, 200, 50);
		p_aespa.add(glb7);
		
		glb8 = new JLabel("팬카페명 : MY");
		glb8.setFont(new Font("휴먼모음T",Font.BOLD,14));
		glb8.setBounds(55, 650, 200, 50);
		p_aespa.add(glb8);
		
		glb9 = new JLabel("리더 : 카리나");
		glb9.setFont(new Font("휴먼모음T",Font.BOLD,14));
		glb9.setBounds(55, 700, 200, 50);
		p_aespa.add(glb9);

		//액션리스너
		btn4.addActionListener(new ActionListener() { 
	         @Override
	         public void actionPerformed(ActionEvent e) {         
	            if(e.getSource()==btn4) {
	            	frame.setBounds(30, 0, 510, 900);
		 	        frame.getContentPane().setLayout(null);
		 	        frame.setResizable(false);
		 	        frame.setLocationRelativeTo(null);
	            p_aespa.setVisible(true);
	            p_main.setVisible(false);
	            }
	         }      
	      });
		
	
	    //메인
		img5 = new ImageIcon(MainPage.class.getResource("/project/mainimg/Miss A.jpg"));
		btn5 = new JButton();
		btn5.setIcon(img5);
		btn5.setBounds(20,610,300,200);
		btn5.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(btn5);
		lb5 = new JLabel("MISS A");
		lb5.setFont(new Font("휴먼둥근헤드라인",Font.BOLD,25));
		lb5.setBounds(90,800,150,50);
		lb5.setHorizontalAlignment(SwingConstants.CENTER);
		p_main.add(lb5);
		p_main.add(btn5);
		
		//미쓰에이
		p_missa = new JPanel();
		p_missa.setBounds(0, 0, 900, 900);
	    frame.getContentPane().add(p_missa);
	    p_missa.setLayout(null);
	    p_missa.setVisible(false);
	    
	    img = new ImageIcon(MainPage.class.getResource("/project/groupimg/miss a_1.jpg"));
	    glb = new JLabel();
		glb.setIcon(img);
		glb.setBounds(50, 10, 400, 300);
		glb.setHorizontalAlignment(SwingConstants.CENTER);
		p_missa.add(glb);
	    
	    glb1 = new JLabel("그룹명 : MISS A");
	    glb1.setFont(new Font("휴먼모음T",Font.BOLD,14));
		glb1.setBounds(55, 300, 200, 50);
		p_missa.add(glb1);
		
		glb2 = new JLabel("소속 가수 : ");
		glb2.setFont(new Font("휴먼모음T",Font.BOLD,14));
		glb2.setBounds(55, 350, 200, 50);
		p_missa.add(glb2);
		
		glb3 = new JLabel("소속사 : ");
		glb3.setFont(new Font("휴먼모음T",Font.BOLD,14));
		glb3.setBounds(55, 400, 200, 50);
		p_missa.add(glb3);
		
		glb4 = new JLabel("앨범 : ");
		glb4.setFont(new Font("휴먼모음T",Font.BOLD,14));
		glb4.setBounds(55, 450, 200, 50);
		p_missa.add(glb4);
		
		glb5 = new JLabel("멤버수 : 4명");
		glb5.setFont(new Font("휴먼모음T",Font.BOLD,14));
		glb5.setBounds(55, 500, 200, 50);
		p_missa.add(glb5);
		
		glb6 = new JLabel("데뷔곡 : bad girl good girl");
		glb6.setFont(new Font("휴먼모음T",Font.BOLD,14));
		glb6.setBounds(55, 550, 200, 50);
		p_missa.add(glb6);
		
		glb7 = new JLabel("데뷔일 : 2010년 07월 01일");
		glb7.setFont(new Font("휴먼모음T",Font.BOLD,14));
		glb7.setBounds(55, 600, 200, 50);
		p_missa.add(glb7);
		
		glb8 = new JLabel("팬카페명 : SAY A");
		glb8.setFont(new Font("휴먼모음T",Font.BOLD,14));
		glb8.setBounds(55, 650, 200, 50);
		p_missa.add(glb8);
		
		glb9 = new JLabel("리더 : ");
		glb9.setFont(new Font("휴먼모음T",Font.BOLD,14));
		glb9.setBounds(55, 700, 200, 50);
		p_missa.add(glb9);
	    

		//액션리스너
		btn5.addActionListener(new ActionListener() { 
	         @Override
	         public void actionPerformed(ActionEvent e) {         
	            if(e.getSource()==btn5) {
	            	frame.setBounds(30, 0, 510, 900);
		 	        frame.getContentPane().setLayout(null);
		 	        frame.setResizable(false);
		 	        frame.setLocationRelativeTo(null);
	            p_missa.setVisible(true);
	            p_main.setVisible(false);
	            }
	         }      
	      });
		
	    //메인
			img6 = new ImageIcon(MainPage.class.getResource("/project/mainimg/f(x).jpg"));
			btn6 = new JButton();
			btn6.setIcon(img6);
			btn6.setBounds(360,610,300,200);
			btn6.setHorizontalAlignment(SwingConstants.CENTER);
			frame.getContentPane().add(btn6);
			lb6 = new JLabel("f(x)");
			lb6.setFont(new Font("휴먼둥근헤드라인",Font.BOLD,25));
			lb6.setBounds(440,800,150,50);
			lb6.setHorizontalAlignment(SwingConstants.CENTER);
			p_main.add(lb6);
			p_main.add(btn6);
			
//		//에프엑스
		p_fx = new JPanel();
		p_fx.setBounds(0, 0, 900, 900);
	    frame.getContentPane().add(p_fx);
	    p_fx.setLayout(null);
	    p_fx.setVisible(false);
	    
	    img = new ImageIcon(MainPage.class.getResource("/project/groupimg/f(x)_1.jpg"));
	    glb = new JLabel();
		glb.setIcon(img);
		glb.setBounds(50, 10, 400, 300);
		glb.setHorizontalAlignment(SwingConstants.CENTER);
		p_fx.add(glb);
	    
	    glb1 = new JLabel("그룹명 : f(x)");
	    glb1.setFont(new Font("휴먼모음T",Font.BOLD,14));
		glb1.setBounds(55, 300, 200, 50);
		p_fx.add(glb1);
		
		glb2 = new JLabel("소속 가수 : ");
		glb2.setFont(new Font("휴먼모음T",Font.BOLD,14));
		glb2.setBounds(55, 350, 200, 50);
		p_fx.add(glb2);
		
		glb3 = new JLabel("소속사 : ");
		glb3.setFont(new Font("휴먼모음T",Font.BOLD,14));
		glb3.setBounds(55, 400, 200, 50);
		p_fx.add(glb3);
		
		glb4 = new JLabel("앨범 : ");
		glb4.setFont(new Font("휴먼모음T",Font.BOLD,14));
		glb4.setBounds(55, 450, 200, 50);
		p_fx.add(glb4);
		
		glb5 = new JLabel("멤버수 : 4명");
		glb5.setFont(new Font("휴먼모음T",Font.BOLD,14));
		glb5.setBounds(55, 500, 200, 50);
		p_fx.add(glb5);
		
		glb6 = new JLabel("데뷔곡 : LA chA TA");
		glb6.setFont(new Font("휴먼모음T",Font.BOLD,14));
		glb6.setBounds(55, 550, 200, 50);
		p_fx.add(glb6);
		
		glb7 = new JLabel("데뷔일 : 2010년 07월 01일");
		glb7.setFont(new Font("휴먼모음T",Font.BOLD,14));
		glb7.setBounds(55, 600, 200, 50);
		p_fx.add(glb7);
		
		glb8 = new JLabel("팬카페명 : 미유");
		glb8.setFont(new Font("휴먼모음T",Font.BOLD,14));
		glb8.setBounds(55, 650, 200, 50);
		p_fx.add(glb8);
		
		glb9 = new JLabel("리더 : 빅토리아");
		glb9.setFont(new Font("휴먼모음T",Font.BOLD,14));
		glb9.setBounds(55, 700, 200, 50);
		p_fx.add(glb9);
	    
	
		//액션리스너
		btn6.addActionListener(new ActionListener() { 
	         @Override
	         public void actionPerformed(ActionEvent e) {         
	            if(e.getSource()==btn6) {
	            	frame.setBounds(30, 0, 510, 900);
		 	        frame.getContentPane().setLayout(null);
		 	        frame.setResizable(false);
		 	        frame.setLocationRelativeTo(null);
	            p_fx.setVisible(true);
	            p_main.setVisible(false);
	            }
	         }      
	      });
		
	}

		
}

package project;

import java.awt.Color;
import java.awt.Container;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class AS_geiselle extends JFrame implements ActionListener{
	
	
	private static final long serialVersionUID = 1L;
	JLabel la1,la11,la2,la3,la4,la5,la6,la7;
	JTextField tf11;
	JButton bt1,bt2, bt3,bt4,bt5;
	Container c = this.getContentPane();
	
	public AS_geiselle() {
		init();
	}

	private void init() {
		
		bt1 = new JButton("뒤로가기");
		bt1.setIcon(new ImageIcon("./logo/back1.png"));
		bt1.setBounds(45, 480, 40, 40);
		bt1.addActionListener(this);
		
		bt2 = new JButton("");
		bt2.setIcon(new ImageIcon("./logo/home1.png"));
		bt2.setBounds(230, 480, 40, 40);
		bt2.addActionListener(this);
		
		bt4 = new JButton("닫기");
		bt4.setFont(new Font("돋움", Font.BOLD,10));
		bt4.setBounds(400,480, 60, 40);
		bt4.addActionListener(this);
		
		bt3 = new JButton("");
		bt3.setIcon(new ImageIcon("./aespa/as_giselle2.jpg"));
		bt3.setBounds(45, 40, 150, 225);
		bt3.setBorderPainted(false);
		
		la1 = new JLabel("지  젤");
		la1.setFont(new Font("휴먼둥근헤드라인",Font.BOLD,25));
		la1.setBounds(290, -40, 300, 300);
		
		la11 = new JLabel("Giselle");
		la11.setFont(new Font("휴먼둥근헤드라인",Font.BOLD,25));
		la11.setBounds(280, 10, 300, 300);
		
		la2 = new JLabel("생일 : 2000-10-30");
		la2.setFont(new Font("휴먼모음T",Font.BOLD,14));
		la2.setBounds(55, 205, 200, 200);
		
		la3 = new JLabel("국적 : 일본");
		la3.setFont(new Font("휴먼모음T",Font.BOLD,14));
		la3.setBounds(55, 235, 200, 200);
		
		la4 = new JLabel("그룹명 : AESPA");
		la4.setFont(new Font("휴먼모음T",Font.BOLD,14));
		la4.setBounds(55, 265, 200, 200);
		
		la5 = new JLabel("파트 : 메인래퍼");
		la5.setFont(new Font("휴먼모음T",Font.BOLD,14));
		la5.setBounds(55, 295, 200, 200);
		
		la6 = new JLabel("SNS : ");
		la6.setFont(new Font("휴먼모음T",Font.BOLD,14));
		la6.setBounds(55, 325, 200, 200);
		
		bt5 = new JButton("https://www.instagram.com/aespa_official/");
		bt5.setFont(new Font("휴먼모음T",Font.BOLD,14));
		bt5.setBounds(100, 418, 330, 15);
		bt5.addActionListener(this);
		
		this.add(bt1); this.add(bt2); this.add(bt3); this.add(bt4);	this.add(bt5); //버튼,이미지
		this.add(la1); this.add(la2); this.add(la3); 		//글씨
		this.add(la4); this.add(la5); this.add(la6);		//글씨
		this.add(la11);
	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//종료시 자동종료
		this.setTitle("가수");									//화면 타이틀 이름
		this.setLayout(null);
		this.setSize(500,600);									//화면 사이즈
		this.setResizable(false);
		this.setVisible(true);
		this.setLocationRelativeTo(null); 						//화면 가운데에서 나오게하기.
		c.setBackground(new Color(255,20,20,20));				//백그라운드 색
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==bt1) {
			JOptionPane.showMessageDialog(this, "걸그룹 페이지로 이동하시겠습니까?");
			this.setBounds(30,0,510,900);
			this.getContentPane().setLayout(null);
			this.setLocationRelativeTo(null);
//			AS_geiselle.setVisible(true);			// 에스파 그룹 화면전환
			this.setVisible(false);
			
		}else if(e.getSource()==bt2) {
			JOptionPane.showMessageDialog(this, "처음 화면으로 돌아가시겠습니까?");
			this.setBounds(30,0,510,900);
			this.getContentPane().setLayout(null);
			this.setLocationRelativeTo(null);
//			p_main.setVisible(true);			// 메인 화면전환
			this.setVisible(false);
		}else if(e.getSource()==bt4){
			JOptionPane.showMessageDialog(this, "프로그램을 종료하시겠습니까?");
			dispose();
			System.exit(0);
		}else if(e.getSource()==bt5) {		//해당 페이지 이동.
			String urlLink = "https://www.instagram.com/aespa_official/";
	    	try {
	    		Desktop.getDesktop().browse(new URI(urlLink));
	    	} catch (IOException e1) {
	    		e1.printStackTrace();
	    	} catch (URISyntaxException e1) {
	    		e1.printStackTrace();
	    	}
		}
		
	}
	public static void main(String[] args) {
		new AS_geiselle();
	}
}

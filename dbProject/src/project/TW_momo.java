package project;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TW_momo extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	JLabel la1,la11,la2,la3,la4,la5,la6;
	JTextField tf11;
	JButton btt1,btt2, btt3,btt4;
	Container c = this.getContentPane();
	
	public TW_momo() {
		init();
	}
	
	private void init() {
		btt1 = new JButton("뒤로가기");
		btt1.setIcon(new ImageIcon("./logo/back1.png"));
		btt1.setBounds(45, 480, 40, 40);
		btt1.addActionListener(this);
		
		btt2 = new JButton("");
		btt2.setIcon(new ImageIcon("./logo/home1.png"));
		btt2.setBounds(230, 480, 40, 40);
		btt2.addActionListener(this);
		
		btt4 = new JButton("닫기");
		btt4.setFont(new Font("돋움", Font.BOLD,10));
		btt4.setBounds(400,480, 60, 40);
		btt4.addActionListener(this);
		
		btt3 = new JButton();
		btt3.setIcon(new ImageIcon("./twice/tw_momo.jpg"));
		btt3.setBounds(45, 40, 150, 225);
		btt3.setBorderPainted(false);
		
		la1 = new JLabel("모  모");
		la1.setFont(new Font("휴먼둥근헤드라인",Font.BOLD,25));
		la1.setBounds(290, -40, 300, 300);
		
		la11 = new JLabel("Momo");
		la11.setFont(new Font("휴먼둥근헤드라인",Font.BOLD,25));
		la11.setBounds(285, 10, 300, 300);
		
		la2 = new JLabel("생일 : 1996-11-09");
		la2.setFont(new Font("휴먼모음T",Font.BOLD,14));
		la2.setBounds(55, 205, 200, 200);
		
		la3 = new JLabel("국적 : 일본");
		la3.setFont(new Font("휴먼모음T",Font.BOLD,14));
		la3.setBounds(55, 235, 200, 200);
		
		la4 = new JLabel("그룹명 : TWICE");
		la4.setFont(new Font("휴먼모음T",Font.BOLD,14));
		la4.setBounds(55, 265, 200, 200);
		
		la5 = new JLabel("파트 : 서브보컬,서브래퍼,메인댄서");
		la5.setFont(new Font("휴먼모음T",Font.BOLD,14));
		la5.setBounds(55, 295, 200, 200);
		
		la6 = new JLabel("SNS : https://www.instagram.com/twicetagram/");
		la6.setFont(new Font("휴먼모음T",Font.BOLD,14));
		la6.setBounds(55, 420, 380, 15);
		la6.addInputMethodListener(null);
		
		
		this.add(btt1); this.add(btt2); this.add(btt3); this.add(btt4);	//버튼,이미지
		this.add(la1); this.add(la2); this.add(la3); this.add(la4); this.add(la5); this.add(la6);				//글씨
		this.add(la11);
	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//종료시 자동종료
		this.setTitle("가수");									//화면 타이틀 이름
		this.setLayout(null);
		this.setSize(500,600);									//화면 사이즈
		this.setResizable(false);
		this.setVisible(true);
		this.setLocationRelativeTo(null); 		//화면 가운데에서 나오게하기.
		c.setBackground(new Color(255,20,20,20));		//백그라운드 색
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btt1) {
			JOptionPane.showMessageDialog(this, "걸그룹 페이지로 이동하시겠습니까?");
		}else if(e.getSource()==btt2) {
			JOptionPane.showMessageDialog(this, "처음 화면으로 돌아가시겠습니까?");
		}else if(e.getSource()==btt4){
			JOptionPane.showMessageDialog(this, "프로그램을 종료하시겠습니까?");
			dispose();
			System.exit(0);
		}
			
	}
	public static void main(String[] args) {
		new TW_momo();
	}
}

package dbvo;

import java.sql.Date;

//VO : Value Object 여러개의 데이터를 저장하는 것이 목적이다.
public class Custom {
	private String custom_id;
	private String name;
	private String email;
	private int age;
	private Date reg_date;
	
	//생성자
	public Custom(String custom_id, String name, String email, int age, Date reg_date) { 
		//Alt+Shift+s
		this.custom_id=custom_id;
		this.name=name;
		this.email=email;
		this.age=age;
		this.reg_date=reg_date;
	}
	//getter
	public String getCustom_id() {
		return custom_id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public int getAge() {
		return age;
	}
	public Date getReg_date() {
		return reg_date;
	}
	//setter
	public void setCustom_id(String custom_id) {
		this.custom_id = custom_id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}
	
	@Override
	public String toString() {
		return custom_id+":"+name+", "+email+", "+age+", "+"("+reg_date+")";
	}
}
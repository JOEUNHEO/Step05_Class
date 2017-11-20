package test.mypac;

public class Car {//객체 설계하기
	//일반 멤버 필드 정의하기
	public String name = "소나타";//public 접근 지정자이다.
	
	//일반 멤버 메소드 정의하기
	public void drive() {
		
		Car a = this;
		
		System.out.println("달려요~");
	}
	
	//일반 멤버 메소드 정의하기
	public void showInfo() {
		System.out.println("차의 이름:"+this.name);//+.name 해도 같음
	}
}

package test.main;

import test.mypac.Car;
import test.mypac.Gura;

/*
 * 	[ 클래스의 역할 ]
 * 
 * 	1. static 멤버를 가지고 있는 역할 (single tone? 오직 하나!)
 * 	2. 객체의 설계도 역할 //Java 는 Object Oriented Language
 * 	3. Data Type 역할 
 *  
 *  Java 에서는 클래스를 Data Type 으로 쓸 수 있기 때문에 Data Type 는 무한대이다.
 */
public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		// Car Type 객체의 참조값을 담을 지역변수 만들기
		Car car1 = null;
		// Car 객체를 생성하고 참조값을 변수에 대입하기
		car1 = new Car();
		
		// gura Type 객체의 참조값을 담을 지역변수 만들기
		Gura gura1 = null;
		// gura 객체를 생성하고 참조값을 변수에 대입하기
		gura1 = new Gura();
		
		//객체의 필드 참조
		String a = car1.name;
		//객체의 메소드 호출
		car1.drive();
	}
}

package test.main;

import test.mypac.Car;
import test.mypac.Gura;

/*
 * 	[ Ŭ������ ���� ]
 * 
 * 	1. static ����� ������ �ִ� ���� (single tone? ���� �ϳ�!)
 * 	2. ��ü�� ���赵 ���� //Java �� Object Oriented Language
 * 	3. Data Type ���� 
 *  
 *  Java ������ Ŭ������ Data Type ���� �� �� �ֱ� ������ Data Type �� ���Ѵ��̴�.
 */
public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("main �޼ҵ尡 ���� �Ǿ����ϴ�.");
		// Car Type ��ü�� �������� ���� �������� �����
		Car car1 = null;
		// Car ��ü�� �����ϰ� �������� ������ �����ϱ�
		car1 = new Car();
		
		// gura Type ��ü�� �������� ���� �������� �����
		Gura gura1 = null;
		// gura ��ü�� �����ϰ� �������� ������ �����ϱ�
		gura1 = new Gura();
		
		//��ü�� �ʵ� ����
		String a = car1.name;
		//��ü�� �޼ҵ� ȣ��
		car1.drive();
	}
}

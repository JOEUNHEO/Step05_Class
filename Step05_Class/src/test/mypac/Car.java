package test.mypac;

public class Car {//��ü �����ϱ�
	//�Ϲ� ��� �ʵ� �����ϱ�
	public String name = "�ҳ�Ÿ";//public ���� �������̴�.
	
	//�Ϲ� ��� �޼ҵ� �����ϱ�
	public void drive() {
		
		Car a = this;
		
		System.out.println("�޷���~");
	}
	
	//�Ϲ� ��� �޼ҵ� �����ϱ�
	public void showInfo() {
		System.out.println("���� �̸�:"+this.name);//+.name �ص� ����
	}
}

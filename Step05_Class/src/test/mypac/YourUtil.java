package test.mypac;

public class YourUtil {
	//static 멤버 필드 정의하기
	public static String version = "v1.0";
	
	//static 멤버 메소드
	public static void fileDown() {
		System.out.println("파일을 다운로드 해요!");
	}
	
	public static void fileUp() {
		System.out.println("파일을 업로드 해요!");
	}
	
	//static 멤버를 호출할 때는, 클래스명에 '.'을 넣어 호출하고 ex. 클래스명.멤버이름();
	//일반 멤버(static이 없는)는 new '클래스명'(); 을 생성하여 호출한다. 즉, 참조값으로 찾아가야한다.
}

package day01;

//Ctrl + N : New창(클래스, 패키지, ... 등 여러가지를 만드는 창)
//Ctrl + Shift + F : 자동정렬
public class PrintTask {
	public static void main(String[] args) {
		//------김사과 님의 정보------ 
		//이름: 김사과
		//나이: 10살
		//키 : 170,24cm
		//몸무게 : 66.24kg
		//성적 : C

		System.out.println("------" + "김사과" + "님의정보------");
		System.out.println("이름 : " + "김사과");
		System.out.println("나이:" + 10 + "살");
		//%.2f : 소수점 아래로 2째자리까지
		System.out.printf("키 : %.2fcm\n", 170.24);
		System.out.printf("몸무게 : %.2fcm\n", 66.24);
		System.out.println("성적:"+ 'C');
		
		//"1 + 1 = 2" 라는 문자열 값 자체가 필요한 경우
		 System.out.printf("%d + %d = %d\n",1,1,2);
		//String.format("%d + %d = %d",1 ,1, 2); 값 한개 그래서 프린트안에 들어갈 수 있음-> 하나에 만들어진 문자열
		
		System.out.println(String.format("%d + %d = %d",1 ,1, 2));
		
		int n = 2; 
		int a = 3; 
		int b = 4; 
		int c = 5; 
		System.out.printf(String.format("%%2d, %%%dd, %%d", n), a, b, c);

	}
}

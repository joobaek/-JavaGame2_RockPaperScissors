package StringC;

public class StringC {

	public static void main(String[] args) {

		String str1 = " Hello";
		String str2 = " World";
		String str3 = " Hello World!";
		
		
		System.out.println("str1 :" + str1); 
		System.out.println("str1 :" + str2);
		System.out.println("str1 :" + str3);
		System.out.println("str1의 크기는 " + str1.length() + "입니다"); 
		System.out.println("str2를 소문자로 바꾸면"+str2.toLowerCase()+ "입니다"); 
		System.out.println("str3의 l을 L로 바꾸면" + str3.replace('l','L') + "입니다");
		System.out.println("str2의 3번째 문자는" + str2.charAt(3) + "입니다");

		
		
	}

}

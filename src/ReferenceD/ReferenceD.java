package ReferenceD;

public class ReferenceD {

	public static void main(String[] args) {

		String str1 = "Hello";
		String str2 = new String("Hello");
		String str3 = str1;
		String str4 = str2;
		
		System.out.println("== ����");
		System.out.println("str1 == str1 " + (str1 == str1));
		System.out.println("str1 == str2 " + (str1 == str2));
		System.out.println("str1 == str3 " + (str1 == str3));
		System.out.println("str1 == str4 " + (str1 == str4));
		
		System.out.println();
		System.out.println("Equal ����");
		System.out.println("str1 equle str1 : " + (str1.equals(str1)));
		System.out.println("str1 equle str2 : " + (str1.equals(str2)));
		System.out.println("str1 equle str3 : " + (str1.equals(str3)));
		System.out.println("str1 equle str4 : " + (str1.equals(str4)));





	}

}

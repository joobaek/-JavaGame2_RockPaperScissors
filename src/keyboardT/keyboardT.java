package keyboardT;

import java.io.*;


public class keyboardT { 

	public static void main(String[] args) throws IOException 
	{

		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isr);
		
		String str1;
		System.out.println("�۾��� �Է��ϸ� �����մϴ�.");
		str1 = in.readLine(); 
		System.out.println(str1);
	}

}

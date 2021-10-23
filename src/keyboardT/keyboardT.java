package keyboardT;

import java.io.*;


public class keyboardT { 

	public static void main(String[] args) throws IOException 
	{

		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isr);
		
		String str1;
		System.out.println("글씨를 입력하면 따라합니다.");
		str1 = in.readLine(); 
		System.out.println(str1);
	}

}

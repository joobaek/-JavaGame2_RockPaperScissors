package RackPaperScissore;

import java.io.*;
import java.util.Random;


public class RackPaperScissore {

	public static void main(String[] args) throws IOException 
	
	{
		
		Random r = new Random(); // 랜덤 생성
		int Ram = Math.abs(r.nextInt() %3); // 0~3까지
		// Ram = 컴퓨터 랜덤값.
		// 0은 가위, 1은 바위 , 2는 보.
		//"가위 = a / 바위 = b / 보 = c"

		System.out.println("가위, 바위, 보 중 하나를 선택하시오");
		System.out.println("가위 = a / 바위 = b / 보 = c");
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isr);
		String u1;
		u1 = in.readLine();
		// u1 = 사람이 입력한 값
		
		if(u1.equals("a"))
		{
			if(Ram == 0) {System.out.println("비겼습니다. <컴퓨터:가위 사람:가위");  }
			if(Ram == 1) {System.out.println("컴퓨터 승. <컴퓨터:바위 사람:가위");  }
			if(Ram == 2) {System.out.println("사람 승. <컴퓨터:보 사람:가위");  }

			}
		else if(u1.equals("b"))
		{
			if(Ram == 0) {System.out.println("사람 승. <컴퓨터:가위 사람:바위");  }
			if(Ram == 1) {System.out.println("비겼습니다. <컴퓨터:바위 사람:바위");  }
			if(Ram == 2) {System.out.println("컴퓨터 승. <컴퓨터:보 사람:바위");  }
		}
		else if(u1.equals("c"))
		{
			if(Ram == 0) {System.out.println("컴퓨터 승. <컴퓨터:가위 사람:보");  }
			if(Ram == 1) {System.out.println("사람 승. <컴퓨터:바위 사람:보");  }
			if(Ram == 2) {System.out.println("비겼습니다. <컴퓨터:보 사람:보");  }
		}

	
	}

}

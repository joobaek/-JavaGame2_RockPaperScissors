package RackPaperScissore;

import java.io.*;
import java.util.Random;


public class RackPaperScissore {

	public static void main(String[] args) throws IOException 
	
	{
		
		Random r = new Random(); // ���� ����
		int Ram = Math.abs(r.nextInt() %3); // 0~3����
		// Ram = ��ǻ�� ������.
		// 0�� ����, 1�� ���� , 2�� ��.
		//"���� = a / ���� = b / �� = c"

		System.out.println("����, ����, �� �� �ϳ��� �����Ͻÿ�");
		System.out.println("���� = a / ���� = b / �� = c");
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isr);
		String u1;
		u1 = in.readLine();
		// u1 = ����� �Է��� ��
		
		if(u1.equals("a"))
		{
			if(Ram == 0) {System.out.println("�����ϴ�. <��ǻ��:���� ���:����");  }
			if(Ram == 1) {System.out.println("��ǻ�� ��. <��ǻ��:���� ���:����");  }
			if(Ram == 2) {System.out.println("��� ��. <��ǻ��:�� ���:����");  }

			}
		else if(u1.equals("b"))
		{
			if(Ram == 0) {System.out.println("��� ��. <��ǻ��:���� ���:����");  }
			if(Ram == 1) {System.out.println("�����ϴ�. <��ǻ��:���� ���:����");  }
			if(Ram == 2) {System.out.println("��ǻ�� ��. <��ǻ��:�� ���:����");  }
		}
		else if(u1.equals("c"))
		{
			if(Ram == 0) {System.out.println("��ǻ�� ��. <��ǻ��:���� ���:��");  }
			if(Ram == 1) {System.out.println("��� ��. <��ǻ��:���� ���:��");  }
			if(Ram == 2) {System.out.println("�����ϴ�. <��ǻ��:�� ���:��");  }
		}

	
	}

}

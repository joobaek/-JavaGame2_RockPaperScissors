package switchT;

public class switchT {

	public static void main(String[] args) {

		int num = 4;
		
		switch(num)
		{
		case 1:
			System.out.println("����� 1�Դϴ�.");
			break;
			
		case 2:
		case 3:
			System.out.println("����� 2�Ǵ� 3�Դϴ�.");
			break;
		default:
			System.out.println("����� 1,2,3�� �ƴմϴ�.");
			break;
			
		}
	}

}

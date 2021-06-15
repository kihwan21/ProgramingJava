package Stack;

import java.util.Scanner;

public class StackTest {
	public static void main (String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the size of the stack as an integer. >>");
		int n = scanner.nextInt();
		
		StringStack ss = new StringStack(n); // n���� ���ڿ��� ���� ������ ���� ����
		
		while(true) {
			System.out.print("Input a string >>");
			String str = scanner.next();
			if(str.equals("stop")) //����
				break;
			boolean res = ss.push(str); // ���ÿ� ����
			if(res == false) { // ������ �� �� ��� push()���� false�� ������
				System.out.println("Stack is full. It's unable to push.");
				System.out.println("If you want to quit enter 'stop' ");
			}
		}
		
		System.out.print("Popping all string of stack : ");
		int len = ss.length(); // ���� ���ÿ� ����� ���ڿ� ����
		for(int i=0; i<len; i++) { // ���ÿ� ����� ������ŭ �ݺ�
			System.out.print(ss.pop() + " "); // ���ÿ��� ���Ͽ� ���
		}
		scanner.close();
		
		//�� ���� �κ�
		
	}
}

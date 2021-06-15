package Stack;

import java.util.Scanner;

public class StackTest {
	public static void main (String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the size of the stack as an integer. >>");
		int n = scanner.nextInt();
		
		StringStack ss = new StringStack(n); // n개의 문자열이 저장 가능한 스택 생성
		
		while(true) {
			System.out.print("Input a string >>");
			String str = scanner.next();
			if(str.equals("stop")) //정지
				break;
			boolean res = ss.push(str); // 스택에 저장
			if(res == false) { // 스택이 꽉 찬 경우 push()에서 false를 리턴함
				System.out.println("Stack is full. It's unable to push.");
				System.out.println("If you want to quit enter 'stop' ");
			}
		}
		
		System.out.print("Popping all string of stack : ");
		int len = ss.length(); // 현재 스택에 저장된 문자열 개수
		for(int i=0; i<len; i++) { // 스택에 저장된 개수만큼 반복
			System.out.print(ss.pop() + " "); // 스택에서 팝하여 출력
		}
		scanner.close();
		
		//값 정렬 부분
		
	}
}

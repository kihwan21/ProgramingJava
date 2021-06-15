import java.util.Scanner;

class Employee {  //각 부서별 저장할 것들
	String EmployeeName;
	String DPT;
	int CompanyNum;
	String POS;
	int Rank;

	Employee(String EmployeeName, String DPT, int CompanyNum, String POS, int Rank){
		this.EmployeeName = EmployeeName;
		this.DPT = DPT;
		this.CompanyNum = CompanyNum;
		this.POS = POS;
		this.Rank = Rank;
	}
}


public class Worker {

	public static void main(String[] args) {
		System.out.println("직원의 이름, 부서, 사번, 직책, 업무 성적을 입력하시오.");
		Scanner scanner = new Scanner(System.in);
		String EmployeeName = scanner.next();
		String DPT = scanner.next();
		String CompanyNum = scanner.next();
		String POS = scanner.next();
		String Rank = scanner.next();
		
		while(true) { // 계속 반복			
			//선 표시
			for(int i=1; i<=10; i++) {
				System.out.print("=");
			}
			
			System.out.println();
			System.out.print("이름:");
			System.out.println(EmployeeName);
			System.out.print("부서:");
			System.out.println(DPT);
			System.out.print("사번:");
			System.out.println(CompanyNum);
			System.out.print("직책:");
			System.out.println(POS);
			System.out.print("업무성적:");
			System.out.println(Rank);
		
			
			for(int i=1; i<=10; i++) {
				System.out.print("=");
			}
			
			//여기에다 넣어보기
			System.out.println();
			System.out.println("직원의 이름, 부서, 사번, 직책, 업무 성적을 입력하시오.");
			
			System.out.println();
			
			
			
			EmployeeName = scanner.next();  //입력 값 초기화 부분  scanner가 계속 사용자의 입력을 받고 있어서 quit를 입력하더라도 끝까지 입력을 끝내야 종료되는 문제가 있음.
			DPT = scanner.next();
			CompanyNum = scanner.next();
			POS = scanner.next();
			Rank = scanner.next();
			
			
			
			if(EmployeeName.equals("quit")) { // quit와 같다면 while문을 빠져나옴
				scanner.close();
				break;
			}
			else if(DPT.equals("quit")) { // quit와 같다면 while문을 빠져나옴
				scanner.close();
				break;
			}
			else if(CompanyNum.equals("quit")) { // quit와 같다면 while문을 빠져나옴
				scanner.close();
				break;
			}
			else if(POS.equals("quit")) { // quit와 같다면 while문을 빠져나옴
				scanner.close();
				break;
			}
			else if(Rank.equals("quit")) { // quit와 같다면 while문을 빠져나옴
				scanner.close();
				break;
			}
			System.out.println();
			System.out.println("직원의 이름, 부서, 사번, 직책, 업무 성적을 입력하시오.");
			
			System.out.println();
				
		}
		System.out.println("확인하고 싶은 직원 이름 입력"); //break에서 탈출하면 출력
		String check = scanner.next();
		if(check.equals("None")) {
			System.out.println("Exit Program");
			scanner.close();
		}
		// 여기서 입력 받은거 내놓기
		
		
		
	}
}






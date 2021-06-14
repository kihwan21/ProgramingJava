import java.util.Scanner;

class Employee {
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
		
		while(true) {
			if(scanner.equals("stop")) {
				System.out.println("=> Program is terminated. Bye!!");
				scanner.close();
				break;
			}
			
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
			System.out.print("업무 성적:");
			System.out.println(Rank);
			
			for(int i=1; i<=10; i++) {
				System.out.print("=");
			}
			
				
				
		}
	}
}



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
		while(true) {
			System.out.println("직원의 이름, 부서, 사번, 직책, 업무 성적을 입력하시오.");
			Scanner scanner = new Scanner(System.in);
			String name = scanner.next();
			String department = scanner.next();
			String num = scanner.next();
			String position = scanner.next();
			String score = scanner.next();
			
			///한 싸이클
			for(int i=1; i<=10; i++) {
				System.out.print("=");
			}
			System.out.println();
			System.out.print("이름:");
			System.out.println(name);
			System.out.print("부서:");
			System.out.println(department);
			System.out.print("사번:");
			System.out.println(num);
			System.out.print("직책:");
			System.out.println(position);
			System.out.print("업무성적:");
			System.out.println(score);
			
			for(int i=1; i<=10; i++) {
				System.out.print("=");
			}
			System.out.println();
			/// 싸이클 끝.
			
			
			///싸이클 시작
			System.out.println("직원의 이름, 부서, 사번, 직책, 업무 성적을 입력하시오.");
			String EmployeeName = scanner.next();
			String DPT = scanner.next();
			String CompanyNum = scanner.next();
			String POS = scanner.next();
			String Rank = scanner.next();
			
			System.out.println();
			System.out.print("이름:");
			System.out.println(name);
			System.out.print("부서:");
			System.out.println(department);
			System.out.print("사번:");
			System.out.println(CompanyNum);
			System.out.print("직책:");
			System.out.println(POS);
			System.out.print("업무 성적:");
			System.out.println(Rank);
			
			for(int i=1; i<=10; i++) {
				System.out.print("=");
			}
			System.out.println();
			
			
			if(scanner.equals("stop")) {
				scanner.close();
				break;
			}
			
		}
	}
}


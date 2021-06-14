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
			if(scanner.equals("quit")) { // quit와 같다면 while문을 빠져나옴
				scanner.close();
				break;
			}
			
			for(int i=1; i<=10; i++) {
				System.out.print("=");
			}
			
			//초기화 부분
			EmployeeName = scanner.next();  //입력 값 초기화 부분
			DPT = scanner.next();
			continue;
			
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
			
			System.out.println();
			System.out.println("직원의 이름, 부서, 사번, 직책, 업무 성적을 입력하시오.");
			scanner.reset(); //안에 입력된 값을 리셋함
			System.out.println();
				
		}
		System.out.println("Exit Program"); //break에서 탈출하면 출력
	}
}


//else {
//	System.out.println(num +"=> dosen't exist in the dictionary");
//	System.out.print("Input word[if you want to quit, input \"stop\"]>>");
//	num = scanner.next();  //입력 값 초기화 부분
//	continue;
//}


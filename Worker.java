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
			System.out.println("������ �̸�, �μ�, ���, ��å, ���� ������ �Է��Ͻÿ�.");
			Scanner scanner = new Scanner(System.in);
			String name = scanner.next();
			String department = scanner.next();
			String num = scanner.next();
			String position = scanner.next();
			String score = scanner.next();
			
			///�� ����Ŭ
			for(int i=1; i<=10; i++) {
				System.out.print("=");
			}
			System.out.println();
			System.out.print("�̸�:");
			System.out.println(name);
			System.out.print("�μ�:");
			System.out.println(department);
			System.out.print("���:");
			System.out.println(num);
			System.out.print("��å:");
			System.out.println(position);
			System.out.print("��������:");
			System.out.println(score);
			
			for(int i=1; i<=10; i++) {
				System.out.print("=");
			}
			System.out.println();
			/// ����Ŭ ��.
			
			
			///����Ŭ ����
			System.out.println("������ �̸�, �μ�, ���, ��å, ���� ������ �Է��Ͻÿ�.");
			String EmployeeName = scanner.next();
			String DPT = scanner.next();
			String CompanyNum = scanner.next();
			String POS = scanner.next();
			String Rank = scanner.next();
			
			System.out.println();
			System.out.print("�̸�:");
			System.out.println(name);
			System.out.print("�μ�:");
			System.out.println(department);
			System.out.print("���:");
			System.out.println(CompanyNum);
			System.out.print("��å:");
			System.out.println(POS);
			System.out.print("���� ����:");
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


import java.util.Scanner;

class Employee {  //�� �μ��� ������ �͵�
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
		System.out.println("������ �̸�, �μ�, ���, ��å, ���� ������ �Է��Ͻÿ�.");
		Scanner scanner = new Scanner(System.in);
		String EmployeeName = scanner.next();
		String DPT = scanner.next();
		String CompanyNum = scanner.next();
		String POS = scanner.next();
		String Rank = scanner.next();
		
		while(true) { // ��� �ݺ�			
			//�� ǥ��
			for(int i=1; i<=10; i++) {
				System.out.print("=");
			}
			
			System.out.println();
			System.out.print("�̸�:");
			System.out.println(EmployeeName);
			System.out.print("�μ�:");
			System.out.println(DPT);
			System.out.print("���:");
			System.out.println(CompanyNum);
			System.out.print("��å:");
			System.out.println(POS);
			System.out.print("��������:");
			System.out.println(Rank);
		
			
			for(int i=1; i<=10; i++) {
				System.out.print("=");
			}
			
			//���⿡�� �־��
			System.out.println();
			System.out.println("������ �̸�, �μ�, ���, ��å, ���� ������ �Է��Ͻÿ�.");
			
			System.out.println();
			
			
			
			EmployeeName = scanner.next();  //�Է� �� �ʱ�ȭ �κ�  scanner�� ��� ������� �Է��� �ް� �־ quit�� �Է��ϴ��� ������ �Է��� ������ ����Ǵ� ������ ����.
			DPT = scanner.next();
			CompanyNum = scanner.next();
			POS = scanner.next();
			Rank = scanner.next();
			
			
			
			if(EmployeeName.equals("quit")) { // quit�� ���ٸ� while���� ��������
				scanner.close();
				break;
			}
			else if(DPT.equals("quit")) { // quit�� ���ٸ� while���� ��������
				scanner.close();
				break;
			}
			else if(CompanyNum.equals("quit")) { // quit�� ���ٸ� while���� ��������
				scanner.close();
				break;
			}
			else if(POS.equals("quit")) { // quit�� ���ٸ� while���� ��������
				scanner.close();
				break;
			}
			else if(Rank.equals("quit")) { // quit�� ���ٸ� while���� ��������
				scanner.close();
				break;
			}
			System.out.println();
			System.out.println("������ �̸�, �μ�, ���, ��å, ���� ������ �Է��Ͻÿ�.");
			
			System.out.println();
				
		}
		System.out.println("Ȯ���ϰ� ���� ���� �̸� �Է�"); //break���� Ż���ϸ� ���
		String check = scanner.next();
		if(check.equals("None")) {
			System.out.println("Exit Program");
			scanner.close();
		}
		// ���⼭ �Է� ������ ������
		
		
		
	}
}






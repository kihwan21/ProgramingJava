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
			if(EmployeeName.equals("quit")) { // quit�� ���ٸ� while���� ��������
				scanner.close();
				break;
			}
			if(DPT.equals("quit")) { // quit�� ���ٸ� while���� ��������
				scanner.close();
				break;
			}
			if(CompanyNum.equals("quit")) { // quit�� ���ٸ� while���� ��������
				scanner.close();
				break;
			}
			if(POS.equals("quit")) { // quit�� ���ٸ� while���� ��������
				scanner.close();
				break;
			}
			if(Rank.equals("quit")) { // quit�� ���ٸ� while���� ��������
				scanner.close();
				break;
			}
			
			
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
			System.out.print("���� ����:");
			System.out.println(Rank);
			
			for(int i=1; i<=10; i++) {
				System.out.print("=");
			}
			
			EmployeeName = scanner.next();  //�Է� �� �ʱ�ȭ �κ�
			DPT = scanner.next();
			CompanyNum = scanner.next();
			POS = scanner.next();
			Rank = scanner.next();
			
			System.out.println();
			System.out.println("������ �̸�, �μ�, ���, ��å, ���� ������ �Է��Ͻÿ�.");
			
			System.out.println();
			
			//�ʱ�ȭ �κ�
			
			
				
		}
		System.out.println("Exit Program"); //break���� Ż���ϸ� ���
	}
}


//else {
//	System.out.println(num +"=> dosen't exist in the dictionary");
//	System.out.print("Input word[if you want to quit, input \"stop\"]>>");
//	num = scanner.next();  //�Է� �� �ʱ�ȭ �κ�
//	continue;
//}

//int array[] = new int[]; //�迭����
//
//for(int i=0; i<array.length; i++) {
//	array[i]=(int)(Math.random()*10+1);
//	System.out.print(array[i]+"\t");
//	}
//	System.out.println("");


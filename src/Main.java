import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//�������� ��������, ����� �������� N!*K!/(N-K)! �� ������ N � K. *


		Scanner scan = new Scanner(System.in);	

		int N = scan.nextInt();
		int K = scan.nextInt();
		
		int aN = 1;
		
		for(int i=1;i<=N;i++){
			
		aN=aN*i;
		
		}
		
		int aK=1;
		
		for(int i =1 ; i<=K; i++){
			
			aK=aK*i;
			
		}
		int X=(N-K);
		for(int i=1; i<=(N-K); i++){
			X=X*i;
			
			
		}
		
		System.out.println((double) aN*aK/(double)X);
			
			
		}

}

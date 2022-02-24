import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int H,M;
		
		Scanner a = new Scanner (System.in);
		H = a.nextInt();
		M = a.nextInt();
		
		if(M>=45) {
			M=M-45;
		}
		else {
			M=M+15;
			if(H>0) {
				H=H-1;
			}
			else {
				H=23;
			}
		}
		System.out.println(H);
		System.out.println(M);
		
	}

}

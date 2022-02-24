import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int x,y;
		int q;
		Scanner a = new Scanner (System.in);
		x = a.nextInt();
		y = a.nextInt();
		
		if(x>0) {
			if(y>0) {
				q=1;
			}
			else {
				q=4;
			}
		}	
		else {
			if(y>0) {
				q=2;
			}
			else {
				q=3;
			}
		}
		System.out.println(q);	
	}

}

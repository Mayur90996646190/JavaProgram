package BasicJavaProgram;

public class P15 {
	public static void main(String[] args) {
		int n = 5;
		int sp = n/2;
		int star = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < sp; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j < star; j++) {
				System.out.print("* ");
			}
			System.out.println();
			if(i<n/2) {
				sp--;
				star = star + 2;
			}
			else
			{
				sp++;
				star = star -2;
			}
		}
		
	}
}

package BasicJavaProgram;

public class P6 {
	public static void main(String[] args) {
		int n = 4;
		for (int i = 0; i < n; i++) {
			int k = 1;
			char ch = 'A';
			int a= 1;
			for (int j = 0; j < n; j++) {
				if(j%2==1) {
					System.out.print(ch+++" ");
				}
				else
				{
					System.out.print(a++ + " ");
				}
			}
			System.out.println();
		}
	}
}

package BasicJavaProgram;

public class P5 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 0; i < n; i++) {
			char ch = 'a';
			int a = 1;
			for (int j = 0; j < n; j++) {
				if(i%2==1) {
					System.out.print(ch++ + " ");
				}
				else
					System.out.print(a++ + " ");
			}
			System.out.println();
		}
	}
}

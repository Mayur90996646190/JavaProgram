package BasicJavaProgram;

public class P2 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 0; i < n; i++) {
			int a = 5;
			for (int j = 0; j < n; j++) {
				System.out.print(a-- + " ");
			}
			System.out.println();
		}
	}
}

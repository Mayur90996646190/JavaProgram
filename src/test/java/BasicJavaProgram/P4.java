package BasicJavaProgram;

public class P4 {
	public static void main(String[] args) {
		int row = 4;
		int col = 5;
		int a = 4;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(a+" ");
			}
			a--;
			System.out.println();
		}
	}
}

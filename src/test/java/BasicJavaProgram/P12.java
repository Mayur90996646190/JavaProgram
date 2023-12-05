package BasicJavaProgram;

public class P12 {
	public static void main(String[] args) {
		int n = 4;
		int a = 1;
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < n; j++) {
				if(i>=j) {
					a++;
				}
			}
			int k = a-1;
			for (int j = 0; j < n; j++) {
				if(i>=j) {
					System.out.print(k-- +" ");
				}
			}
			System.out.println();
		}
	}
}

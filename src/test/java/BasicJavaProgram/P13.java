package BasicJavaProgram;

public class P13 {
	public static void main(String[] args) {
		int n = 5;
		int k = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i>=j) {
					if(i%2==0) {
						System.out.print(k +" ");
					}
					k++;
				}
			}
			int l = k - 1;
			for (int j = 0; j < n; j++) {
				if(i>=j) {
					if(i%2==1) {
						System.out.print(l-- +" ");
					}
				}
			}
			System.out.println();
		}
	}
}

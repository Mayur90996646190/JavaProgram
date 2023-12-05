package BasicJavaProgram;

public class OddPrint {
	public static void main(String[] args) {
		int a = 25;
		int b = 75;
		while(a<b) {
			if(a%2==1) {
				System.out.println(a);
			}
			a++;
		}
	}
}

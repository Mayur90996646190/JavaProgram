package BasicJavaProgram;

public class PrintUnitDigits {
	public static void main(String[] args) {
		int a = 123456789;
		while(a>0) {
			System.out.println(a%10);
			a = a/10;
		}
	}
}

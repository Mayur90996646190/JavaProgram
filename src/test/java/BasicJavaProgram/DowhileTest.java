package BasicJavaProgram;

public class DowhileTest {
	public static void main(String[] args) {
		int a = 1;
		do {
			System.out.println(a);
			a++;
		}while(a==10);
		
		System.out.println("From 2nd loop");
		int b = 1;
		do {
			System.out.println(b);
			b++;
		}while(b<=10);
	}
}

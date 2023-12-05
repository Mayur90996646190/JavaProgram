package BasicJavaProgram;

public class Recurssion {
	public static void print(int n) {
		System.out.println(n);
		n--;
		
		if(n==0) {
			return;
		}
		print(n);
	}
	public static void main(String[] args) {
		System.out.println("From main");
		print(4);
	}
}

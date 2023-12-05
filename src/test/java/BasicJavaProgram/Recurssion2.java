package BasicJavaProgram;

public class Recurssion2 {
	public static void main(String[] args) {
		print(1);
	}
	
	public static void print(int n) {
		System.out.println(n);
		n++;
		if(n>5) {
			return;
		}
		print(n);
	}
}

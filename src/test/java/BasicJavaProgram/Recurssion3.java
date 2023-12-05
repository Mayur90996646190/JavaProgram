package BasicJavaProgram;

public class Recurssion3 {
	public static void main(String[] args) {
		print(50);
	}
	public static void print(int n) {
		if(n%2==0) {
			System.out.println(n);
		}
		n++;
		if(n>100) {
			return;
		}
		print(n);
	}
}

package BasicJavaProgram;

public class SPYNum {
	public static void main(String[] args) {
		int num = 123;
		int sum = 0;
		int pro = 1;
		while (num > 0) {
			int rem = num % 10;
			sum = sum + rem;
			pro = pro * rem;
			num /= 10;
		}
		if (sum == pro) {
			System.out.println("Is a spy Num");
		}
	}
}

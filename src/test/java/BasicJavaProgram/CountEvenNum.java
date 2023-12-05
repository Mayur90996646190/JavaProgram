package BasicJavaProgram;

public class CountEvenNum {
	public static void main(String[] args) {
		int num = 422224;
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		System.out.println(count);
	}
}

package BasicJavaProgram;

public class SumOfNumbers {
	public static void main(String[] args) {
		int a = 1;
		int sum = 0;

		while(a<=10)
		{
			sum+=a;
			a++;
		}
		System.out.println(sum);
	}
}

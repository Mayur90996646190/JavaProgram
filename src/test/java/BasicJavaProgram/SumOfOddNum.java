package BasicJavaProgram;

public class SumOfOddNum {
	public static void main(String[] args) {
		int a = 1;
		int sum = 0;

		while(a<=10)
		{
			if(a%2==1){
			sum+=a;
			}
			a++;
		}
		System.out.println(sum);
	}
}

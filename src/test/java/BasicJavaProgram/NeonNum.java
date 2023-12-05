package BasicJavaProgram;

public class NeonNum {
	public static void main(String[] args) {
		int num = 9;
		int temp = num;
		int sq = num * num;
		int sum = 0;
		while (sq > 0) {
			sum = sum + sq % 10;
			sq = sq / 10;
		}
		if(sum==temp)
		System.out.println(sum);
	}
}

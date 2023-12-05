package BasicJavaProgram;

public class PerfectNum {
	public static void main(String[] args) {
		int num = 6;
		int sum = 0;
		int i = 1;
		while(i<num){
		if(num%i==0){
		sum = sum + i;
		}
		i++;
		}
		if(sum==num)
		{
		System.out.println("Perfect Num");
		}
	}
}

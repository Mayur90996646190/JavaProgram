package BasicJavaProgram;

public class Armstrong {
	public static void main(String[] args) {
		int num = 153;
		int temp = num;
		int temp1 = num;
		int count = 0;
		int sum  = 0;
		while(num>0)
		{
		num=num/10;
		count++;
		}
		while(temp>0){
		int rem = temp%10;
		int pow = 1;
		int i =0;
		while(i<count){
		pow = pow * rem;
		i++;
		}
		sum = sum + pow;
		temp=temp/10;
		}
		if(sum == temp1)
		{
		System.out.println("Is a ArmStrong Num");
		}
		else
		{
		System.out.println("not a armstrong Num");
		}
	}
}

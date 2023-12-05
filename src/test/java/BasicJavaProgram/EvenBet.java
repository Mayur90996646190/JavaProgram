package BasicJavaProgram;

public class EvenBet {
	public static void main(String[] args) {
		int a = 1;
		int b = 50;
		while(a<b) {
			if(a%2==0) {
				System.out.println(a);
			}
			a++;
		}
	}
}

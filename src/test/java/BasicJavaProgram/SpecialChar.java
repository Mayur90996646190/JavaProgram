package BasicJavaProgram;

public class SpecialChar {
	public static void main(String[] args) {
		char ch= '%';
		if(!(ch>='a' && ch<='z' || ch<='A' && ch>='Z' || ch>=0 && ch<=9)) {
			System.out.println("Is a special character");
		}
	}
}

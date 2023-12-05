package BasicJavaProgram;

public class Recurssion4 {
	public static void main(String[] args) {
		String s = "tyss";
		int count = s.length()-1;
		rev(s,count);
	}
	public static void rev(String s,int i) {
		System.out.print(s.charAt(i--));
		if(i<0) {
			return ;
		}
		rev(s,i);
	}
}

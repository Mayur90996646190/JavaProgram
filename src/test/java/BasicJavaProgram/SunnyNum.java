package BasicJavaProgram;

public class SunnyNum {
	public static void main(String[] args) {

		int num = 24;
		int i = 1;
		int count = 0;
		while (i < num) {

			if (i * i == num + 1) {
				count++;
				break;
			}
			i++;
		}
		if (count == 1) {
			System.out.println("Sunny num");
		}
		else
		{
			System.out.println("is not a sunny num");
		}

	}
}

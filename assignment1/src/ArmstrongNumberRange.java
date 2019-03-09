
public class ArmstrongNumberRange {
	public static void main(String[] args) {
		int n;
		

		for (int i = 100; i <= 999; i++) {
			n = i;
			int a;
			int b = 0;
			while (n > 0) {
				a = n % 10;
				b = b + (a * a * a);
				n = n / 10;
			}
			if (i == b) {
				System.out.println(i);

			}
		}
	}
}

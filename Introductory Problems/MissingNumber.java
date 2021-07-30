import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();

		long total = 0;
		for (int i = 0; i < n - 1; i++)
			total = total + sc.nextLong();
		long sum = (n * (n + 1)) / 2;
		System.out.println(sum - total);

		sc.close();
	}
}

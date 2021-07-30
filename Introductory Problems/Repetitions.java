import java.util.Scanner;

public class Repetitions {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		int max = 1;
		int count = 1;

		for (int i = 0, j = 1; i < s.length() - 1; i++, j++) {
			if (s.charAt(i) == s.charAt(j)) {
				count = count + 1;
				if (count > max)
					max = count;
			} else {
				count = 1;
			}
		}
		
		System.out.println(max);
		sc.close();
	}
}

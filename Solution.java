import java.util.Scanner;


//change class to 'Main'
public class Solution {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = 1;
		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int x = fs.nextInt(), y = fs.nextInt();
			int f1 = x / 10;
			if (x % 10 != 0) {
				f1++;
			}
			int f2 = y / 10;
			if (y % 10 != 0) {
				f2++;
			}
			System.out.println(Math.abs(f2 - f1));
		}
		fs.close();
	}
}

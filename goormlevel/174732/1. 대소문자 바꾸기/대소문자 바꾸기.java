import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		scan.nextLine(); // 줄 바꿈

		String S = scan.nextLine();
		char[] S2 = S.toCharArray();

		for (int i = 0; i < N; i++) {
			char c = S2[i];

			if ('A' <= c && c <= 'Z') {
				c += 32; // 대문자 → 소문자
			} else if ('a' <= c && c <= 'z') {
				c -= 32; // 소문자 → 대문자
			}

			System.out.print(c);
		}
	}
}

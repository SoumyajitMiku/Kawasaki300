package MyPractice;

public class SubstringWithMaxLength {

	public static void main(String[] args) {

		String s = "welcometotyss";
		// o/p: w el com e to tys s
		int j = 1;
		int k = 2;
		// String res = "";

		for (int i = 0; i < s.length();) {
			try {
				if (s.substring(i, j).length() > 3) {
					k = k + 2;
					j = k;
					k = 2;

				}

				else {

					System.out.println(s.substring(i, j));

					i = j;
					j = j + k;
					k++;

				}
			} catch (Exception e) {
				System.out.println(s.charAt(s.length() - 1));
				break;

			}
		}
	}

}

package h3;

public class H3_main {
	public static void main(String[] args) {
		int i = 200;
		int j = 300;
		int k = -10;

		boolean A1 = i > j;
		boolean A2 = i > 200;
		boolean A3 = j > 100;

		if (A1 && !A2 && !A3) {
			k = 1;
		} else if (A1 && A2 && !A3) {
			k = 2;
		} else if (A1 && A2 && A3) {
			k = 3;
		} else if (!A1 && !A2 && !A3) {
			k = 4;
		}

		System.out.println("i = " + i + "j = " + j);

		if (A1 || A2 || A3) {
			System.out.println("k = " + k + " -> veraendert");
		} else
			System.out.println("k =" + k);

		if (A1) {
			System.out.println("Ausdruck 1 (i > j) wahr");
		} else
			System.out.println("Ausdruck 1 (i > j) falsch");

		if (A2) {
			System.out.println("Ausdruck 2 (i > 200) wahr");
		} else
			System.out.println("Ausdruck 2 (i > 200) falsch");

		if (A3) {
			System.out.println("Ausdruck 3 (j > 100) wahr");
		} else
			System.out.println("Ausdruck 3 (j > 100) falsch");
	}

}

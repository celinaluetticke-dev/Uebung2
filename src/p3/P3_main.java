package p3;

public class P3_main {
	public static void main(String[] args) {
		int i = 1;
		int j = 2;
		int k = 3;
		
		// getestet mit:
		// i=4, j=2, k=8 -> B, C
		// i=10, j=9, k=8 -> 
		// i=7, j=9, k=1 -> A
		
		if (i < j) {
			System.out.println("A");
		}
		if (i < k) {
			System.out.println("B");
		}
		if (j < k) {
			System.out.println("C");
		}
	}

}

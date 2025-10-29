package h2;

public class H2_main {
	public static void main(String[] args) {
		int i = 9;
		int j = 4;
		int k = 10;
		
		// getestet mit:
		// i=10, j=7,k=2 -> min=2, max=10
		//i=45,j=600,k=1 -> min=1 ,max=600
		//i=9,j=4,k=10 -> min=4 ,max=10
		
		int min = i;
		int max = k;
		
	
		if (j < min) {
			min = j;
		}
		if (k < min) {
			min = k;
		}
		if (i > max) {
			max = i;
		}
		if (j > max) {
			max = j;
		}
		
		
		System.out.println("Minimum = " + min);
		System.out.println("Maximum = " + max);
	}

}

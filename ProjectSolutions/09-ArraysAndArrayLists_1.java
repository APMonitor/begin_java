public class Main {

	public static void main(String[] args) {
		int[] ages = {4, 7, 16, 32, 27, 12, 45, 3, 8, 4, 68, 19, 19, 84};
		
		for (int i = 0; i < 14; i++) {
			if (ages[i] < 18) {
				System.out.println(ages[i]);
			}
		}
	}

}
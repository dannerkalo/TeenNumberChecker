package teennumberchecker;

public class TeenNumberChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// hasTeen(9,99,19);
		// hasTeen(23,15,42);
		//hasTeen(22, 23, 34);
		isTeen(13);
	}

	public static boolean hasTeen(int x, int y, int z) {
		//
		int min = 13;
		int max = 19;
		if ((x >= min && x <= max) || (y >= min && y <= max) || (z >= min && z <= max)) {
			System.out.println("Has > x = " + x + " y = " + y + " x = " + z);
			return true;
		}
		System.out.println("No > x = " + x + " y = " + y + " x = " + z);
		return false;
	}
	
	public static boolean isTeen(int x) {
		//
		int min = 13;
		int max = 19;
		if (x >= min && x <= max) {
			System.out.println("Has > x = " + x);
			return true;
		}
		System.out.println("No > x = " + x);
		return false;
	}

}

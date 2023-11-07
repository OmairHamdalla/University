public class Main {
	public static void main(String[] args) {
		for(int x = 1; x <= 4; x++) {
			for(int y = 1; y <= 4; y++) {
				if (x == y) continue;
				else
					for(int z = 1; z <= 4; z++) {
						if (y==z || x==z) continue;
						else System.out.println(x + "" + y + "" + z);
					}
			}
		}

	}
}

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {

		Random random = new Random();

		int nextInt = random.nextInt();
		System.out.println(nextInt);
		int nextInt2 = random.nextInt(10);
		System.out.println(nextInt2);

	}

}

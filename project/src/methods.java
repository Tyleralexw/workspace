import org.teachingextensions.logo.Tortoise;

public class methods {
	public static void main(String[] args) {
		new methods();
	}

	methods() {
		for (int i = 0; i < 100; i++) {
			square(i);
			triangle(i);
		}

	}

	void square(int side) {
		for (int i = 0; i < 4; i++) {
			Tortoise.setSpeed(10);
			Tortoise.move(side);
			Tortoise.turn(90);

		}

	}

	void triangle(int side) {

		for (int i = 0; i < 4; i++) {
			Tortoise.setSpeed(10);
			Tortoise.move(side);
			Tortoise.turn(120);

		}

	}

}

import java.util.Random;


public class cookie {

	public static void main(String[] args) {
	 
		String one = "you will die in a car";
		String two = "you will die on a bus";
		String three = "you will die on a boat";
		String four = "you wont die";
		int random = new Random().nextInt(4);
		if(random == 0){
		System.out.println(one);
		}
		if(random == 1){
			System.out.println(two);
			}
		if(random == 2){
			System.out.println(three);
			}
		if(random == 3){
			System.out.println(four);
			}
	}

}


public class fibonacci {

	public static void main(String[] args) {
		
		
		int first = 0;
		int second = 1;
		int next = 0;
		for (int i = 1; i <  10; i++) {
			next = first + second;
			first  = second;
			second = next;
			System.out.println(next);
			
		}

	}

}

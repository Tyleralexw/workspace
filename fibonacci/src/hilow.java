import java.util.Random;

import javax.swing.JOptionPane;


public class hilow {

	public static void main(String[] args) {
	 int number = new Random().nextInt(100);
		while(true){
			int guess = Integer.parseInt(JOptionPane.showInputDialog("Input a number"));
			if (guess > number) {
				System.out.println("to high");
			}
			if (guess < number) {
				System.out.println("to low");
			}
		}
			
		
			
		
		

	}

}

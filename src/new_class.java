import java.util.Random;

import javax.swing.JOptionPane;

public class new_class {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("whats your name");
		Random randy = new Random();
	int number = randy.nextInt(100);
		for(int i = number; i >= 1 ; i--) {
			System.out.println(input + " " + i);
		}
		
	}
}

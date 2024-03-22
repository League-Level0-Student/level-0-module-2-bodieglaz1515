package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class MEOW {

	public static void main(String[] args) {
		String meow = ""; 
		Random randomChoice = new Random(); 
		for (int meow1=0; meow1<5; meow1 ++) {	

			int number = randomChoice.nextInt(100);
			meow += number+" ";
		}
		JOptionPane.showMessageDialog(null, meow );
	}

}



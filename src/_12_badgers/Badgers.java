package _12_badgers;

import javax.swing.JOptionPane;

public class Badgers {
	public static void main(String[] args) {
		for (int b=0;b<4;b++) {
		for (int a=0;a<4;a++) {
			for (int i=0;i<3;i++) {
				System.out.print("Badger ");
				if (i==2) {
					System.out.println();
				}
			}
			if (a==3) {
				for (int i=0; i<2; i++) {
					System.out.print("Mushroom ");
					System.out.println();
				}
			}
		}
		}
	}
}

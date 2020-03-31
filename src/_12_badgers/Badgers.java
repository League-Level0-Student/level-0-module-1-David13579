package _12_badgers;

import javax.swing.JOptionPane;

public class Badgers {
	public static void main(String[] args) {
		String e = "Badger";
		String f = "Mushroom";
		String g = "Snake"; 
		for(int c=0;c<4;c++) {
		for (int b=0;b<4;b++) {
		for (int a=0;a<4;a++) {
			for (int i=0;i<3;i++) {
				System.out.print(e+" ");
				if (i==2) {
					System.out.println();
				}
			}
			if (a==3) {
				for (int i=0; i<2; i++) {
					System.out.print(f+" ");
					if (i==1) {
					System.out.println();
					
				}
			}
		}
		}
		if (b==3) {
			for (int i = 0; i < 2; i++) {
				System.out.print("A "+g+" ");
				if (i==1) {
					System.out.println();
				}
			}
			System.out.print(g+"! A "+g);
			System.out.println();
			System.out.print("Ohhh, its a "+g);
		}
	}
	}
}
}

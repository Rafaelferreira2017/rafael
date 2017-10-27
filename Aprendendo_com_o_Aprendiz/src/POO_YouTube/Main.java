package POO_YouTube;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		IFTube tube = new IFTube();
		while(true) {
			tube.menu(new Scanner(System.in));
		}
	}
	
}
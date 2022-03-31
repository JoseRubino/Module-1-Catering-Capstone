package com.techelevator;

import com.techelevator.view.Menu;

public class CaTEringCapstoneCLI {



	private Menu menu;

	private static final String display_catering_items = "D";

	private static final String purchase = "P";

	private static final String exit = "E";

	public CaTEringCapstoneCLI(Menu menu) {
		this.menu = menu;
	}

	public static void main(String[] args) {
		Menu menu = new Menu();
		CaTEringCapstoneCLI cli = new CaTEringCapstoneCLI(menu);
		cli.run();
	}

	public void run() {
		while (true) {


		}
	}
}

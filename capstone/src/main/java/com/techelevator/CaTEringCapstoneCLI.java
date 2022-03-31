package com.techelevator;

import com.techelevator.view.Menu;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CaTEringCapstoneCLI {


	private Menu menu;

	private static final String Display_Catering_Items = "D";

	private static final String Purchase = "P";

	private static final String Exit = "E";

	public CaTEringCapstoneCLI(Menu menu) {
		this.menu = menu;
	}

	Transaction account = new Transaction();


	Map<String, CateringItem> cateringInventory;
	Scanner scanner = new Scanner(System.in);
	PurchaseLog newPurchaseLog = new PurchaseLog();

	public static void main(String[] args) throws IOException {
		Menu menu = new Menu();
		CaTEringCapstoneCLI cli = new CaTEringCapstoneCLI(menu);
		cli.run();
	}

	public void run() throws IOException {
		Inventory inventory = new Inventory();


		}
	}

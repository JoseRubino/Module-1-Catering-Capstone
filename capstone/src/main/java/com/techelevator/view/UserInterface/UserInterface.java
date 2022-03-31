package com.techelevator.view.UserInterface;
import com.techelevator.CateringItem;

import java.util.List;
import java.util.Scanner;


public class UserInterface {
    private Scanner scanner;

    public UserInterface() {
        scanner = new Scanner(System.in);
    }


    public String printMainMenu(){
        System.out.println("D. Display Catering Items");
        System.out.println("P. Purchase");
        System.out.println("E. Exit");

        System.out.println("Please select your choice(Letter Only)");

        return scanner.nextLine();
    }

    public void printListOfCateringItems(List<CateringItem> cateringItems){}
    }




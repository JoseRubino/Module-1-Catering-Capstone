package com.techelevator;

import com.techelevator.view.MenuItems.Dessert;
import com.techelevator.view.MenuItems.Drink;
import com.techelevator.view.MenuItems.Munchy;
import com.techelevator.view.MenuItems.Sandwich;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Pattern;

public class LoadInventory {
    public Map <String, CateringItem>loadInventoryFromFile() throws FileNotFoundException {
        Map<String, CateringItem> cateringItemMap = new TreeMap<String, CateringItem>();

        try (Scanner scanner = new Scanner(new File("catering.csv"))){
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] splitedValues = line.split(Pattern.quote("|"));
                if (splitedValues [3].equalsIgnoreCase("")){
                    CateringItem cateringItem = new Munchy(splitedValues[0], splitedValues[1], Double.valueOf(splitedValues[2]), splitedValues[3]);
                    cateringItemMap.put(splitedValues[0], cateringItem);
                }
                else if(splitedValues [3].equalsIgnoreCase("A")){
                    CateringItem cateringItem = new Sandwich(splitedValues[0], splitedValues[1],Double.valueOf(splitedValues[2]), splitedValues[3]);
                    cateringItemMap.put(splitedValues[0], cateringItem);
                }
                else if(splitedValues [3].equalsIgnoreCase("D")){
                    CateringItem cateringItem = new Drink(splitedValues[0], splitedValues[1],Double.valueOf(splitedValues[2]), splitedValues[3]);
                    cateringItemMap.put(splitedValues[0], cateringItem);
                }
                else if(splitedValues [3].equalsIgnoreCase("E")){
                    CateringItem cateringItem = new Dessert(splitedValues[0], splitedValues[1],Double.valueOf(splitedValues[2]), splitedValues[3]);
                    cateringItemMap.put(splitedValues[0], cateringItem);
                }

            }


            return cateringItemMap;

        }



    }


        }


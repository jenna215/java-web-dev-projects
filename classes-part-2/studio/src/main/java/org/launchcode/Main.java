package org.launchcode;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Date todaysDate = new Date();

        MenuItem burger = new MenuItem(2.99, "Burger", "Entree", true);
        System.out.println(burger);
        MenuItem hotDog = new MenuItem(2.99, "Hot Dog", "Entree", true);
        System.out.println(hotDog);
        ArrayList<MenuItem> items = new ArrayList<>();
        items.add(burger);
        items.add(hotDog);

        Menu menu = new Menu(todaysDate, items);

        System.out.println(menu);

    }


}

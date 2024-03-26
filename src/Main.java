package Laptops;

import Laptops.factories.LaptopFactory;
import Laptops.factories.MacBookProFactory;
import Laptops.factories.SamsungGalaxyBook4Factory;

public class Main {
 public static void main(String[] args) {
     LaptopFactory samsungFactory = new SamsungGalaxyBook4Factory();
     Laptop samsung = samsungFactory.createLaptop();
     System.out.println("Product: " + samsung.getModel() + ", Price: Rs " + samsung.getPrice());

     LaptopFactory macBookFactory = new MacBookProFactory();
     Laptop macBook = macBookFactory.createLaptop();
     System.out.println("Product: " + macBook.getModel() + ", Price: Rs " + macBook.getPrice());
 
 }
}


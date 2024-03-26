package Laptops;

public class MacBookPro implements Laptop {
 private String model;
 private double price;

 public MacBookPro(String model, double price) {
     this.model = model;
     this.price = price;
 }

 @Override
 public String getModel() {
     return model;
 }

 @Override
 public double getPrice() {
     return price;
 }
}



package Laptops;

public class SamsungGalaxyBook4 implements Laptop {
 private String model;
 private double price;

 public SamsungGalaxyBook4(String model, double price) {
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


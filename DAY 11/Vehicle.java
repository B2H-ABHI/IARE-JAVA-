public abstract class Vehicle {
private String brand;
private String model;
public void setBrand(String brand) {
this.brand = brand;
}
public void setModel(String model) {
this.model = model;
}
public String getBrand() {
return brand;
}
public String getModel() {

return model;
}
abstract void displayDetails();
public static void main(String[] args) {
Vehicle car = new Car();
car.setBrand("Hyundai");
car.setModel("Creta");
Vehicle motorcycle = new Motorcycle();
motorcycle.setBrand("Honda");
motorcycle.setModel("Shine");
System.out.println("== VEHICLE DETAILS ==");
car.displayDetails();
motorcycle.displayDetails();
}
}
class Car extends Vehicle {
@Override
void displayDetails() {
System.out.println("Car");
System.out.println("Brand : " + getBrand());
System.out.println("Model : " + getModel());
}
}
class Motorcycle extends Vehicle {
@Override
void displayDetails() {
System.out.println("Motorcycle");
System.out.println("Brand : " + getBrand());
System.out.println("Model : " + getModel());
}
}
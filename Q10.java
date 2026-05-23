/* Create Multiple Objects. Create a class Car with attributes brand and year. 
Create two Car objects in the main method and display their details. */

class Car{
    String brand;
    int year;

    Car(String b, int y){
        this.brand = b;
        this.year = y;
    }

    public void displayData(){
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}

public class Q10{
    public static void main(String[] args){
        Car car1 = new Car("Honda", 2026);
        Car car2 = new Car("BMW", 2004);

        car1.displayData();
        System.out.println(" ");
        car2.displayData();
    }
}
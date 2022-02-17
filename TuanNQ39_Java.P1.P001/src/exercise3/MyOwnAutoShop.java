package exercise3;

public class MyOwnAutoShop {
    public static void main(String[] args) {
        Sedan sedan = new Sedan(500, 500, "red", 100);
        Ford ford_one = new Ford(500, 300, "red", 2022, 100);
        Ford ford_two = new Ford(500, 400, "red", 2022, 20);
        Car car = new Car(500, 100, "red");
        System.out.println("Sedan : " + sedan.getSalePrice());
        System.out.println("Ford 1 : " + ford_one.getSalePrice());
        System.out.println("Ford 2 : " + ford_two.getSalePrice());
        System.out.println("Car : " + car.getSalePrice());
    }
}

 package pbo_polymorphism;

public class AeroPlan extends Vehicle {
    public void walk() {
        System.out.println("Aeroplan is flying");
    }
    public static void main(String[] args) {
        AeroPlan garuda = new AeroPlan();
        garuda.function();
        garuda.fuel();
        garuda.walk();
    }
}

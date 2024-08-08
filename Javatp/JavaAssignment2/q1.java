package JavaAssignment2;

class Vehicle {
    public double fuelRequired(double mileage, double distance){ 
        return distance/mileage;
    }
    public double fuelRequired(double mileage, double distance, double initialFuel){
        return distance/mileage - initialFuel;
    }
    // method overloading
}

class Car extends Vehicle{ //
    public double fuelRequired(double mileage, double distance, double acOnTime){
        return distance/mileage + acOnTime*1.7;
    }

    // method overriding
}

class Truck extends Vehicle{
    public double fuelRequired(double mileage, double distance, double acOnTime){
        return distance/mileage + acOnTime*1.2;
    }
}

public class q1 {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();

        System.out.println("METHOD OVERLOADING");
        System.out.println(v1.fuelRequired(11.5, 200));
        System.out.println(v1.fuelRequired(10, 100, 3));

        Car c1 = new Car();
        System.out.println("METHOD OVERRIDING");
        System.out.println(c1.fuelRequired(15, 150, 5));
    }
}
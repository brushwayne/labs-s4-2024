class p5 {
    
    public static void main(String args[]) {
        
        Skoda car = new Skoda("Petrol", "Sedan", "Superb", "Automatic", 200);

        System.out.println(car.make);
        System.out.println(car.type);
        System.out.println(car.model);
        System.out.println(car.drive);
        System.out.println(car.top_speed);
    }
}

class Car {
    String make;
    String type;

    Car(String make, String type) {
        this.make = make;
        this.type = type;
    }
}

class Skoda extends Car {
    String model;
    String drive;
    int top_speed;
    
    Skoda(String make, String type, String model, String drive, int top_speed) {
        super(make, type);
        this.model = model;
        this.drive = drive;
        this.top_speed = top_speed;
    }
} 
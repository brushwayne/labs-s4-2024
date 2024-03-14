public class p5 {

    public static void main(String args[]) {
        WashingMachine machine = new WashingMachine();
        machine.run();
    }
}

interface Motor {
    int capacity = 450;

    void run();
    void consume();
}

class WashingMachine implements Motor {

    public void run() {
        System.out.printf("Capacity of the motor is: %d", capacity);
    }

    public void consume() {
        System.out.printf("This is the consume function");
    }
}
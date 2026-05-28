package pckg_inheritance;

public class Dog extends Animal {

    private String earShape;

    private String tailShape;

    public Dog(String type, double weight){
        this(type, weight, "Perky", "Curled");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), "Mutt", 50);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    public void makeNoise(){

    }

    @Override
    public void move(String speed) {
        super.move(speed);
        System.out.println("Dogs walk run and wag their tail");
    }

    private void bark(){
        System.out.println("bark");
    }

    private void run(){
        System.out.println("runs");
    }

    private void walk(){
        System.out.println("walks");
    }

    private void wagTail(){
        System.out.println("wags" + tailShape + "tail");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }
}


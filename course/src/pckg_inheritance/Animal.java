package pckg_inheritance;

public class Animal {
    private String type;

    private String size;

    private double weight;

    public Animal(String size, String type, double weight) {
        this.size = size;
        this.type = type;
        this.weight = weight;
    }

    public void move(String speed){
        System.out.println(type + " moves " + speed);
    }

    public void makeNoise(){
        System.out.println(type + " makes sound");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "size='" + size + '\'' +
                ", type='" + type + '\'' +
                ", weight=" + weight +
                '}';
    }
}

package primjeri_abs;

public abstract class Oblik {
    public abstract double povrsina();

    public void ispisiPovrsinu() {
        System.out.println("Povrsina" + povrsina());
    }
}


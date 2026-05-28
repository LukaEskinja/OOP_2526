package jed_sam;

public class Main3 {
    public static void main(String[] args) {
        Pozdravlja[] pozdravi = {
                new FormalniPozdrav(),
                new NeformalniPozdrav()
        };

        for (Pozdravlja p : pozdravi) {
            System.out.println(p.pozdrav());
        }
    }
}

package pckg_enkapsulacija;

public class Player {
    private String name;
    private int health;
    private String weapon;

    public Player(int health, String name, String weapon) {
        this.health = health;
        this.name = name;
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        health = health - damage;
        if (health <= 0) {
            System.out.println("Player knocked out of game");
        }
    }

    public int healthRemaining() {
        return health;
    }

    public void restoreHealth(int extraHealth) {
        if (health + extraHealth < 100){
        health = health + extraHealth;
    }else{
        health = 100;
        System.out.println("reached full health");
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "health=" + health +
                ", name='" + name + '\'' +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}
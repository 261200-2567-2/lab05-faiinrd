public class Sword {
    private int level = 1;
    private double damage = 50;
    private double run_speed = 2;

    public void levelUp() {
        level++;
        damage += damage*0.5;
        run_speed *= 1.1;
    }

    public double getDamage() {
        return damage;
    }

    public double speedDecrease() {
        return run_speed;
    }

    public  void status() {
        System.out.println("Level: " + level);
        System.out.println("Damage: " + damage);
    }

}


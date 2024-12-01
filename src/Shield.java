public class Shield {
    private int level = 1;
    private double defense = 50;
    private double run_speed = 1.5;

    public void levelUp() {
        level++;
        defense += defense*0.1;
        run_speed += run_speed*1.1;
    }

    public double getDefense() {
        return defense;
    }

    public double speedDecrease() {
        return run_speed;
    }

    public void status() {
        System.out.println("Level: " + level);
        System.out.println("Defense: " + defense);
    }

}

public class Character {
    protected final String name;
    protected int level = 1;
    protected double HP;
    private final double maxHP = 100;
    protected double Mana;
    private final double maxMana = 50;
    protected double run_speed = 10;
    private Sword sword;
    private Shield shield;
    private final Jobs jobs;
    private Accessories accessories;

    public Character(String name, Jobs jobs) {
        this.name = name;
        this.jobs = jobs;
        HP = maxHP;
        Mana = maxMana;
    }

    public void levelUp() {
        jobs.levelUp(this);
        System.out.println(name + " level up!");
    }

    public void getSword() {
        if(sword != null){
            System.out.println(name + " already has a sword.");
        }else{
            sword = new Sword();
            run_speed -= sword.speedDecrease();
            System.out.println(name + " have equipped a sword.");
        }
    }

    public void getShield() {
        if(shield != null){
            System.out.println(name + " already has a shield.");
        }else{
            shield = new Shield();
            run_speed -= shield.speedDecrease();
            System.out.println(name + " have equipped a shield.");
        }
    }

    public void swordLevelUp() {
        if(sword != null){
            sword.levelUp();
            System.out.println(name + "'s sword level up.");
        }else{
            System.out.println(name + " doesn't have a sword.");
        }
    }

    public void shieldLevelUp() {
        if(shield != null){
            shield.levelUp();
            System.out.println(name + "'s shield level up.");
        }else{
            System.out.println(name + " doesn't have a shield.");
        }
    }

    public void getAccessory(Accessories accessories) {
        this.accessories = accessories;
        HP += accessories.HP();
        Mana += accessories.Mana();
        run_speed += accessories.run_speed();
        System.out.println(name + " equipped with " + accessories.getName() + ".");
    }

    public void attack(Character enemy) {
        double damage = 0;

        if (sword != null) {
            damage += sword.getDamage();
            System.out.println(name + " attacks " + enemy.name + " with " + damage + " damage.");
        } else {
            jobs.specialSkill(this);
            damage += 30;
            System.out.println(name + " uses special skill! " + enemy.name + " takes " + damage + " damage.");
        }

        if (enemy.shield != null) {
            double defense = enemy.shield.getDefense();
            damage -= defense;
            if (damage < 0) {
                damage = 0;
            }
            System.out.println(enemy.name + " blocks " + defense + " damage with the shield.");
        }

        enemy.HP -= damage;
        if (enemy.HP < 0) {
            enemy.HP = 0;
        }
        System.out.println(enemy.name + " now has " + enemy.HP + " HP.");
    }

    public void useSpecialSkill(Character enemy){
        double damage = 0;
        jobs.specialSkill(this);
        damage += 30;
        System.out.println(name + " uses special skill! " + enemy.name + " takes " + damage + " damage.");
        enemy.HP -= damage;
        if (enemy.HP < 0) {
            enemy.HP = 0;
        }
        System.out.println(enemy.name + " now has " + enemy.HP + " HP.");
    }



    public void status() {
        System.out.println("----------------------------------------");
        jobs.showstatus(this);
        if(sword != null){
            System.out.println("----------------------------------------");
            System.out.println(name + "'s sword "); sword.status();
        }
        if(shield != null){
            System.out.println("----------------------------------------");
            System.out.println(name + "'s shield "); shield.status();
        }
        if(accessories != null){
            System.out.println("----------------------------------------");
            System.out.println(name + "'s " + accessories.getName()); accessories.showStatus();
        }
    }
}

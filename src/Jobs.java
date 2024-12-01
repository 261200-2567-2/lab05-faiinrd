public interface Jobs {
    String getName();
    void levelUp(Character character);
    void specialSkill(Character character);
    void showstatus(Character character);

}

class Ranger implements Jobs {
    @Override
    public String getName () {
        return "Ranger";
    }

    @Override
    public void levelUp (Character character) {
        character.level++;
        character.HP += 10;
        character.Mana += 5;
        character.run_speed += 5;
    }

    @Override
    public void specialSkill(Character character) {
        System.out.println(character.name + " uses Arrow Rain!");
        character.run_speed += 5;
        character.HP += 10;
    }

    @Override
    public void showstatus(Character character) {
        System.out.println("===" + character.name + "===");
        System.out.println("Level: " + character.level);
        System.out.println("HP: " + character.HP);
        System.out.println("Mana: " + character.Mana);
        System.out.println("Run Speed: " + character.run_speed);
    }

}

class Fighter implements Jobs {
    @Override
    public String getName () {
        return "Fighter";
    }

    @Override
    public void levelUp (Character character) {
        character.level++;
        character.HP += 20;
        character.Mana += 3;
        character.run_speed += 2;
    }

    @Override
    public void specialSkill(Character character) {
        System.out.println(character.name + " uses Power Punch!");
        character.HP += 15;
    }

    @Override
    public void showstatus(Character character) {
        System.out.println("===" + character.name + "===");
        System.out.println("Level: " + character.level);
        System.out.println("HP: " + character.HP);
        System.out.println("Mana: " + character.Mana);
        System.out.println("Run Speed: " + character.run_speed);
    }

}

class Wizard implements Jobs {
    @Override
    public String getName () {
        return "Wizard";
    }

    @Override
    public void levelUp (Character character) {
        character.level++;
        character.HP += 5;
        character.Mana += 20;
        character.run_speed += 3;
    }

    @Override
    public void specialSkill(Character character) {
        System.out.println(character.name + " uses Fireball!");
        character.Mana += 15;
    }

    @Override
    public void showstatus(Character character) {
        System.out.println("===" + character.name + "===");
        System.out.println("Level: " + character.level);
        System.out.println("HP: " + character.HP);
        System.out.println("Mana: " + character.Mana);
        System.out.println("Run Speed: " + character.run_speed);
    }

}

class Assassin implements Jobs {
    @Override
    public String getName () {
        return "Assassin";
    }

    @Override
    public void levelUp (Character character) {
        character.level++;
        character.HP += 10;
        character.Mana += 5;
        character.run_speed += 10;
    }

    @Override
    public void specialSkill(Character character) {
        System.out.println(character.name + " uses Shadow Strike!");
        character.run_speed += 15;
    }

    @Override
    public void showstatus(Character character) {
        System.out.println("===" + character.name + "===");
        System.out.println("Level: " + character.level);
        System.out.println("HP: " + character.HP);
        System.out.println("Mana: " + character.Mana);
        System.out.println("Run Speed: " + character.run_speed);
    }
}

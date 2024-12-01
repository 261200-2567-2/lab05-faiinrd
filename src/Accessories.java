public interface Accessories {
    String getName();
    double HP();
    double Mana();
    double run_speed();
    void showStatus();
}

class Ring implements Accessories {
    @Override
    public String getName() {
        return "Ring" ;
    }

    @Override
    public double HP() {
        return 30;
    }

    @Override
    public double Mana() {
        return 50;
    }

    @Override
    public double run_speed() {
        return 20;
    }

    @Override
    public void showStatus() {
        System.out.println("HP Boost: " + HP());
        System.out.println("Mana Boost: " + Mana());
        System.out.println("Run Speed Boost: " + run_speed());
    }

}

class Boots implements Accessories {
    @Override
    public String getName() {
        return "Boots" ;
    }

    @Override
    public double HP() {
        return 30;
    }

    @Override
    public double Mana() {
        return 20;
    }

    @Override
    public double run_speed() {
        return 50;
    }

    @Override
    public void showStatus() {
        System.out.println("HP Boost: " + HP());
        System.out.println("Mana Boost: " + Mana());
        System.out.println("Run Speed Boost: " + run_speed());
    }

}

class Necklace implements Accessories {
    @Override
    public String getName() {
        return "Necklace" ;
    }

    @Override
    public double HP() {
        return 20;
    }

    @Override
    public double Mana() {
        return 50;
    }

    @Override
    public double run_speed() {
        return 30;
    }

    @Override
    public void showStatus() {
        System.out.println("HP Boost: " + HP());
        System.out.println("Mana Boost: " + Mana());
        System.out.println("Run Speed Boost: " + run_speed());
    }

}

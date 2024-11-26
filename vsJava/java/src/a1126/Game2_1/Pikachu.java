package a1126.Game2_1;

public class Pikachu {

    private int energy;
    private String type;
    private int level;

    public Pikachu() {

    }

    public Pikachu(int energy, String type, int level) {
        this.energy = energy;
        this.type = type;
        this.level = level;
    }

    public String aAttack() {
        return "십만볼트";
    }

    public String bAttack() {
        return "전광석화";
    }

    @Override
    public String toString() {
        return "Pikachu [energy=" + energy + ", type=" + type + ", level=" + level + ", aAttack()=" + aAttack()
                + ", bAttack()=" + bAttack() + "]";
    }

}

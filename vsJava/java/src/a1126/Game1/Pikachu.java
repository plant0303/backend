package a1126.Game1;

public class Pikachu {
    public int energy;
    public String type;
    public int level;

    public Pikachu() {

    }
    
    public Pikachu(int energy, String type) {
        this.energy = energy;
        this.type = type;
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

}

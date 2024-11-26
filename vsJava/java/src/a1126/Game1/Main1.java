package a1126.Game1;

public class Main1 {
    public static void main(String[] args) {
        Pikachu pi = new Pikachu();
        pi.energy = 100;
        pi.type = "전기";
        pi.level = 1;

        System.out.println("피카츄");
        System.out.println("에너지: " + pi.energy);
        System.out.println("타입: " + pi.type);
        System.out.println("레벨: " + pi.level);
        System.out.println("공격A: " + pi.aAttack());
        System.out.println("공격B: " + pi.bAttack());
        Pikachu pikachu20 = new Pikachu(150, "전기, 강철", 20);


        
        System.out.println("피카츄20");
        System.out.println("에너지: " + pi.energy);
        System.out.println("타입: " + pi.type);
        System.out.println("레벨: " + pi.level);
        System.out.println("공격A: " + pi.aAttack());
        System.out.println("공격B: " + pi.bAttack());


        Raichu raichu = new Raichu(400 , "메가전기", 40);
        System.out.println("라이츄40");
        System.out.println("에너지: " + pi.energy);
        System.out.println("타입: " + raichu.type);
        System.out.println("레벨: " + raichu.level);
        System.out.println("공격A: " + raichu.aAttack());
        System.out.println("공격B: " + raichu.bAttack());
    }
}

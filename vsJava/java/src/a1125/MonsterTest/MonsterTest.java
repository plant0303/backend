package a1125.MonsterTest;

public class MonsterTest {
    public static void main(String[] args) {
        Monster orc = new Monster("오크", 30);
        Monster skeleton = new Monster("스켈레톤", 30);
        Monster.battle(orc, skeleton);

    }
}

class Monster {
    private String name;
    private int hp;
    private static int maxHp = 30;

    public Monster(String name, int hp) {
        this.name = name;
        this.hp = maxHp;
    }

    public static void battle(Monster orc, Monster skeleton) {
        while(orc.hp > 0 && skeleton.hp > 0){
            // hp가 0이 될때까지 전투를 반복
            Monster attacker = (Math.random() < 0.5) ? orc : skeleton;
            Monster defender = (attacker == orc) ? skeleton : orc;
            // attacker변수가 Monster class에서 어떻게 저장되는거지?

            attacker.attack(defender);
        }
    }

    private void attack(Monster enemy) {
        System.out.printf("[%s] 의 공격", name);
        enemy.hp = enemy.hp - 10;

        System.out.printf("%s 체력: %d/(%d)\n", enemy.name, enemy.hp, Monster.maxHp);
    }
}

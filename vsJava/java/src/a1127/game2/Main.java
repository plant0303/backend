package a1127.game2;

public class Main {
    public static void main(String[] args) {
        Hero[] heros = new Hero[3]; //부모 객체를 배열로 선언
        heros[0] = new Warrior("전사");
        heros[1] = new Archer("궁수");
        heros[2] = new Wizard("법사");

        for(Hero hero : heros){
            hero.attack();

            if(hero instanceof Warrior w1){
                // instanceof: 객체가 특정 클래스나 인스턴스를 참조하는지 확인함
                w1.groundCutting();
                // 다운캐스팅힌거임
                // 자바 17버전 문법
            } else if (hero instanceof Archer) {
                Archer temp = (Archer) hero;
                temp.fireArrow();
            } else if(hero instanceof Wizard){
                Wizard temp = (Wizard) hero;
                temp.freezing();
            } else{
                System.out.println("잘못된 입력");
            }
        }
    }


}

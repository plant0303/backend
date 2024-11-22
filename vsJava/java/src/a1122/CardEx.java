package a1122;

public class CardEx {
    public static void main(String[] args) {
        System.out.println("카드의 넓이: " + Card.width);
        System.out.println("카드의 높이: " + Card.height);
        Card c1 = new Card();
        c1.kind = "heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "spade";
        c2.number = 4;

        System.out.println("c1 모양: " + c1.kind + ", 숫자: " + c1.number + ", 넓이: " + c1.width + ", 높이: " + c1.height);
        System.out.println("c2 모양: " + c2.kind + ", 숫자: " + c2.number + ", 넓이: " + c2.width + ", 높이: " + c2.height);
        
    }
}
class Card{
    String kind;
    int number;
    static int width = 100;
    static int height = 250;
}
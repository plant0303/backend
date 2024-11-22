package a1122;

public class WebtoonTest {
    public static void main(String[] args) {
        Webtoon w1 = new Webtoon("나혼자만레벨업", "판타지", "추공");
        Webtoon w2 = new Webtoon("스위트홈", "스릴러", "칸비");
        Webtoon w3 = new Webtoon("이태원 클래스", "드라마", "광진");

        Webtoon[] Webtoons = { w1, w2, w3 };

        // for (int i = 0; i > Webtoons.length; i++) {
        //     System.out.println("제목: " + Webtoons[i].getTitle());
        //     System.out.println("장르: " + Webtoons[i].getGenre());
        //     System.out.println("작가: " + Webtoons[i].getAuthor());
        // }
        for(int i = 0; i < Webtoons.length; i++){
            System.out.println(Webtoons[i] + Webtoons[i].toStr());
        }
        System.out.printf("웹툰 객체의 총 수: %d", Webtoon.getCount());

    }
}

class Webtoon {
    private String title;
    private String genre;
    private String author;
    private static int count = 0;
    // public String getTitle() {
    //     return title;
    // }

    // public String getGenre() {
    //     return genre;
    // }

    // public String getAuthor() {
    //     return author;
    // }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public static void setCount(int count) {
        Webtoon.count = count;
    }
    public static int getCount() {
        return count;
    }

    public Webtoon(String title, String genre, String author) {
        this.title = title;
        this.genre = genre;
        this.author = author;
        count++;
    }


    public String toStr(){
        return String.format("Webtoon[제목: %s], 장르: %s, 저자: %s", title, genre, author);
    }
}
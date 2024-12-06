package a1206.movie;

import java.io.*;
import java.time.Instant;
import java.util.ArrayList;

public class Movie {
    private long id;      // 영화 고유 ID
    private String title; // 영화 제목
    private String genre; // 영화 장르

    // 생성자
    public Movie(String title, String genre) {
        this.id = Instant.now().getEpochSecond(); // 타임스탬프 기반으로 ID 생성
        this.title = title;
        this.genre = genre;
    }

    public Movie(long id, String title, String genre) {
        this.id = id;
        this.title = title;
        this.genre = genre;
    }

    // Getter 메서드
    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    // 객체 정보를 문자열로 반환
    @Override
    public String toString() {
        return String.format("[%d] : %s(%s)", id, title, genre);
    }

    // 파일 경로
    private static final File file = new File("E:\\seominhee\\vsJava\\java\\src\\movies.txt");

    // 파일에서 모든 영화 데이터를 읽어오는 메서드
    public static ArrayList<Movie> findAll() throws IOException {
        ArrayList<Movie> movies = new ArrayList<>();

        // 파일 읽기
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] temp = line.split(",");
                Movie m = new Movie(
                    Long.parseLong(temp[0]), // 영화 ID
                    temp[1], // 영화 제목
                    temp[2]  // 영화 장르
                );
                movies.add(m); // ArrayList에 영화 객체 추가
            }
        }

        return movies;
    }

    // ID로 영화 하나를 찾는 메서드
    public static Movie findById(String movieIdStr) throws IOException {
        Movie movie = null;

        // 파일 읽기
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] temp = line.split(",");
                if (movieIdStr.equals(temp[0])) {
                    movie = new Movie(Long.parseLong(temp[0]), temp[1], temp[2]);
                    break; // 영화 찾으면 반복문 종료
                }
            }
        }

        return movie;
    }

    // 영화 데이터를 파일에 저장하는 메서드
    public void save() throws IOException {
        // 파일에 이어쓰기
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write(this.toFileString() + "\n");
        }
    }

    // 객체 정보를 파일 저장 형식으로 변환
    private String toFileString() {
        return String.format("%d,%s,%s", id, title, genre);
    }

    // ID로 영화 데이터를 삭제하는 메서드
    public static void delete(String movieIdStr) throws IOException {
        StringBuilder text = new StringBuilder();

        // 파일 읽기
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] temp = line.split(",");
                if (!movieIdStr.equals(temp[0])) { // 삭제할 영화가 아닌 경우
                    text.append(line).append("\n");
                }
            }
        }

        // 변경된 내용을 파일에 덮어쓰기
        try (FileWriter fw = new FileWriter(file)) {
            fw.write(text.toString());
        }
    }
}

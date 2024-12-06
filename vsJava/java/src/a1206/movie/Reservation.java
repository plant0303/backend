package a1206.movie;

import java.io.*;
import java.time.Instant;
import java.util.ArrayList;

public class Reservation {
    private long id;          // 발급번호
    private long movieId;     // 영화 대푯값
    private String movieTitle; // 영화 제목
    private String seatName;   // 좌석명

    // 생성자
    public Reservation(long id, long movieId, String movieTitle, String seatName) {
        this.id = id;
        this.movieId = movieId;
        this.movieTitle = movieTitle;
        this.seatName = seatName;
    }

    // 생성자 (현재 시간을 밀리세컨드로 발급번호 설정)
    public Reservation(long movieId, String movieTitle, String seatName) {
        this.id = Instant.now().toEpochMilli(); // 현재 시간을 밀리세컨드로 ID 생성
        this.movieId = movieId;
        this.movieTitle = movieTitle;
        this.seatName = seatName;
    }

    // Getter 메서드
    public long getId() {
        return id;
    }

    public long getMovieId() {
        return movieId;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public String getSeatName() {
        return seatName;
    }

    // 객체 정보를 문자열로 반환
    @Override
    public String toString() {
        return String.format("영화: %s, 좌석: %s", movieTitle, seatName);
    }

    // 파일 경로
    private static final File file = new File("E:\\seominhee\\vsJava\\java\\src\\reservation.txt");

    // 영화 ID로 예약 내역 찾기
    public static ArrayList<Reservation> findByMovieId(String movieIdStr) throws IOException {
        ArrayList<Reservation> reservations = new ArrayList<>();
        
        // 파일 읽기
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] temp = line.split(",");
                if (movieIdStr.equals(temp[1])) { // 영화 ID가 일치하는 예약만 조회
                    long id = Long.parseLong(temp[0]);   // 발급번호
                    long movieId = Long.parseLong(temp[1]); // 영화 대푯값
                    String movieTitle = temp[2]; // 영화 제목
                    String seatName = temp[3];  // 좌석명
                    
                    // 예약 객체 생성 후 리스트에 추가
                    Reservation r = new Reservation(id, movieId, movieTitle, seatName);
                    reservations.add(r);
                }
            }
        }
        
        return reservations;
    }

    // 예약 정보를 파일에 저장
    public void save() throws IOException {
        try (FileWriter fw = new FileWriter(file, true)) { // 이어쓰기(append) 모드
            fw.write(this.toFileString() + "\n");
        }
    }

    // 객체 정보를 파일 저장 형식으로 변환
    private String toFileString() {
        return String.format("%d,%d,%s,%s", id, movieId, movieTitle, seatName);
    }

    // 예약 취소 (예약 ID로 해당 예약 삭제)
    public static Reservation cancel(String reservationId) throws IOException {
        Reservation canceled = null;
        StringBuilder text = new StringBuilder();

        // 파일 읽기
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] temp = line.split(",");
                if (reservationId.equals(temp[0])) { // 예약 ID가 일치하면 해당 예약 취소
                    canceled = new Reservation(
                        Long.parseLong(temp[0]),  // 발급번호
                        Long.parseLong(temp[1]),  // 영화 대푯값
                        temp[2],                  // 영화 제목
                        temp[3]                   // 좌석명
                    );
                    continue; // 해당 예약은 복사하지 않음
                }
                text.append(line).append("\n"); // 나머지 예약들은 그대로 복사
            }
        }

        // 변경된 내용을 파일에 덮어쓰기
        try (FileWriter fw = new FileWriter(file)) {
            fw.write(text.toString());
        }

        return canceled; // 취소된 예약 객체 반환
    }

    // 예약 ID로 예약 정보 찾기
    public static Reservation findById(String reservationId) throws IOException {
        Reservation r = null;

        // 파일 읽기
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] temp = line.split(",");
                if (reservationId.equals(temp[0])) { // 예약 ID가 일치하는 예약 찾기
                    r = new Reservation(
                        Long.parseLong(temp[0]),  // 발급번호
                        Long.parseLong(temp[1]),  // 영화 대푯값
                        temp[2],                  // 영화 제목
                        temp[3]                   // 좌석명
                    );
                    break; // 예약을 찾으면 반복문 종료
                }
            }
        }

        return r; // 예약 객체 반환
    }
}

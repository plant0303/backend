package a1122.Student;

public class Student {
    private String name;
    private int stdNum;
    private int koScore;
    private int mathScore;
    private int engScore;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStdNum() {
        return stdNum;
    }

    public void setStdNum(int stdNum) {
        this.stdNum = stdNum;
    }

    public int getKoScore() {
        return koScore;
    }

    public void setKoScore(int koScore) {
        if(koScore < 0) {
            System.out.println("0보다 작은 값은 입력할 수 없습니다.");
        }
        this.koScore = koScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    public int getEngScore() {
        return engScore;
    }

    public void setEngScore(int engScore) {
        this.engScore = engScore;
    }

    public Student(String name, int stdNum, int koScore, int mathScore, int engScore) {
        this.name = name;
        this.stdNum = stdNum;
        setKoScore(koScore);
        this.mathScore = mathScore;
        this.engScore = engScore;
    }

    public String toStr() {
        double avg = (koScore + mathScore + engScore) / 3;
        return String.format("이름: %s, 학번: %d, 국어점수: %d, 수학점수: %d, 영어점수: %d, 평균: %.2f", name, stdNum, koScore, mathScore, engScore, avg);
    }

    
    
}

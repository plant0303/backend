package a1125.hak2;

public class Student {
    private String name;
    private int stdNum;
    private int score1;
    private int score2;
    private int score3;
    public Student(String name, int stdNum, int score1, int score2, int score3) {
        this.name = name;
        this.stdNum = stdNum;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }
    public Student() {
        //기본생성자
    }
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
    public int getScore1() {
        return score1;
    }
    public void setScore1(int score1) {
        this.score1 = score1;
    }
    public int getScore2() {
        return score2;
    }
    public void setScore2(int score2) {
        this.score2 = score2;
    }
    public int getScore3() {
        return score3;
    }
    public void setScore3(int score3) {
        this.score3 = score3;
    }
	public double getAvg() {
        return (score1 + score2 + score3) / 3;
	}

}

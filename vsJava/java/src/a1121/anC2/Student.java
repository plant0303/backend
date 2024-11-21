package a1121.anC2;

public class Student {
    String name;
    int age;
    String stdNo;
    String major;

    public Student() {
        this("이름없음", 1, "00000000", "없음");
    }

    public Student(String name, int age, String stdNo, String major) {
        this.name = name;
        this.age = age;
        this.stdNo = stdNo;
        this.major = major;
    }

    public void study(String subject) {
        System.out.println(subject + "를 공부합니다.");
    }

    public double getAverage(int i, int j) {
        double avg = 0;
        avg = (double) (i + j) / 2;
        return avg;
    }

    // 오버로딩. 메소드의 이름은 같은데 매개변수가 다르다
    public double getAverage(int i, int j, int k) {
        double avg = 0;
        avg = (i + j + k) / 3;
        return avg;
    }

    public double getAverage(int[] scores) {
        double avg = 0;
        int sum = 0;
        for (int i : scores) {
            sum += i;
        }
        avg = (double) sum / scores.length;
        return avg;

    }

    
}

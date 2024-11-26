package a1126.Hak5;

public class Student {
    private String name;
    private String stdId;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getStdId() {
        return stdId;
    }
    public void setStdId(String stdId) {
        this.stdId = stdId;
    }
    public Student(String name, String stdId) {
        this.name = name;
        this.stdId = stdId;
    }
    @Override
    public String toString() {
        return "이름: " + name + ", 학번: " + stdId;
    }
}

package a1120.class1;

public class Person {
    private int age;
    private String gender;

    public Person(){
        
    }
    public Person(int age, String gender) {
        this.age = age;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
}

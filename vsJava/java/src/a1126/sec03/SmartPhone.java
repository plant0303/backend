package a1126.sec03;

public class SmartPhone extends Phone{
    public boolean wifi;

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
        System.out.println("와이파이 상태를 변경했습니다.");
    }

    public void internet(){
        System.out.println("인터넷 연결");
    }
    public SmartPhone(String model, String color){
        this.model = model;
        this.color = color;
    }
}

package a1204.프로젝트2_최하늘;

public class AppException extends Exception{
    public AppException() {
    }

    public AppException(String msg) {
        super(msg);// 오버라이드 개념으로 메세지를 출력.상황에 맞게 예외처리..
    }
}


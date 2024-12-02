package a1202.Exception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class CustomException extends Exception{
    public CustomException(String message){
        super(message);
    }
}

public class Exception5 {
    public static void main(String[] args) {
        // 사용자 정의 예외
        try{
            validate(15);
        }catch(CustomException e){
            System.out.println("사용자 정의 예외" + e.getMessage());
        }
    }    

    private static void validate(int age) throws CustomException{
        if(age < 18){
            throw new UnsupportedOperationException("나이는 18세 이상이어야함");
        }
    }
}

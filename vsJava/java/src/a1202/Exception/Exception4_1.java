package a1202.Exception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Exception4_1 {
    public static void main(String[] args) {
        try{
            File file = new File("example.txt");
            if(file.exists()){
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);

                String line;
                while((line = br.readLine()) != null){
                    System.out.println(line);
                }
                br.close();
            } else{
                System.out.println("파일을 찾을 수 없습니다.");
                
            }
        }catch(FileNotFoundException e){
            System.out.println("파일 찾을 수 없음" + e.getMessage());
        }catch(IOException e){
            System.out.println("파일을 읽는 도중 오류 발생" + e.getMessage());
        }
    }    
}

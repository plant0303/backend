package a1202.file1;

import java.io.File;

public class FileEx {
    public static void main(String[] args) {
        File file = new File("c:\\abc\\out1.txt");

        if(file.exists()){
            System.out.println("파일 이름: " + file.getName());
            System.out.println("파일 경로: " + file.getPath());
            System.out.println("파일 크기: " + file.length());
            System.out.println("읽기 기능: " + file.canRead());
            System.out.println("쓰기 가능: " + file.canWrite());
        }
    }
}

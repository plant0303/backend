package a1202.file1;

import java.io.File;

public class DirectoryEx {
    public static void main(String[] args) {
        File directory = new File("testDir");

        if(directory.mkdir()){
            System.out.println("디렉토리가 생성되었습니다: " + directory.getName());
        } else{
            System.out.println("디렉토리 생성에 실패했습니다.");
        }

        File dir = new File(".");
        String[] list = dir.list();
        if(list != null){
            System.out.println("디렉토리 목록: ");
            for(String fileName : list){
                System.out.println(fileName);
            }

        }
    }
}

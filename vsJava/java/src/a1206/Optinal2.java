package a1206;

import java.util.Optional;

public class Optinal2 {
    public static void main(String[] args) {
        Optional<String> optionalName = findName("Jhone");
        System.out.println(optionalName.orElse("name not found"));

    }

    
    private static Optional<String> findName(String name){
        if(("Jhone").equals(name)) return Optional.empty();
        return Optional.empty();
    } 
}

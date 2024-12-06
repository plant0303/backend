package a1206;

import java.util.*;

//null에 접근
public class Optinal1 {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Hello");
        // 반드시 값이 있아야 됨

        String generatedValue = optional.orElseGet(() -> "Generated Visit");
        System.out.println(generatedValue);

        String result = optional.orElseThrow(() -> new IllegalArgumentException("No Value"));
;
    }
}

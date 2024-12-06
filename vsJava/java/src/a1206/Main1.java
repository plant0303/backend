package a1206;

import java.util.Optional;

public class Main1 {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
    
        Optional<User> userOptional1 = userRepository.findById(2L);
        userOptional1.ifPresentOrElse(
            user -> System.out.println("찾는 사용자:" + user),
            () -> System.out.println("찾는 사용자가 없습니다")
        );
    }
}

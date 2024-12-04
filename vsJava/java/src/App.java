import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        int[][] board = { 
                { 0, 1, 1, 1, 1 },
                { 0, 1, 1, 1, 1 },
                { 1, 1, 0, 1, 1 },
                { 1, 1, 1, 1, 1 }, // 3,2
                { 1, 1, 0, 0, 0 }
        };
        System.out.println(solution(board));
    }

    public static int solution(int[][] board) {
        int result = 0;
        int total = 0;
        int count = 0;

        Set<String> set = new HashSet<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    for (int x = i - 1; x <= i + 1; x++) {
                        for (int y = j - 1; y <= j + 1; y++) {

                            // 경계값 탐색
                            if(x >= 0 && x < board.length && y >= 0 && y < board[i].length){
                                set.add(x + "," + y);
                            }
                        }
                    }
                }
            }
        }

        int totalIndexes = board.length * board[0].length;

        return totalIndexes - set.size();
    }
}

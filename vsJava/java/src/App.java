import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        int[][] board = { { 0, 0, 0, 0, 0 },
                          { 0, 0, 0, 0, 0 },
                          { 0, 0, 0, 0, 0 },  
                          { 0, 0, 1, 1, 0 },  
                          { 0, 0, 0, 0, 0 }   
                        };
        System.out.println(solution(board));
    }

    public static int solution(int[][] board) {
        int result = 0;
        int total = 0;
        int count = 0;

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] == 1){
                    // 경계값 탐색
                    if(i - 1 < 0){
                        count += 0;
                    } else{
                        count += 3;
                    }

                    if(i + 1 > board.length){
                        count += 0;
                    } else{
                        count += 3;
                    }

                    if(j - 1 < 0){
                        count += 0;
                    } else{
                        count += 3;
                    }

                    if(j + 1 < board[i].length){
                        count += 0;
                    } else{
                        count += 3;
                    }
                }
            }
        }

        int totalIndexes = board.length * board[0].length;

        return totalIndexes - count;
    }
}

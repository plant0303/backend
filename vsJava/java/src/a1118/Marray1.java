package a1118;

public class Marray1 {
    public static void main(String[] args) {

        int[][] mathScore = new int[2][3];
        for(int i = 0; i < mathScore.length; i++){
            for(int k = 0; k < mathScore[i].length; k++){
                System.out.println("mathScores["+i+"]["+k+"]: " + mathScore[i][k]);
            }
        }
        System.out.println();
        mathScore[0][0] = 80;
        mathScore[0][1] = 83;
        mathScore[0][2] = 85;
        mathScore[1][0] = 86;
        mathScore[1][1] = 90;
        mathScore[1][2] = 92;

        for(int i = 0; i < mathScore.length; i++){
            for(int k = 0; k < mathScore[i].length; k++){
                System.out.println("mathScores["+i+"]["+k+"]: " + mathScore[i][k]);
            }
        }

        int totalMathSum = 0;
        int totalStudent = 0;
        for(int i = 0; i < mathScore.length; i++){
            totalStudent += mathScore[i].length;
            for(int k = 0; k < mathScore[i].length; k++){
                totalMathSum += mathScore[i][k];
            }
        }
        System.out.println(totalMathSum);
        System.out.println(totalStudent);
        System.out.println((double)totalMathSum / totalStudent);
    }
}

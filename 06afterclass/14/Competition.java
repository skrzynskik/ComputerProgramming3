import java.util.Scanner;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
import java.util.Collections;

public class Competition{
    String name;
    float score;
    
    
    public static void main(String[] args){
        int points[][] = new int[3][5];
        ArrayList<Float> finalScores = new ArrayList<Float>();
        int winnerPoints[][] = new int[3][1];
        
        //gen points
        for(int i=0; i<3; i++){
            for(int j=0; j<5; j++){
                int randomNum = ThreadLocalRandom.current().nextInt(1, 5 + 1);
                points[i][j] = randomNum;
            }
        }
        
        //countpoints
        for(int i=0;i<3;i++){
            int sum = 0;
            for( int j=0; j<5; j++){
                sum += points[i][j];
            }
            finalScores.add((float)sum/5.0f);
        }
        
        ArrayList<Float> finalScoresCopy =  (ArrayList<Float>) finalScores.clone();
        
        finalScores.remove(Collections.max(finalScores));
        finalScores.remove(Collections.min(finalScores));
        
        float winner[] = new float[1];
        
        for (Float f : finalScores) {
            winner[0] = f;
        }
        
        int winnerNumber = finalScoresCopy.indexOf(winner[0])+1;
        System.out.println(finalScoresCopy.toString());
        System.out.println("Player number " + winnerNumber + " wins!");
    }
}
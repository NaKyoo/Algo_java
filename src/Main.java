import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] tabscores = new int[7];
        int moyenne = 0;
        float Moyenne = 0;

        tabscores[0] = 1;
        tabscores[1] = 2;
        tabscores[2] = 3;
        tabscores[3] = 4;
        tabscores[4] = 5;
        tabscores[5] = 6;
        tabscores[6] = 7;


        Random randomNumber = new Random();

        for(int i = 0; i < tabscores.length; i++) {
            int scores  = randomNumber.nextInt(101);
            tabscores[i] = scores;
        }


        for (int i = 0; i < tabscores.length; i++) {
            int s = tabscores[i];
            System.out.println(s);
        }

        for (int i = 0; i < tabscores.length; i++) {

           moyenne = moyenne + tabscores[i];
           Moyenne = moyenne / tabscores.length;
        }
        System.out.println();
        System.out.println("Moyenne = " + Moyenne);

    }
}
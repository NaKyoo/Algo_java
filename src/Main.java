import java.util.Random;

public class Main {


    static void getTabscores(int[] tabscores) {

        for (int i = 0; i < tabscores.length; i++) {
            System.out.print(tabscores[i] + " ");
        }
    }

    static void getMaxscores(int[] tabscores) {
        int maxscores = tabscores[0];
        for (int i = 0; i < tabscores.length; i++) {
            if (tabscores[i] > maxscores) {
                maxscores = tabscores[i];
            }
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Score Max = " + maxscores);
    }

    static void ValInf10(int[] tabscores) {
        boolean Inf10 = false;
        for (int i = 0; i < tabscores.length; i++) {
            if (tabscores[i] < 10) {
                boolean ValInf10 = true;
                Inf10 = true;
            }
            else {
                boolean ValInf10 = false;
                Inf10 = false;
            }
        }
        if (Inf10 == true) {
            System.out.println(" ");
            System.out.println("Au moins une valeur du tableau est inférieure à 10");
        }
        else {
            System.out.println(" ");
            System.out.println("Aucune valeur du tableau est inférieure à 10");
        }
    }

    public static void main(String[] args) {

        int[] tabscores = new int[7];
        tabscores[0] = 1;
        tabscores[1] = 2;
        tabscores[2] = 3;
        tabscores[3] = 4;
        tabscores[4] = 5;
        tabscores[5] = 6;
        tabscores[6] = 7;

        Random randomNumber = new Random();

        for(int i = 0; i < tabscores.length; i++) {
            int scores  = randomNumber.nextInt(50);
            tabscores[i] = scores;
        }

        getTabscores(tabscores);

        getMaxscores(tabscores);

        ValInf10(tabscores);










        /*
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
       */



    }
}
import java.util.Random;

public class TP03 {

    /*
    Création de la fonction pour créer un tableau de 7 cases
    Fonction nommée getTabscores
    Prend 1 paramètre tabscores de type int
    Ne renvoie rien (void)
    */
    static void getTabscores(int[] tabscores) {

        for (int i = 0; i < tabscores.length; i++) {
            System.out.print(tabscores[i] + " ");
        }
    }
    /*
    Création de la fonction pour obtenir la valeur maximum du tableau
    Fonction nommée getMaxscores
    Prend 1 paramètre tabscores de type int
    Ne renvoie rien (void)
    */
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

    /*
    Création de la fonction pour voir si il y a une valeur inférieur à 10
    Fonction nommée ValInf10
    Prend 1 paramètre tabscores de type int
    Ne renvoie rien (void)
    */
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
    }
}
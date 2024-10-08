public class TP04 {


    // Fonction qui permet d'effectuer une recherche binaire
    static int Binary_Search(int[] tabscores, int NumberToFind) {
        int min = 0;
        int max = tabscores.length - 1;

        while (min <= max) {
            //Définition du milieu
            int mid = (min + max) / 2;
            // Si NumberToFind est égale au milieu alors on renvoie milieu;
            if (tabscores[mid] == NumberToFind) {
                return mid;
            }
            // Si NumberToFind est supérieure au milieu alors on cherche dans la partie supérieure;
            if (tabscores[mid] > NumberToFind) {
                max = mid - 1;
            }
            // Si NumberToFind est inférieure au milieu alors on cherche dans la partie inférieure;
            else {
                min = mid + 1;
            }
        }
        // Si aucune des conditions est respectée on renvoie -1
        return -1;
    }

    public static void main(String[] args) {

        // Création du tableau
        int[] tabscores = new int[9];
        tabscores[0] = 10;
        tabscores[1] = 20;
        tabscores[2] = 30;
        tabscores[3] = 40;
        tabscores[4] = 50;
        tabscores[5] = 60;
        tabscores[6] = 70;
        tabscores[7] = 80;
        tabscores[8] = 90;

        System.out.println(Binary_Search(tabscores, 20));
    }
}

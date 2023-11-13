package helperMethods;

import java.util.ArrayList;

public class Utilz {

    // Convertit une ArrayList<Integer> en une matrice 2D d'entiers.
    public static int[][] ArrayListTo2Dint(ArrayList<Integer> list, int ySize, int xSize) {
        int[][] newArr = new int[ySize][xSize];

        // Parcourt la nouvelle matrice
        for (int j = 0; j < newArr.length; j++)
            for (int i = 0; i < newArr[j].length; i++) {
                // Calcule l'index correspondant dans la liste
                int index = j * ySize + i;
                // Affecte la valeur à la nouvelle matrice
                newArr[j][i] = list.get(index);
            }

        return newArr;
    }

    // Convertit une matrice 2D d'entiers en un tableau 1D d'entiers.
    public static int[] TwoDto1DintArr(int[][] twoArr) {
        int[] oneArr = new int[twoArr.length * twoArr[0].length];

        // Parcourt la matrice 2D
        for (int j = 0; j < twoArr.length; j++)
            for (int i = 0; i < twoArr[j].length; i++) {
                // Calcule l'index correspondant dans le tableau 1D
                int index = j * twoArr.length + i;
                // Affecte la valeur au tableau 1D
                oneArr[index] = twoArr[j][i];
            }

        return oneArr;
    }

}

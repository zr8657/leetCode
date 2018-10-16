package org.webmaic.example;

public class L_832_Flipping_an_Image {

    public static void main(String[] arg0) {
        int A[][] = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int  B[][] = flipAndInvertImage(A);
        int n = A.length;
        for (int[] row : A){
            for (int i = 0; i * 2 < n; i++){
                System.out.print(row[i]);
            }
            System.out.println();
        }

    }

    public static int[][] flipAndInvertImage(int[][] A) {
        int n = A.length;
        for(int j = 0; j < n / 2 + n % 2; j++){
            for(int i = 0; i < n; i++) {
                int tmp = A[i][j];
                A[i][j] = A[i][n - 1 - j] ^ 1;
                A[i][n - 1 - j] = tmp ^ 1;
            }
        }
        return A;
    }

}

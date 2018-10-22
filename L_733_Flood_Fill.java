package org.webmaic.example;

public class L_733_Flood_Fill {

    public static void main(String[] arg0) {
        int image[][] = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        handler(1, 1, image, 1, 2);
        System.out.println();
    }

    public static void handler(int sr, int sc, int image[][], int color, int newColor) {
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != color){
            return;
        }
        image[sr][sc] = newColor;
        handler(sr + 1, sc, image, color, newColor);
        handler(sr - 1, sc, image, color, newColor);
        handler(sr, sc + 1, image, color, newColor);
        handler(sr, sc - 1, image, color, newColor);
    }

}

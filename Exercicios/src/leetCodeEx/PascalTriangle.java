package leetCodeEx;

import java.util.Scanner;

public class PascalTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número de linhas (rows) para a pirâmide de Pascal:");
        int rows = sc.nextInt();

        int[][] pascalTriangle = new int[rows][];

        for (int i = 0; i < rows; i++) {
            pascalTriangle[i] = new int[i + 1];
            pascalTriangle[i][0] = 1;

            for (int j = 1; j < i; j++) {
                pascalTriangle[i][j] = pascalTriangle[i - 1][j - 1] + pascalTriangle[i - 1][j];
            }

            pascalTriangle[i][i] = 1;
        }

        // Imprimir a pirâmide de Pascal
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(pascalTriangle[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}


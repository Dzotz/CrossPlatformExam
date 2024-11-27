import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[3][3];

        // Введення елементів матриці
        System.out.println("Введіть елементи матриці 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("matrix[%d][%d] = ", i + 1, j + 1);
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Обчислення детермінанту
        int determinant = calculateDeterminant(matrix);

        // Виведення результату
        System.out.println("Детермінант матриці: " + determinant);
    }

    // Метод для обчислення детермінанту 3x3
    private static int calculateDeterminant(int[][] matrix) {
        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
                - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
                + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }
}
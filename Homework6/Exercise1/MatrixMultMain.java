package Homework6.Exercise1;

public class MatrixMultMain {
    public static void main(String[] args) {
        int[][] matrixA = {{1, 2}, {3, 4}};
        int[][] matrixB = {{5, 6}, {7, 8}};
        // Multiply matrices
        int[][] result = multiplyMatrices(matrixA, matrixB);

        //Run vs. Start -> s. Notes
        // Print result
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }



    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        if (a[0].length != b.length) {
            throw new IllegalArgumentException("Matrix dimensions don't match for multiplication");
        }
        int[][] bTransp = transpose(b);
        int rows = a.length;
        int cols = b[0].length;
        int[][] result = new int[rows][cols];

        // Create threads for each dot product calculation
        // DotProductThread[][] threads = new DotProductThread[rows][cols];


        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < bTransp.length; j++) {
                DotProductThread current = new DotProductThread(a[i], bTransp[j]);
                current.run();
               //  current.start();
                result[i][j] = current.getDot();
            }
        }
        return result;

/*

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Calculate dot product for result[i][j]
                int[] row = a[i];
                int[] col = new int[b.length];
                for (int k = 0; k < b.length; k++) {
                    col[k] = b[k][j];
                }

                // Create and start threads for each multiplication pair
                DotProductThread[] productThreads = new DotProductThread[row.length];
                for (int k = 0; k < row.length; k++) {
                    productThreads[k] = new DotProductThread(row[k], col[k]);
                    productThreads[k].start(); // Using start() is better
                }

                // Wait for all threads to complete and sum the results
                try {
                    int sum = 0;
                    for (int k = 0; k < productThreads.length; k++) {
                        productThreads[k].join();
                        sum += productThreads[k].getDot();
                    }
                    result[i][j] = sum;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        return result;
*/

    }

    private static int[][] transpose(int[][] b) {
        int zeilen = b.length;
        int spalten = b[0].length;
        int[][] transp = new int[spalten][zeilen];
        for (int i = 0; i < zeilen; i++) {
            for (int j = 0; j < spalten; j++) {
                transp[j][i] = b[i][j];
            }
        }
        return transp;
    }
}







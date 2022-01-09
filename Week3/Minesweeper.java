/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class Minesweeper {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);
        int[][] table = new int[m][n];
        String[][] tableOut = new String[m][n];
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                tableOut[i][j] = "a";
            }
        }
        while (count < k) {
            int posX = (int) (Math.random() * n);
            int posY = (int) (Math.random() * m);
            if (!tableOut[posY][posX].equals("*")) {
                tableOut[posY][posX] = "*";
                count++;
                if (posX > 0) {
                    table[posY][posX - 1]++;
                    if (posY > 0) {
                        table[posY - 1][posX - 1]++;
                    }
                    if (posY < m - 1) {
                        table[posY + 1][posX - 1]++;
                    }
                }
                if (posY > 0) {
                    table[posY - 1][posX]++;
                }
                if (posY < m - 1) {
                    table[posY + 1][posX]++;
                }
                if (posX < n - 1) {
                    table[posY][posX + 1]++;
                    if (posY > 0) {
                        table[posY - 1][posX + 1]++;
                    }
                    if (posY < m - 1) {
                        table[posY + 1][posX + 1]++;
                    }
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (tableOut[i][j].equals("*")) {
                    System.out.print("*  ");
                } else {
                    System.out.print(table[i][j] + "  ");
                }
            }
            System.out.print('\n');
        }
    }
}

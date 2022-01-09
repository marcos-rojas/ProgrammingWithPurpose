/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class Birthday {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        double[][] arrayOutput = new double[n][3];
        for (int i = 0; i < trials; i++) {
            boolean repeated = false;
            boolean[] members = new boolean[n];
            int count = 0;
            while (!repeated) {
                int r = (int) (Math.random() * n);
                count++;
                if (members[r]) {
                    repeated = true;
                }
                else {
                    members[r] = true;
                }
            }
            arrayOutput[count][1] += 1.0;
        }
        for (int i = 1; i < n; i++) {
            arrayOutput[i][0] = i;
            arrayOutput[i][2] = (arrayOutput[i][1] / trials) + arrayOutput[i - 1][2];
        }
        for (int i = 1; i < n && arrayOutput[i - 1][2] < 0.5; i++) {
            System.out.println(
                    (int) arrayOutput[i][0] + "  " + (int) arrayOutput[i][1] + "  "
                            + arrayOutput[i][2]);
        }
    }
}

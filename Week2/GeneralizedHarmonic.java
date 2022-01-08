/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class GeneralizedHarmonic {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);
        double harmonic = 0;
        for (double i = 1.0; i <= n; i++) {
            harmonic += 1 / (Math.pow(i, r));
        }
        System.out.println(harmonic);
    }
}

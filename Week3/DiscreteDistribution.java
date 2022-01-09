/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class DiscreteDistribution {
    public static void main(String[] args) {
        int trials = Integer.parseInt(args[0]);
        int nLength = args.length;
        int[] aArray = new int[nLength];
        int[] sArray = new int[nLength];

        for (int i = 1; i < nLength; i++) {
            aArray[i] = Integer.parseInt(args[i]);
        }
        for (int i = 1; i < nLength; i++) {
            sArray[i] = aArray[i] + sArray[i - 1];
        }
        int sN = sArray[nLength - 1];
        for (int i = 0; i < trials; i++) {
            int r = (int) Math.floor(Math.random() * sN);
            for (int j = 1; j < nLength; j++) {
                if (r >= sArray[j - 1] && r < sArray[j]) {
                    System.out.print(j + " ");
                    break;
                }
            }
        }

    }
}

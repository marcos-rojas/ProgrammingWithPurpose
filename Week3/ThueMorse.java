/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class ThueMorse {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = 1;
        int nL = n + (n % 2);
        boolean[] morseArray = new boolean[nL];
        while (k <= nL / 2) {
            for (int i = k; i < 2 * k; i++) {
                morseArray[i] = !morseArray[i - k];
            }
            k = k * 2;
        }
        // System.out.println(Arrays.toString(morseArray));
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (morseArray[i] == morseArray[j]) {
                    System.out.print("+  ");
                } else {
                    System.out.print("-  ");
                }
            }
            System.out.print('\n');
        }
    }
}

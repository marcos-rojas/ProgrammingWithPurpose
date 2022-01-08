/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class BandMatrix {
    public static void main(String[] args) {
        int width = Integer.parseInt(args[0]);
        int limit = Integer.parseInt(args[1]);
        for (int index = 0; index < width; index++) {
            // String row = "";
            String row = "";
            for (int j = 0; j < width; j++) {
                int diff = Math.abs(j - index);
                if (j == index || diff <= limit) {
                    row += "*  ";
                }
                else {
                    row += "0  ";
                }
            }
            System.out.println(row);
        }
    }
}

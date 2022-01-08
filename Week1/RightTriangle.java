/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class RightTriangle {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        boolean mayus = a > 0 && b > 0 && c > 0;

        int aMayus = a * a - b * b - c * c;
        int bMayus = b * b - a * a - c * c;
        int cMayus = c * c - b * b - a * a;
        boolean diff = aMayus == 0 || bMayus == 0 || cMayus == 0;
        System.out.println(mayus && diff);
    }
}

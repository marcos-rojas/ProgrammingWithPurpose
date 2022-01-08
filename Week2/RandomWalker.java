/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);

        int x = 0;
        int y = 0;
        int steps = 0;
        System.out.println("(0, 0)");
        while (Math.abs(x) + Math.abs(y) < r) {
            double randMove = Math.random();
            if (randMove < 0.25) {
                x += 1;
            }
            else if (randMove < 0.5) {
                x -= 1;
            }
            else if (randMove < 0.75) {
                y += 1;
            }
            else {
                y -= 1;
            }
            steps++;
            String message = String.format("(%s, %s)", x, y);
            System.out.println(message);
        }
        System.out.println("steps = " + steps);
    }
}

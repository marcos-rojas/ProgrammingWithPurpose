/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class GreatCircle {
    public static void main(String[] args) {
        double x1 = Math.toRadians(Double.parseDouble(args[0]));
        double y1 = Math.toRadians(Double.parseDouble(args[1]));
        double x2 = Math.toRadians(Double.parseDouble(args[2]));
        double y2 = Math.toRadians(Double.parseDouble(args[3]));
        double radius = 6371.0;
        double term1 = Math.pow(Math.sin((x2 - x1) / 2), 2);
        double term2 = Math.pow(Math.sin((y2 - y1) / 2), 2);
        double normDist = Math.sqrt(term1 + Math.cos(x1) * Math.cos(x2) * term2);
        double distance = 2 * radius * Math.asin(normDist);
        System.out.println(distance + " kilometers");
    }
}

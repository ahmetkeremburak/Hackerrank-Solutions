package solutions.operators;

public class Result {

    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     *  1. DOUBLE meal_cost
     *  2. INTEGER tip_percent
     *  3. INTEGER tax_percent
     */

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
    // The trick is when divided by 100, integers are rounded to 0 if they are smaller than 1
    // Cast integers as double to calculate correctly
    double tip_cost = meal_cost * ((double)tip_percent/100);
    double tax_cost = meal_cost * ((double)tax_percent/100);
    double result = meal_cost + tip_cost + tax_cost;
    System.out.println(Math.round(result));

    }
}
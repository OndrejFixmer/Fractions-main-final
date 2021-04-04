package cz.educanet;

import java.util.ArrayList;

public class MathUtils {

    /**
     * Calculates the greatest common divisor.
     * https://www.bbc.co.uk/bitesize/guides/z9hb97h/revision/5
     * ie. for 8 and 12 => 4.
     * ie. for 10 and 5 => 5.
     * ect.
     *
     * @param a first number
     * @param b second number
     * @return GCD
     */

    public static int findGreatestCommonDenominator(int a, int b) {
        ArrayList<Integer> list = new ArrayList<>();
        int gcd = 0;

        float proA = (float) a;
        float proB = (float) b;

        for (int i = 0; i <= a; i++) {
            if (proA / i == Math.floor(proA / i)) {
                list.add(i);
            }
        }
// prosim muze mi nekdo rict co to je, ja to nechapu
        //edit: uz to chapu
        for (int i = b; i <= b; i--) {
            if ((proB / i == Math.floor(proB / i)) && list.contains(i)) {
                gcd = i;
                return gcd;
            }
        }
        return 0;
    }

    /**
     * Calculates the lowest common multiple.
     * https://www.bbc.co.uk/bitesize/guides/z9hb97h/revision/5
     * ie. for 5 and 6 => 30.
     * multiples for 5: 5, 10, 15, 20, 25, *30*, 35...
     * multiples for 6: 6, 12, 18, 24, *30*...
     *
     * @param a first number
     * @param b second number
     * @return GCD
     */
    //nechce me nekdo ddosnout abych to nemusel delat :)
    public static int findLowestCommonMultiple(int a, int b) {
        ArrayList<Integer> list = new ArrayList<>();
        //chapes, jakoze UNO jako jedna a DOS jako dva. hahah ja sem tak vtipnej
        int cisloUNO = 0;
            int cisloDOS = 0;

        int miniNasobeni = 0;

        for (int i = 1; i <= b; i++) {
            cisloUNO = a * i;

                list.add(cisloUNO);
        }

        for (int j = 1; j < a; j++) {
            cisloDOS = b * j;

                if (list.contains(cisloDOS)) {
                    miniNasobeni = cisloDOS;

                return miniNasobeni;
            }
        }
        return 0;
    }

}

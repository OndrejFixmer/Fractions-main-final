package cz.educanet;

public class Fraction {

    private final int numerator;
    private final int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
//___________________________________________________________________________________________//
//!!!DISCLAIMER!!! POMOHL MI GOOGLE A KAMARADI NA DISCORDU :)                                //
// (lmao mozna to mam podobny se trema lidma protoze v tom mam kousky co mi pomohli udelat)  //
//___________________________________________________________________________________________//


    //region: basic operations (+, -, *, /)
        public Fraction plus(Fraction other) {
            int matematiksuperpog = MathUtils.findLowestCommonMultiple(denominator, other.denominator);



            int a = matematiksuperpog / denominator;

                int b = matematiksuperpog / other.denominator;
                int c = numerator * a;

            int d = other.numerator * b;

        int finaleee = c + d;

            return new Fraction(finaleee, matematiksuperpog);
    }

    public Fraction minus(Fraction other) {
        int matematiksuperpog = MathUtils.findLowestCommonMultiple(denominator, other.denominator);
            //mno tak tady to zaclo bejt zajimavy lmao (aneb jak si ondra lámal 2 hodiny hlavu a pak napsal na discord)
            int a = matematiksuperpog / denominator;
                int b = matematiksuperpog / other.denominator;
                int c = numerator * a;
            int d = other.numerator * b;

        int finaleee = c - d;

        return new Fraction(finaleee, matematiksuperpog);
    }

    public Fraction times(Fraction other) {

            int nasob1 = numerator * other.numerator;
                int nasob2 = denominator * other.denominator;

     return new Fraction(nasob1, nasob2);
    }

    public Fraction dividedBy(Fraction other) {

                int del1 = numerator * other.denominator;
                //ja umru

            int del2 = denominator * other.numerator;

    return new Fraction(del1, del2);
    }
    //endregion

    //region: other operations
    public Fraction getReciprocal() {
        return new Fraction (getDenominator(),getNumerator());
    }

        public Fraction simplify() {
                    int matematiksuperpog = MathUtils.findGreatestCommonDenominator(numerator, denominator);

                    int yespls = numerator / matematiksuperpog;
                        int NaeNae = denominator / matematiksuperpog;

        return new Fraction(yespls,NaeNae);
    }

        public float toFloat() {
                int cislo = 0;
                float desetinCislo = cislo;

                if (denominator != 0) {
                    desetinCislo = (float)numerator / (float)denominator;
        }
                else {
                    System.out.println("cože??? ono nejde dělit nulou??????");
        }

            return desetinCislo;
    }
    //endregion

    //region: getters
        public int getNumerator() {
        return numerator;
    }
        public int getDenominator() {
        return denominator;
    }
    //endregion
}
//hele na konec to MOŽNÁ KEY WORD MOŽNÁ FUNGUJE, hele 60 procent by mi stacilo ngl
public class Rational {
    private int numer, den;

    public Rational(int numer, int den) {
        this.numer = numer;
        this.den = den;
        this.numer = numer / gcd(numer, den);
        this.den = den / gcd(numer, den);
    }


    public Rational() {

    }

    public int getNumer() {
        return numer;
    }

    public void setNumer(int numer) {
        this.numer = numer;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        this.den = den;
    }


    public Rational add(Rational a) {
//    Rational result;
//    result = new Rational( num * a.den + a.num * den, den * a.den );
//    return result;
        return new Rational(numer * a.den + a.numer * den, den * a.den);
    }

    public int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public Rational sub(Rational a) {
        return new Rational(numer * a.den - a.numer * den, den * a.den);
    }

    public Rational mul(Rational a) {
        return new Rational(numer * a.numer, den * a.den);
    }

    public Rational div(Rational a) {
        return new Rational(numer * a.den, a.numer * den);
    }

    public Rational reverse() {
        return new Rational(den, numer);
    }


    // public String toString() {
    //      return "" + numer / gcd(numer, den) + "/" + den / gcd(numer, den) + "";
    //  }
    public void print() {
        System.out.println(numer/ gcd(numer, den) + "/" + den/ gcd(numer, den));
    }

    public static Rational convert(String str) {
        char[] character = str.toCharArray();
        int j = 0;
        Rational[] array = new Rational[100];
        String[] sample = str.split("/");

        for (char c : character) {
            if (c == '+' || c == '-' || c == '*' || c == ':') {
                j++;
            }
        }

        char[] op = new char[j];
        int c = 0;

        for (char value : character) {
            if (value == '+' || value == '-' || value == '*' || value == ':') {
                op[c] = value;
                c++;
            }
        }

        if (sample.length == 2) {
            return new Rational(Integer.parseInt(sample[0]), Integer.parseInt(sample[1]));
        } else {
            for (int i = op.length - 1; i > -1; i--) {
                String[] rationals = str.split("\\+|-|\\*|:");


                for (int q = 0; q < rationals.length; q++) {
                    String[] x = rationals[q].split("/");
                    Rational xR = new Rational(Integer.parseInt(x[0]), Integer.parseInt(x[1]));
                    array[q] = xR;
                }

                if (op[i] == '*') {
                    Rational ans = new Rational(array[i].mul(array[i + 1]).numer, array[i].mul(array[i + 1]).den);
                    str = str.replace(rationals[i] + "*" + rationals[i + 1], (ans.numer) + "/" + (ans.den));
                }

                if (op[i] == ':') {
                    Rational ans = new Rational(array[i].div(array[i + 1]).numer, array[i].div(array[i + 1]).den);
                    str = str.replace(rationals[i] + ":" + rationals[i + 1], (ans.numer) + "/" + (ans.den));
                }
            }

            character = str.toCharArray();
            j = 0;

            for (char a : character) {
                if (a == '+' || a == '-' || a == '*' || a == ':') {
                    j++;
                }
            }

            op = new char[j];
            c = 0;

            for (char value : character) {
                if (value == '+' || value == '-' || value == '*' || value == ':') {
                    op[c] = value;
                    c++;
                }
            }

            for (int i = op.length - 1; i > -1; i--) {
                String[] rationals = str.split("\\+|-|\\*|:");

                for (int q = 0; q < rationals.length; q++) {
                    String[] x = rationals[q].split("/");
                    Rational xR = new Rational(Integer.parseInt(x[0]), Integer.parseInt(x[1]));
                    array[q] = xR;
                }

                if (op[i] == '+') {
                    Rational ans = new Rational(array[i].add(array[i + 1]).numer, array[i].add(array[i + 1]).den);
                    str = str.replace(rationals[i] + "+" + rationals[i + 1], (ans.numer) + "/" + (ans.den));
                }

                if (op[i] == '-') {
                    Rational ans = new Rational(array[i].sub(array[i + 1]).numer, array[i].sub(array[i + 1]).den);
                    str = str.replace(rationals[i] + "-" + rationals[i + 1], (ans.numer) + "/" + (ans.den));
                }
            }
        }

        String[] strings = str.split("/");

        return new Rational(Integer.parseInt(strings[0]), Integer.parseInt(strings[1]));
    }

    static public Rational convertP(String str) {
        String[] rationals = str.split("||");
        for (int q = 0; q < rationals.length; q++) {
            if (rationals[q].equals("(")) {
                String z = (str.substring(str.indexOf("(") + 1, str.indexOf(")")));
                Rational ans = new Rational(convert(z).numer, convert(z).den);
                str = str.replace("(" + z + ")", (ans.numer) + "/" + (ans.den));
            }
        }
        return convert(str);
    }

}






import java.util.Scanner;

public class RationalTest {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int numer1 = in.nextInt();
        int den1 = in.nextInt();
        Rational x = new Rational(numer1, den1);
        x.print();

        int numer2 = in.nextInt();
        int den2 = in.nextInt();

        Rational y = new Rational(numer2, den2);
        y.print();
        x.sub(y).print();
        x.add(y).print();
        x.div(y).print();
        x.mul(y).print();
        Rational m=new Rational();
        m.setNumer(2);
        m.setDen(4);
        m.print();

       x.reverse().print();

      Rational.convert("3/4-6/4").print();
      Rational.convertP("(5/3*3/5):(6/4-1/2)*(1/4+1/8)").print();


    }


    }























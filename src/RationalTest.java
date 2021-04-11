import java.util.Scanner;

public class RationalTest {
    public static void main(String [] args) {
//        Scanner in = new Scanner(System.in);
//        int numer1 = in.nextInt();
//        int den1 = in.nextInt();
//        Rational x = new Rational(numer1, den1);
//        x.print();
////        System.out.println(x);
//        int numer2 = in.nextInt();
//        int den2 = in.nextInt();
//        Rational y = new Rational(numer2, den2);
//        y.print();
//        x.sub(y).print();
        Rational m=new Rational();
        m.setNumer(2);
        m.setDen(4);
        m.print();
//        System.out.println(y);
//        System.out.println(x.add(y));
//        Rational m=x.add(y);
//        System.out.println(x+" + "+y+" = "+m);
//        Rational s=x.sub(y);
//        System.out.println(x+" - "+y+" = "+s);
//        Rational div=x.div(y);
//        System.out.println(x+" / "+y+" = "+div);
//        x.reverse().print();
//        System.out.println("reverse:"+reverse);
      Rational.convert("3/4-6/4").print();
      Rational.convertP("(5/3*3/5):(6/4-1/2)*(1/4+1/8)").print();
//1/2:1/3*3/4-2/5+1/3*2/7

    }


//("5/3 * 3/5 : 1/2 + 1/2 * 1/3 * 2/3")

    }























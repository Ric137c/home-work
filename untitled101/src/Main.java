
class Main {
    public static void main(String[] args) {
        Calculator calculation = Calculator.instance.get();

        int d = calculation.minus.apply(1, 1);
        System.out.println(d);
        int c = calculation.plus.apply(2, 4);
        System.out.println(c);
        int q = calculation.multiply.apply(3, 7);
        System.out.println(q);
        int r = calculation.divide.apply(4, 2);
        System.out.println(r);
        int t = calculation.pow.apply(3);
        System.out.println(t);
        int y = calculation.abs.apply(9);
        System.out.println(y);
        boolean e = calculation.isPositive.test(4);
        System.out.println(e);
    }
}

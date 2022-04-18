
class Main {
    public static void main(String[] args) {
        Calculator calculation = Calculator.instance.get();
        System.out.println(calculation.minus.apply(1, 1));
        System.out.println(calculation.plus.apply(2, 4));
        System.out.println(calculation.multiply.apply(3, 7));
        System.out.println(calculation.divide.apply(4, 2));
        System.out.println(calculation.pow.apply(3));
        System.out.println(calculation.abs.apply(9));
        System.out.println(calculation.isPositive.test(4));
        // код работает и компелируется!!!!
        // Я не понимаю в чем ошибка!
        // Прошу обяснить подробно!
    }
}

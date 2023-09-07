public class Home {
    public static void main(String[] args) {
        Calculator c1 = new Calculator(10, 20);
        Calculator c2 = new Calculator(30, 40);

        c1.base = 10;
        c2.base = 20;
        int c1SumResult =  c1.sum();
        int c1AvgResult =  c1.avg();

        System.out.println("c1 sumResult: " + c1SumResult);
        System.out.println("c1 avgResult: " + c1AvgResult);

        int c2SumResult =  c2.sum();
        int c2AvgResult =  c2.avg();

        System.out.println("c2 sumResult: " + c2SumResult);
        System.out.println("c2 avgResult: " + c2AvgResult);

        
        //static 개념(정적)
        System.out.println("----------------------------------");
        Number number1 = new Number();
        Number number2 = new Number();

        number1.num++;
        number1.num2++;

        System.out.println("number2.num: " + number2.num);
        System.out.println("number2.num2: " + number2.num2);
    }
}

class Number {
    static int num = 0;
    int num2 = 0;
}

class Calculator {
    static double PI = 3.14;
    static int base = 0;
    int left, right;

    public Calculator(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public int sum() {
        int result;
        result = this.left + this.right + base;
        return result;
    }

    public int avg() {
        int result;
        result = (this.left + this.right + base) / 2;
        return result;
    }
}

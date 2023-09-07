public class sangsok {
    public static void main(String args[]) {
        CopyCalculator c = new CopyCalculator(10, 20);
        CopyCalculator2 c2 = new CopyCalculator2(10, 20);
        int sum = c.sum();
        int avg = c.avg();
        int substract = c.substract();
        int gophaki = c2.multiplication();

        System.out.println("sum: " + sum);
        System.out.println("avg: " + avg);
        System.out.println("substract: " + substract);
        System.out.println("gophaki: " + gophaki);
    }
}

class CopyCalculator extends Calculator{
    public CopyCalculator(int left, int right) {
        super(left, right);
    }

    public int substract() {
        int result;
        result = this.left - this.right;

        return result;
    }
}

class CopyCalculator2 extends Calculator{
    public CopyCalculator2(int left, int right) {
        super(left, right);
    }

    public int multiplication() {
        int result;
        result = this.left * this.right;

        return result;
    }
}

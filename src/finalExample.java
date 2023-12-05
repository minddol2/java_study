final class finalExample {
    final int VAR = 10; // 이 필드는 상수화되어 변경 불가능
    final void brake() {
        final double MAX_NUM = 10.2;
        System.out.println(VAR);
        System.out.println(MAX_NUM);
        System.out.println(VAR * MAX_NUM);
    }

    public static void main(String args[] ) {
        finalExample f = new finalExample();
        f.brake();
    }
}

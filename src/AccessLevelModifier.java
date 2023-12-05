public class AccessLevelModifier {
    public static void main(String[] args) {
        System.out.println("hi");
        SameClass sameClass = new SameClass();
        //sameClass.getVar(); // sameClass가 private 접근제어자이므로 들고올 수 없다.
        System.out.println("private public test : " + sameClass.getTest());
    }
}


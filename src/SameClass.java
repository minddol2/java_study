public class SameClass {
    private String va =  "같은 클래스만 허용"; // private 필드
    private String getVar() {
        return this.va;
    }

    private String output = "test";
    public String getTest() {
        return this.output;
    }

    public static void main(String[] args) {
        SameClass sameClass = new SameClass();

        System.out.println(sameClass.getTest());
    }


}

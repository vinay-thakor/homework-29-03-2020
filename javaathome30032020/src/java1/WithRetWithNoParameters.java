package java1;

public class WithRetWithNoParameters {
    public static void main(String[] args) {
        WithRetWithNoParameters m1 = new WithRetWithNoParameters();
        //addition method calling to main method and this retun
        //int value
        int result = m1.addition();
        System.out.println(result);
    }

    public int addition() {
        int a = 20;
        int b = 30;
        int result = a + b;
        return result;
    }
}
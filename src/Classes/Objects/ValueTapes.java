package Classes.Objects;

public class ValueTapes {
    public static void main(String[ ] args) {
        int x = 4;
        square(x);
        System.out.println(x);
    }
    static void square(int x) {
        x = x * x;
    }
}

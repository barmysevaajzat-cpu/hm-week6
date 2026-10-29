//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class  Main {
    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }

    void main() {
        boolean result = isEven(100);
        System.out.println(result);
    }
}

    public static void printnum() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
    void main() {
        printnum();
    }



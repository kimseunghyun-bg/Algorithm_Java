package timon;

public class Lambda {
    @FunctionalInterface
    public interface Test{
        int result(int num1, int num2);
    }

    public static void main(String[] args) {
        Test test = (x, y) -> x + y;
        System.out.println(test.result(1, 2));
    }
}
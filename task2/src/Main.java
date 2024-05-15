//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int n = 567;

        int maxdigit = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit > maxdigit){
                maxdigit = digit;
            }
            n /= 10;
        }
        System.out.println("Найбільше число:" + maxdigit);
    }
}
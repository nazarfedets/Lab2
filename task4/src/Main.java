public class Main {
    public static void main(String[] args) {
        String option = "+";

        switch (option.toUpperCase()) {
            case "ТАК":
            case "OK":
            case "YES":
            case "Y":
            case "+":
                System.out.println("Я погоджуюсь!");
                break;
            case "HI":
            case "NO":
            case "N":
            case "-":
                System.out.println("Я відмовляюсь!");
                break;
            default:
                System.out.println("Невідома опція.");
        }
    }
}

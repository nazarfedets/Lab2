public class Main {
    public static void main(String[] args) {
        int floor = 3;
        int all = 5;


        if (floor < 1 || floor > 9){
            System.out.println("Ви ввели недопустимий номер поверху.");
            return;
        }
        if (all < 1 || all > 9){
            System.out.println("Ви ввели недопустимий номер поверху.");
            return;
        }



        if (all == 2) {
            System.out.println("Кнопка 2-го поверху не працює! Піднімаємось на 3-й поверх.");
            all = 3;
        }


        if (all > floor) {
            System.out.println("Ви піднялись  на " + all + " поверх.");
        } else if (all < floor) {
            System.out.println("Ви спустились  на " + all + " поверх.");
        } else {
            System.out.println("Ви залишились на поточному поверсі.");
        }
    }
}
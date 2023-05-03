public class Main {
    public static void main(String[] args) {

        int ticketPrice = 17200;
        int milesPerRuble = 20;
        int miles = ticketPrice / milesPerRuble;

        System.out.println("Количество бонусных миль: " + miles);
    }
}
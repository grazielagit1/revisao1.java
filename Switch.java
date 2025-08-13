public class Switch {
    public static void main(String[] args) {
            int day = 9;

            switch(day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
            }
    }
}

// É importante o uso do Break, sem ele o resultado é sempre mantendo o que ja estava
//mesmo que a variável mude.

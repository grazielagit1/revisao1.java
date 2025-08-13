import java.util.Scanner; // classe pra receber entrada

class Curso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // objeto scanner
        String name = sc.nextLine();
        int age = sc.nextInt();
        System.out.println(name+": "+age);
        
    }
}
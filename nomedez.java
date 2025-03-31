import java.util.Scanner;
public class nomedez {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String n;

        System.out.println("Qual é o seu nome?");
        n = ler.nextLine();

        for (int i = 0; i <= 10; i++)
            System.out.println(n + "!!!!!! :D");

    }
}
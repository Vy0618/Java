import java.util.Scanner;
public class ex46
{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int opcao;

        System.out.println("--- Calculadora de Áreas ---\n1. Calcular Área do Retângulo\n2. Calcular Área do Triângulo\n3. Calcular Área do Círculo\n4. Sair\n-- Escolha uma opção: ");
        opcao = ler.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("--- Calculadora de Área do Retângulo ---\nInsira a base: ");
                double base1 = ler.nextDouble();
                System.out.print("Insira a altura: ");
                double height1 = ler.nextDouble();
                double areare = ( base1 * height1);
                System.out.print("A Área do Retângulo é igual a: " + areare);
                break;

            case 2:
                System.out.print("--- Calculadora de Área do Triângulo ---\nInsira a base: ");
                double base2 = ler.nextDouble();
                System.out.print("Insira a altura: ");
                double height2 = ler.nextDouble();
                double areatri = ( base2 * height2) / 2;
                System.out.print("A Área do Triângulo é igual a: " + areatri);
                break;

            case 3:
                System.out.print("--- Calculadora de Área do Círculo ---\nInsira o valor do raio: ");
                double raio = ler.nextDouble();
                double areacirc = Math.PI * ( raio * raio );
                System.out.print("A Área do Círculo é igual a: " + areacirc);
                break;

            case 4:
                System.out.println("Saindo do programa....");
                break;

            default:
                System.out.print("Opção inválida!");
        }
    }
}
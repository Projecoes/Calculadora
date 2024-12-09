import java.util.Scanner;

public class Calculadora extends Calculos implements Texto {
    Scanner sc = new Scanner(System.in);

    private int opcao;


    public void exibeMenu() {
        do {

            System.out.println("""
                        Qual operação fazer?
                    *****************************
                    1 - Soma
                    2 - Subtração
                    3 - Multiplicação
                    4 - Divisão
                    0 - Sair
                    *****************************
                    """);
            opcao = sc.nextInt();


            switch (opcao) {
                case 1:
                    texto();
                    System.out.println(getPrimeiroNumero() + " + " + getSegundoNumero() + " = " + Soma());
                    break;
                case 2:
                    texto();
                    System.out.println(getPrimeiroNumero() + " - " + getSegundoNumero() + " = " + Subtracao());
                    break;
                case 3:
                    texto();
                    System.out.println(getPrimeiroNumero() + " * " + getSegundoNumero() + " = " + multiplicacao());
                    break;
                case 4:
                    texto();
                    if (getSegundoNumero() == 0) {
                        System.out.println("O segundo Numero nao pode ser zero");
                    } else{
                        System.out.println(getPrimeiroNumero() + " / " + getSegundoNumero() + " = " + divisao());
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção incorreta");
                    break;
            }

        } while (opcao != 0);

    }

    @Override
    public void texto() {

            System.out.println("Digite o primeiro número:");
            setPrimeiroNumero(sc.nextInt());

            System.out.println("Digite o segundo número:");
            setSegundoNumero(sc.nextInt());
        }
}


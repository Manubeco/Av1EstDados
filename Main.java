import java.util.Random;
import java.util.Scanner;

public class Main {


public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.println("|-Bem vindo!-|\n|Escolha uma opção|\n-------------");
    System.out.println("| 1 - Vetor |\n| 2 - Lista |\n-------------");

    boolean loop = true;

    int indice = entrada.nextInt();

    if (indice == 1) {
        System.out.println("""
                        ---------------
                        |    Vetor    |
                        ---------------
                        """);
        System.out.println("""
                | 1 - Inserir dado   |
                | 2 - Alterar dado   |
                | 3 - Pesquisar dado |
                | 4 - Mostrar dados  |
                | 4 - voltar         |
                """);

        while (loop == true) {
            switch (indice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Escolha uma das opções acima:");
            }
        }
    }
    else {
        System.out.println("""
                ---------------
                |    Lista    |
                ---------------
                        """);
        System.out.println("""
                | 1 - Inserir dado   |
                | 2 - Alterar dado   |
                | 3 - Excluir dado   |
                | 4 - Pesquisar dado |
                | 5 - Mostrar dados  |
                | 6 - voltar         |
                """);

        while (loop == true) {
                switch (indice) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        loop = false;
                    default:
                        System.out.println("Escolha uma das opções acima:");
                }
            }
        }
    }
}
//                    System.out.println("Teste de implementação de lista");
//                    Lista lista = new Lista();
//                    lista.adiciona(1);
//                    lista.adiciona(2);
//                    lista.adiciona(3);
//                    lista.adiciona(4);
//                    lista.adiciona(5);
//                    System.out.println(lista);

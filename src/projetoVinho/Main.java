package projetoVinho;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int escolha = 0;
        int qntVinho = 0;
        boolean loop = true;
        Scanner leitor = new Scanner(System.in);
        Vinho v1 = new Vinho();     // Implementar algo para criar objetos automaticamente

        while (loop) {      // Loop principal
            System.out.println("----------MENU----------");
            System.out.println("1 - Cadastrar vinho");
            System.out.println("2 - Verificar preço");
            System.out.println("3 - Mostrar vinho");
            System.out.println("4 - Sair");

            while (true) {      // Enquanto o usuário não informar uma opção válida, o loop não é finalizado
                System.out.print("\nQual sua escolha? ");

                try {
                    escolha = leitor.nextInt();

                    if (escolha < 1 || escolha > 4) {
                        System.out.println("Digite uma opção válida");
                    } else {
                        break;
                    }
                } catch (Exception e) {
                    System.out.println("Digite apenas números");
                    leitor.next();
                }
            }

            switch (escolha) {
                case 1:
                    System.out.print("Nome: ");
                    v1.setNome(leitor.next());

                    System.out.print("Tipo: ");
                    v1.setTipo(leitor.next());

                    System.out.print("Preço: R$");
                    v1.setPreco(leitor.nextDouble());

                    System.out.print("Safra: ");
                    v1.setSafra(leitor.nextInt());

                    break;
                case 2:
                    boolean retorno = v1.verificaPreco();

                    if (retorno) {
                        System.out.println("Produto em oferta");
                    } else {
                        System.out.println("Produto com o preço normal");
                    }

                    break;
                case 3:
                    System.out.println(v1.toString());
                    break;
                case 4:
                    loop = false;
            }
        }
    }
}

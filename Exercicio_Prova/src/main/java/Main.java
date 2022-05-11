import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Arquivo a = new Arquivo();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        List<Carrinho> carrinhos = new ArrayList<>();

        while (flag) {
            System.out.println("1 - Salvar as informações do carrinho no arquivo.txt");
            System.out.println("2 - Mostrar as informações dos carrinhos salvos no arquivo");
            System.out.println("3 - Ordenar os carrinhos em ordem crescente de velocidade");
            System.out.println("4 - Ordenar os carrinhos em ordem decrescente de velocidade");
            System.out.println("5 - Sair!");

            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {

                case 1:
                    Carrinho carrinho = new Carrinho();
                    System.out.println("Entre com o nome do jogador: ");
                    carrinho.setNomeJogador(sc.nextLine());

                    System.out.println("Entre com a velocidade do carrinho: ");
                    try {
                        carrinho.setVelocidade(sc.nextInt());
                    } catch (Exception e) {
                        System.out.println(e);
                        break;
                    }

                    System.out.println("Entre com o chassi do carrinho: ");
                    sc.next();
                    try{
                        carrinho.setChassi(sc.nextLine());
                    } catch (Exception e){
                        System.out.println(e);
                        break;
                    }

                    a.escrever(carrinho);
                    break;

                case 2:
                    carrinhos = a.ler();

                    for (Carrinho c : carrinhos) {
                        System.out.println(c.getNomeJogador());
                        System.out.println(c.getVelocidade());
                        System.out.println(c.getChassi());
                    }
                    break;

                case 3:
                    carrinhos = a.ler();
                    Collections.sort(carrinhos);

                    for (Carrinho c : carrinhos) {
                        System.out.println(c.getNomeJogador());
                        System.out.println(c.getVelocidade());
                        System.out.println(c.getChassi());
                    }
                    break;

                case 4:
                    carrinhos = a.ler();
                    Collections.sort(carrinhos, Collections.reverseOrder());

                    for (Carrinho c : carrinhos) {
                        System.out.println(c.getNomeJogador());
                        System.out.println(c.getVelocidade());
                        System.out.println(c.getChassi());
                    }
                    break;

                case 5:
                    flag = false;
                    break;
            }
        }
    }
}

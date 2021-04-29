package Aula13;

import java.util.ArrayList;
import java.util.Scanner;

/*Cliente indicam o prato desejado (pizza grande, xis filé, prato executivo, ala minuta), a quantidade (1, 2, 3 ou mais)
que desejam e podem fazer observações (sem cebola, sem salsa, bem passado). registrar todos os pedidos que entram para
serem atendidos. Cada pedido possui a identificação do cliente (nome, endereço, telefone) e a lista de todos os itens
 solicitados. Os pedidos ficam enfileirados e vão sendo atendidos
  pela ordem em que foram recebidos. Os pedidos já atendidos podem ser descartados.
 */

public class Tela {

    Pedido pedidos;
    ArrayList<Pedido> arrayPedidos;

    public Tela() {

    }

    public void show() {
        //VARIAVEIS
        Scanner input = new Scanner(System.in);
        int op = 0;
        int x = 1;

        //MENUS
        String menuPrincipal = """
                1- Adicionar cliente
                2- Finalizar pedido
                """;
        String menuPratos = """
                1- Pizza Grande
                2- Xis filé
                3- Prato executivo
                4- À la minuta
                """;

        while (true) {
            System.out.println(menuPrincipal);
            op = input.nextInt();
            if (op < 1 || op > 2) {
                System.out.println("Opção Inválida, tente novamente");
            } else if (op == 1) {
                pedidos = new Pedido();
                System.out.println("Insira o nome do cliente");
                pedidos.setNome(input.nextLine());
                input.next();
                System.out.println("Insira o endereço do cliente");
                pedidos.setEndereco(input.nextLine());
                input.next();
                System.out.println("Insira o telefone do cliente");
                pedidos.setTel(input.nextLine());
                input.next();
                System.out.println("ADICIONANDO PRATOS");
                while (x > 0) {
                    System.out.println(menuPratos);
                    System.out.println("Digite a opção do prato desejado, a quantidade e se precisar, alguma observação.");
                    int prato = input.nextInt();
                    System.out.println("insira a quantidade");
                    int qtde = input.nextInt();
                    System.out.println("OBS: ");
                    String obs = input.nextLine();
                    pedidos.addPrato(prato,qtde,obs);
                    arrayPedidos.add(pedidos);
                    System.out.println("Voce deseja adicionar mais um prato?");
                    System.out.println("1- SIM\n2- NÃO");
                    op = input.nextInt();
                    if (op == 1) {
                        x = 1;
                    }else{
                        x=0;
                    }
                }
            } else {

                for (int i = 0; i < arrayPedidos.size(); i++) {
                    Pedido pedido = this.arrayPedidos.get(i);
                    String ble = pedido.getNome();
                }
            }
        }
    }
}

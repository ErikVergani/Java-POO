package Aula10;

/*O depósito de caldo de cana (já fermentado por 24 horas) tem capacidade para 100 litros e o reservatório de cachaça
 produzida tem capacidade para 500 litros. Ao iniciar uma produção esta não poderá ser interrompida, ou seja, se o
  reservatório não estiver cheio será produzida cachaça com a quantidade de caldo existente. Com cada litro de caldo de
  cana é possível fazer 0,40 litros de cachaça e isso deixará no primeiro reservatório um resíduo de 0,20 litros que é
  drenado, no final da produção, para um outro reservatório intermediário com capacidade para 100 litros. A cachaça
  pronta pode ser retirada do reservatório final para garrafas com capacidade para 750 ml cada uma.

1-	abastecer o reservatório com caldo de cana (não precisa completar),
2-	limpar (jogar fora) o reservatório de resíduos (sempre esvaziar completamente)
3-	engarrafar a cachaça produzida (ou parte da cachaça produzida, conforme o tamanho das garrafas).
Você também poderá produzir cachaça com o líquido (caldo de cana) existente no primeiro reservatório, mas para isso é
preciso saber se há espaço para os resíduos e para o líquido que será produzido. A qualquer tempo é possível consultar
o nível de cada reservatório; o número de garrafas produzidas no estoque da fábrica de cachaça e o número de vezes que
a máquina foi usada (contador de bateladas).
*/

public class Alambique {

    public static void main(String[] args) {

        MaquinaAlambique maq = new MaquinaAlambique();
        Tela tela = new Tela(maq);
        tela.show();
        System.exit(0);
    }
}

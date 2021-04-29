package Aula2;
import java.util.Random;

/*MÓDULO+VETOR: Nossa turma adora jogar na Mega Senna, principalmente quando o prêmio está acumulado. Faça um programa
que produz e exibe 10 jogos da Mega Senna. O programa deve conter um módulo que para gerar os jogos (preencher um vetor
de 6 posições de forma aleatória).*/

public class ex5 {
    public static void main(String[] args) {
        System.out.println("Os 6 jogos da semana são:");
        
        for (int i = 0; i < 10; i++) {
            System.out.println();
            for (int j = 0; j < 6; j++) {
                System.out.print(gerarJogos()[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static int[][] gerarJogos() {
        Random random = new Random();
        int[][] jogos = new int[10][6];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                jogos[i][j] = random.nextInt(10);
            }
        }
        return jogos;
    }
}

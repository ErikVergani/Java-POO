package Aula1;
import java.util.Random;

public class ex8 {
    public static void main(String[] args) {

        Random ale = new Random();
        int vet[] = new int[6];

        for (int i = 0; i < vet.length; i++) {
            vet[i] = ale.nextInt(20);
            System.out.print(vet[i]+" ");
        }
    }
}

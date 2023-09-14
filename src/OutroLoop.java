import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Diga a sua avaliação para o filme ou -1 para encerrar");
            nota = input.nextDouble();
            if(nota != -1) {
                mediaAvaliacao += nota;
                totalDeNotas++;
            }
        }

        System.out.println("Média de avaliações: " + mediaAvaliacao / totalDeNotas);
    }
}

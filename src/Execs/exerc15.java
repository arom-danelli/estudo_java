package Execs;

import java.util.Scanner;

public class exerc15 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o horario inicial da partida. Sem os minutos.");
        int horaInicial = sc.nextInt();
        System.out.println("Digite o horario que terminou a partida. Sem os minutos");
        int horaFinal = sc.nextInt();

        int duracao;
        if (horaInicial < horaFinal) {
            duracao = (horaInicial - horaFinal)*-1;

        } else {
            duracao = 24 - horaInicial + horaFinal;
        }


        System.out.println("A partida durou "+duracao+" horas");
        sc.close();

    }

}

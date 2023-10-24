import java.util.Scanner;

public class exec2 {
    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in); // Aqui chamamos a ferramenta que vai ler o que o usuario escreve.

        System.out.println("Digite um valor:");// Aqui o sistema vai emitir uma informação para o usuário.
        int n1 = sc.nextInt();// E aqui, aquela ferramenta que chamamos vai ler o que o usuário escreveu.

        System.out.println("Digite outro valor:");// a mesma coisa aqui
        int n2 = sc.nextInt();// e aqui

        int total = n1 + n2; // injetamos na variavel criada na hora, o resultado da soma.

        System.out.println("SOMA" + total);// e mostramos esse resultado usando concatenação.

        sc.close();// essa etapa é para "mandar embora" a ferramenta que chamamos. 

    }
}

import java.util.Scanner;

public class exerc16 {

    public static void main(String[] args) throws Exception {

        System.out.println("============================================================");
        System.out.println("         ==================================");
        System.out.println("         =CARDÁPIO LANCHONETE BABY BABADOO=");
        System.out.println("         ==================================");
        System.out.println("           COD | ESPECIFICAÇÃO   | PREÇO");
        System.out.println("           1     Cachorro Quente   R$4,00");
        System.out.println("           2     X-Salada          R$4,50");
        System.out.println("           3     X-Bacon           R$5,00");
        System.out.println("           4     Torrada Simples   R$2,00");
        System.out.println("           5     Refrigerante      R$1,50");
        System.out.println("===========================================================");

        Scanner sc = new Scanner(System.in);

        System.out.println("CÓDIGO DO PRODUTO CONSUMIDO: ");
        int prod = sc.nextInt();
        System.out.println("QUANTIDADE: ");
        int qt = sc.nextInt();

        double valor;

        if (prod == 1) {
            System.out.println("CACHORRO QUENTE | VALOR UNITÁRIO: R$4,00");
            valor = 4;

        } else if (prod == 2) {
            System.out.println("X-SALADA | VALOR UNITÁRIO: R$4,50 ");
            valor = 4.5;

        } else if (prod == 3) {
            System.out.println("X-BACON | VALOR UNITÁRIO: R$5,00");
            valor = 5;

        } else if (prod == 4) {
            System.out.println("TORRADA SIMPLES | VALOR UNITÁRIO: R$2,00");
            valor = 2;

        } else if (prod == 5) {
            System.out.println("REFRIGERANTE| VALOR UNITÁRIO: R$1,50");
            valor = 1.5;

        } else {
            System.out.println("CÓDIGO INVÁLIDO");
            sc.close();
            return;
        }

        double total = valor * qt;

        System.out.println("QUANTIDADE: " + qt);
        System.out.println("VALOR TOTAL: R$" + total);

        sc.close();

    }
}

package Execs;

public class exerc33 {
    public static void main(String[] args) {
        
        String original = "abcd EFG hi JKL mnop QRS";

        String s01 = original.toLowerCase();//diminui tudo
        String s02 = original.toUpperCase();//deixa tudo em caixa alta
        String s03 = original.trim();// retira o espaço em branco do final
        String s04 = original.substring(2);//inicia a partir do segundo caracter
        String s05 = original.substring(2,9);//começa do segundo e vai até o nono
        String s06 = original.replace('a', 'x');//troca um caracter por outro
        String s07 = original.replace("abc","xyz");//troca uma sequencia de caracteres por outra sequencia.
        int i = original.indexOf("bc");//mostra a partir de qual posição aparece os caracteres informados.
        int j = original.lastIndexOf("op");//mostra qual a ultima posição que aparece os caracteres informados.

        System.out.println("Original: - "+ original+ " -");
        System.out.println("ToLowerCase: - "+ s01+ " -");
        System.out.println("ToUpperCase: - "+ s02+ " -");
        System.out.println("Trim: - "+ s03+ "-");
        System.out.println("Substring(2): - "+ s04+ " -");
        System.out.println("Substring(2,9): - "+ s05+ " -");
        System.out.println("Replace('a','x'): - "+ s06+ " -");
        System.out.println("Replace('abc','xyz'): - "+ s07+ " -");
        System.out.println("Index Of 'bc': - "+ i+ " -");
        System.out.println("Last index of 'op': - "+ j+ " -");




    }
}

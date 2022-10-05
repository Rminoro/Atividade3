import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        float a, b, c;

        Scanner S = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        a = S.nextFloat();
        System.out.println("Digite o segundo numero");
        b = S.nextFloat();
        c = (a + b);
        System.out.println("A soma dos dois numeros é " + c);
    }
}

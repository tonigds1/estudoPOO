package POO;
import java.util.Scanner;

public class conversao {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        float cel, far;
        System.out.println("Digite uma temperatura em Celcius:");
        cel = dado.nextFloat();
        far = ((cel*9)/5) + 32;
        System.out.print("A temperatura "+ cel + " para Fahrenheit é de "+ far);

    }
}

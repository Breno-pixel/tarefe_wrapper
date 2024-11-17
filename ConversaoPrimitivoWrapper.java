import java.util.Scanner;

public class ConversaoPrimitivoWrapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número decimal (float):");
        float numeroPrimitivo = scanner.nextFloat();

        Float numeroWrapper = Float.valueOf(numeroPrimitivo);

        System.out.println("Valor em tipo primitivo (float): " + numeroPrimitivo);
        System.out.println("Valor em tipo Wrapper (Float): " + numeroWrapper);


        scanner.close();
    }
}



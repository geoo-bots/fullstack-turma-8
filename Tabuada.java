import java.util.Scanner;
public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        System.out.printf("Tabuada do %d :", numero);

        for(int i =0; i<=10; i++){
            System.out.printf("%d x %d = %d \n", numero, i, (numero*i));
        }
    
    }
}

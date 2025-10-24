import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma nota: ");
        double n1 =  sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double n2 = sc.nextDouble();
        double media = n1+n2/2;
        System.out.println("A média das notas é "+ media);

        if(media >= 7){
            System.out.println("Aprovado.");
        }else{
            System.out.println("Reprovado.");
        }
        sc.close();
    }
}
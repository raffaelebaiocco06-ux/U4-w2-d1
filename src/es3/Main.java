package es3;
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

 ContoCorrente c1= new ContoCorrente("Mario",100);
        ContoOnLine c2= new ContoOnLine("Mauro",300,100);
        try{
            System.out.println("Prelievo conto corrente:");
            double cifra=scanner.nextDouble();
            c1.preleva(cifra);
            System.out.println("Saldo: " + c1.restituisciSaldo());
            // C2
            System.out.println("Prelievo conto ONLINE:");
            double cifra2=scanner.nextDouble();
            c2.preleva(cifra2);
            System.out.println("Saldo: " + c2.restituisciSaldo());


        }catch(BancaException e){
            System.out.println("Errore: " + e.getMessage());

        }
        scanner.close();


    }
}

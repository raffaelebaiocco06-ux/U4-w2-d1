package es2;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args){
Scanner scanner=new Scanner(System.in);

        try{
            System.out.println("quanti Km hai percorso");
            int km=   parseInt(scanner.nextLine());
            System.out.println("quanti Litri hai consumato?");
            int L=   parseInt(scanner.nextLine());
            int consumo = km / L;
            System.out.println("Hai fatto " + consumo + " km/l");
        }catch (ArithmeticException e){
            System.out.println("I litri non posso essere "+ e.getMessage());
        }
        catch(Exception e){
            System.out.println("Errore  " + e.getMessage());
        }

    }
}

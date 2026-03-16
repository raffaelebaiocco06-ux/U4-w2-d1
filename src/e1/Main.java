package e1;
import java.util.Scanner;
public class Main{

    public static void main(String[] args){

Scanner scanner= new Scanner(System.in);

        int [] array=new int[5];
        for(int i=0;i< array.length;i++){
            array[i]=(int)(Math.random()*10)+1;
            System.out.println("array " + array[i]);
        }
        int intero=1;
while(intero!=0){
    System.out.println("inserisci l'intero che preferisci ");
     intero= scanner.nextInt();
     if(intero==0){
         break;
     }

    System.out.println("nella posizione che preferisci ");
    int pos= scanner.nextInt();
    try{
        array[pos]=intero;

    }
    catch(Exception e){
        System.out.println("la posizione inserita e' troppo grande ");
    }

}
        for(int i=0;i< array.length;i++){
            System.out.println("array " + array[i]);
        }



    }


}

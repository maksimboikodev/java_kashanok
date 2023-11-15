import java.util.Random;
public class Ex13 {
    public static void main(String[] args) {
        Random rand = new Random(); 
        int upperbound = 101;

        int [] array = new int[10];

        for(int i=0; i < 10; i++){
            array [i] = rand.nextInt(upperbound);
            }

        int n=array[0];
        for (int i = 0; i < 10; i++) {
             if (array[i]> n){
                n=array[i];
             }   
            }
            System.out.println ("Максимальное число = "+n);        
    }
    }
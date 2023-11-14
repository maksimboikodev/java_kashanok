import java.util.Random;
public class Ex14 {
    public static void main(String[] args) {
        Random rand = new Random(); 
        int upperbound = 10;

        int array[] = new int[10];
        for(int i=0; i < 10; i++){
            array [i] = rand.nextInt(upperbound);
            }

        int cap=0;
        int index=0;
        for (int i = 0; i < 10; i++) {
             if (array[i]> cap){
                cap=array[i];
                index=i;
             }   
            }
            System.out.printf("Max значение - %s В ячейке %s", cap, index);
            
            for (int i = 9; i >= 0; i--) {
                if (array[i]< cap){
                   cap=array[i];
                   index=i;
                }   
               }
            System.out.printf("Min значение - %s В ячейке %s", cap, index);       
    }
    }
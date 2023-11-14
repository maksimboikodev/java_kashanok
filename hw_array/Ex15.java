import java.util.Random;
public class Ex15 {
    public static void main(String[] args) {
        Random rand = new Random(); 
        int upperbound = 10;

        int array[] = new int[10];
        for(int i=0; i < 9; i++){
        array [i] = rand.nextInt(upperbound);
        }
            
        System.out.println("Массив перед реверсом:");
      
        for (int i = 0; i < array.length; i++) {
        System.out.print(array[i]);
        } 
        
        for (int i = 0; i < array.length / 2; i++) {
        int temp = array[i];
        array[i] = array[array.length - 1 - i];
        array[array.length - 1 - i] = temp;
        } 
        
        System.out.println("\nМассив после реверса:");
        
        for (int i = 0; i < array.length; i++) {
        System.out.print(array[i]);
        } 
        }
    }
  
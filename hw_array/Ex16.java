/*Определите сумму элементов одномерного массива, расположенных между
минимальным и максимальным значениями.*/
public class Ex16 {
    public static void main(String[] args) {
        int array [] = {1,7,5,6,3,15,10,5,4,6,4,2,8,6,9};
        
        System.out.print(array.length);
        
        int cap=0;
        int index=0;
        for (int i = 0; i < array.length; i++) {
             if (array[i]> cap){
                cap=array[i];
                index=i;
             }   
            }
            System.out.printf("Max значение - %s В ячейке %s", cap, index);
            
            for (int i = array.length-1; i >= 0; i--) {
                if (array[i]< cap){
                   cap=array[i];
                   index=i;
                }   
               }
            System.out.printf("Min значение - %s В ячейке %s", cap, index);       
    }
    }
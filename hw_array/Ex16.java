/*Определите сумму элементов одномерного массива, расположенных между
минимальным и максимальным значениями.*/
public class Ex16 {
    public static void main(String[] args) {
        int [] array  = {1,7,50,6,3,15,10,5,23,6,4,2,8,6,9};

        int cap=array[0];
        int index=0;
        for (int i = 0; i < array.length; i++) {
             if (array[i]> cap){
                cap=array[i];
                index=i;
             }   
            }
            System.out.printf("Max значение - %s В ячейке %s", cap, index);
            int IndexStart=index;
            for (int i = array.length-1; i >= 0; i--) {
                if (array[i]< cap){
                   cap=array[i];
                   index=i;
                }   
               }
            System.out.printf("  Min значение - %s В ячейке %s", cap, index);
        int IndexStop=index;
        int s=Math.abs(IndexStart-IndexStop);
        System.out.println(s);
        int sum=0;
        for (int i = s; i >= 0; i--) {
           sum+= array[i];
        }
        System.out.printf("  Сумма чисел между min&max = %s ", sum);
    }
    }
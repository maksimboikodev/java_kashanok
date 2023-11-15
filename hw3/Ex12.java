public class Ex12 {
    public static void main(String[] args) {
int num=5;
int res=0;
int k=1;
            for (int i=1;k<=num;i++){
        if (i%3==0) {
            res += i;
            k++;

    }
}

        System.out.println("Сумма первых n целых чисел, которые делятся на 3 = "+res );
        }
    }
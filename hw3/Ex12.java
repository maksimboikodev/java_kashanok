public class Ex12 {
    public static void main(String[] args) {
int num=12;
int res=0;
            for (int i=1;i<=num;i++){
        if (i%3==0){
        res+=i;
    }
}
            System.out.println("Сумма первых n целых чисел, которые делятся на 3 = "+res );
        }
    }
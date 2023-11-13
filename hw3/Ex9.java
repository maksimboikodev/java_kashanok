public class Ex9 {
    public static void main(String[] args) {

        double averageSum = 0;
        double sum = 1;
        int n = 0;
        int x = (int)(Math.random() * 20);
        while(x != 0) {
        sum *= x;
        n ++;
        x = (int)(Math.random()*20);
       // System.out.println(x);
        }
       // System.out.println(n);
        //System.out.println(sum); 
        if(n != 0){
        averageSum = sum / n;
        } else { 
        averageSum = 0;
        }
        System.out.println("среднее:" + averageSum); 

}
}
import java.util.Random;
public class Ex8 {
    public static void main(String[] args) {

        Random rand = new Random(); 
        int upperbound = 101;
        int money = rand.nextInt(upperbound);
        int x=money%10;
        if (money%100>=11&&money%100<=14)
                {
                System.out.println(money+ " рублей");
                }
        else
        {
        switch (x)
        {
        case 1:
            System.out.println(money+ " рубль");
            break;
        case 2:
        case 3:
        case 4:
            System.out.println(money+ " рубля");
            break;
            default:                
            System.out.println(money+ " рублей");
            }
        }
    }

}

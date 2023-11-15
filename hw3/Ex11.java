public class Ex11 {
    public static void main(String[] args) {
int num=7;
int temp;
boolean res=true;
        if (num<=1){
            System.out.println("Натуральное число 1 не является ни простым, ни составным");
        } else {
            for (int i=2;i<=Math.sqrt(num); i++) {
                temp = num % i;
         if (temp == 0) {
            res = false;
            break;
         }
      }
      if(res) {
        System.out.println(num + " - простое число");
     } else {
        System.out.println(num + " - составное число");
            }
        }
        }
    }
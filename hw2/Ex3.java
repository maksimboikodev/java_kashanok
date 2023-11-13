public class Ex3 {
    public static void main(String[] args) {

int s=1154570;

int sec=s%60;
int m=(s-sec)/60;
System.out.println(m + " минут " + sec + "секунд");
int min=m%60;
int h = (m - min) / 60;
System.out.println(h + " часов "+min + " минут " + sec + "секунд");
int hour=h%24;
int d=(h-hour)/24;
System.out.println(d + " дней "+hour + " часов "+ min + " минут " + sec + "секунд");
int day=d%7;
int w=(d-day)/7;
System.out.println(w + " недель "+day + " дней "+hour + " часов "+ min + " минут " + sec + "секунд");
   }
   }
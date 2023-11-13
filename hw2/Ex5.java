public class Ex5 {
    public static void main(String[] args) {

int s=4234;
int a=s%10;
s=s/10;
int b=s%10;
s=s/10;
int c=s%10;
s=s/10;

boolean d= (a!=b)&(a!=c)&(a!=s)&(b!=c)&(b!=s)&(c!=s);
System.out.print("Все цифры числа различны? - "+d); 

   }
   }
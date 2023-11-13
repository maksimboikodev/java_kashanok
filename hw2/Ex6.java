public class Ex6 {
    public static void main(String[] args) {

int s=107;
int a;
if (((s/100)>0)&&((s/100))<10) {
       System.out.println("Число трехзначное- YES");   
}else{
    System.out.println("Число трехзначное- NO"); 
}

if ((a=s%100)==7){
    System.out.println("Последняя цифра 7"); 
}else{
    System.out.println("Последняя цифра не 7, а "+a );
}

if ((s%2)==0){
    System.out.println("Четное"); 
}else{
    System.out.println("Нечетное" );
}

   }
   }
public class Ex7 {
    public static void main(String[] args) {

int a=1;//сторона прямоугольника
int b=80;//сторона прямоугольника
double d,r=15;//r радиус круга
d=Math.sqrt((a*a)+(b*b));//диагональ прямоугольника

if ((d/2)<=r){
    System.out.println("Можно закрыть");
}else{
    System.out.println("Нельзя закрыть");
}

}
}
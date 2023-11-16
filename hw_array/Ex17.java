/*Создать двухмерный квадратный массив, и заполнить его «бабочкой», т.е
таким образом:
1 1 1 1 1
0 1 1 1 0
0 0 1 0 0
0 1 1 1 0
1 1 1 1 1*/
public class Ex17 {
    public static void main(String[] args) {
        char arr[][]=new char[5][5];//для прорисовки 0/1 массив int
        int i,j;

        for (i=0;i<arr.length/2+1;i++){
            for (j=0;j<arr[i].length;j++){
                if ((j<i) || (j>=(arr[i].length-i)))
                    arr[i][j]=' ';//0
                else
                    arr[i][j]='*';//1
            }
        }
        for (i=arr.length-1; i>=arr.length/2+1; i--){
            for (j=0; j<arr[i].length; j++){
                if ((j<(arr[i].length-1-i)) || (j>i))
                    arr[i][j]=' ';
                else
                    arr[i][j]='*';}
        }
        for (i=0;i<arr.length;i++){
            for(j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println(" ");
        }
    }
}

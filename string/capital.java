package string;
// first letter capital 
public class capital {
    public static void main(String[] args) {
    String str="you should watch demon slayer once in your life.";
    char [] arr=str.toCharArray();
    for(int i=0; i<=arr.length-1; i++){
       if(i==0){
        arr[i]=Character.toUpperCase(arr[i]);
       }
       if(arr[i]==' '){   //ham character compare kr rahe hai isliye single chords me likkha( ' ')
        arr[i+1]=Character.toUpperCase(arr[i+1]);
       }
    } 
    System.out.println(arr);
}
}

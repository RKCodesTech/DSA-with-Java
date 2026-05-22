package string;
//print no. alternate means print name of 0,2,4,6,8.... index
public class alternate {
    public static void main(String[] args) {
        String str="riya kosta neetu kosta anil kosta ";
        String [] arr=str.split(" ");
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                System.out.println(arr[i]);
            }
        }
    }
}

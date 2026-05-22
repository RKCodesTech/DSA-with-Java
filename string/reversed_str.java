package string;
public class reversed_str {
    public static void main(String[] args) {
    // String str="riya kosta";
    // String rev="";
    // char[] arr = str.toCharArray();   
    // for(int i=arr.length-1;i>=0; i--){
    //   rev+=arr[i];
    // }
    // System.out.println(rev);


    
    // char[] arr= str.toCharArray();
    // for(int i=0; i>arr.length-1; i++){
    //   rev+=arr[i];
    // }
    // System.out.println(rev);
     String str="riya kosta";
    String rev="";
       
    for(int i=str.length()-1;i>=0; i--){
      rev+=str.charAt(i);
    }
    System.out.println(rev);
    }
}

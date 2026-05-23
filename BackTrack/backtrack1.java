package BackTrack;
class backtack1{
public static void PrintPermutation(String str, int index,String perm){
    if(str.length()==0){
        System.out.println(perm);
        return;
    }
    for(int i=0;i<str.length();i++){
        char currentChar =str.charAt(i);
        String newString=str.substring(0, i)+str.substring(i+1);
        PrintPermutation(newString, index+1, currentChar+perm);
    }
}
public static void main(String[] args) {
    String str="ABC";
    PrintPermutation(str,0,"");
}
}
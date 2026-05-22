package string;
public class longestword {
    public static void main(String[] args) {
        String str="Riya is very beutiful";
        String longest =" ";
        String current=" ";
        for(int i=0;i<str.length();i++){
           if(str.charAt(i)!=' '){
            current+=str.charAt(i);
        }else{
        if(longest.length()<current.length()){

               longest=current;
            }
            current="";
        }
    }
    if(current.length()>longest.length()){
        longest=current;
    }
    System.out.println(longest);
}
}
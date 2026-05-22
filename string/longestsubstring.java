package string;

public class longestsubstring {
    public static void main(String[] args) {
        String str="abc";
        int longest=0;
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
               String sub=str.substring(i,j);
                if(longest<sub.length()){
                 longest=sub.length();
                }
            }
            System.out.println(longest);
        }
    }
}

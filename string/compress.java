
public class compress {
    public static void main(String[] args) {
        String str="aaabbbacccccd";
        int count=0;
        for(char i='a';i<='z';i++){
            count=0;
            for(int j=0;j<str.length();j++){
                if(i==str.charAt(j)){
                    count++;
                }
            }
            if(count>0)System.out.print(i+"" +count);
        }
    }
}
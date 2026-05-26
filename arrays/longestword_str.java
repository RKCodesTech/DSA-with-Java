package arrays;//using arr
public class longestword_str {
 public static void main(String[] args) {
    String str1="nezuko inosukef ki haai";
    String[] str=str1.split(" ");
    String longestword="";
    for(int i=0; i<str.length;i++){
    if(str[i].length()>longestword.length()){
      longestword=str[i];
    }
    
    }System.out.print(longestword);
 }
}

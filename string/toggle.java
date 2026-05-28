package string;
public class toggle {
    public static void main(String[] args) {
        String str="RiYA";
        String result="";
        for(int i=0; i<str.length();i++){
            char c=str.charAt(i);
            if(c>='a'&& c<='z'){
                result+=(char)(c-32);//type casting 
            }else if(c>='A'&&c<='Z'){
                result+=(char)(c+32); // c+32 means adding 32 in character's ascii
            }
            else{
                result+=c;
            }
        }
        System.out.println("Toggled : "+result);
    }
}

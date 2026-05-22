package string;

public class nonrepeatingstr {

    public static void main(String[] args) {
        String str="my name is riya";
        for(int i=0;i<str.length();i++){
            boolean repeated=false;
            for(int j=0; j<str.length(); j++){
                if(str.charAt(i)==str.charAt(j)&& i!=j){
                    repeated=true;
                    break;
                }
            }
            if (!repeated && str.charAt(i)!=' '){
                System.out.println("non repeated character "+str.charAt(i));
            }
        }
    }
}
   


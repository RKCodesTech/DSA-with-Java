public class characterfrequency {
    public static void main(String[] args) {
        String str="my name is riya kosta";
        int count=0;
        str=str.toLowerCase();
        for(char i='a';i<='z'; i++){
             count=0;
            for(int j=0; j<str.length();j++){
                if(i==str.charAt(j))
                    count++;
            }
            if(count>0){
                System.out.println(   i + " is " + count);
            } 
           
            
        }
        
    }
}

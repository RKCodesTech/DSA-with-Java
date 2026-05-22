package string;
public class casesensitivity {
    public static void main(String[] args) {
        String str="Riya Kosta Neetu Kosta";
        String [] arr=str.split(" ");
        
        for(int i=0;i<arr.length;i++){
            String word=arr[i];
            if(word.length()==0)continue;   // when space found in array it will skip that
               if(Character.isUpperCase(word.charAt(0))){
                System.out.println("perfect string");

            }
            else{
                System.out.println("Case Sensitive first word of every letter must start with Uppercase");
            }
        }
        
    }
}
 
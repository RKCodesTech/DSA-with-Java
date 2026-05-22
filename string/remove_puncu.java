package string;
class remove_puncu{
    public static void main(String[] args) {
        String str="riya.kost$a";
        
        char[] arr=str.toCharArray();
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]=='.'||arr[i]=='$'||arr[i]=='@'||arr[i]=='!'){
               
            }else{
                System.out.print(arr[i]);
            }
        
    }
    }
}
package string;

public class wordfrequency {
    public static void main(String[] args) {
        
        String str="you are the best best as demonslayer";
        String[] arr=str.split(" ");
        String tem="";
        for(int i=0;i<arr.length;i++){
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                
                if(arr[i].equals(arr[j])){
                    count++;
                    arr[j]="0";
                }
            }  
                if(!arr[i].equals("0")){
                    
                    System.out.println(arr[i]+""+count);  
            }
        }

    }

}

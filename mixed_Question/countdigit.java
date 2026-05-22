

public class countdigit {
    
    public static void main(String[] args){
        int num = 48291;
        int count = 0;

        while (num > 0) {
            num = num / 10;
            count++;
        }

        System.out.println(count);
    }
}


package Generic;

public class InroEnum {
    enum day{
        SONDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THUSDAY,
        FRIDAY
    } 
    
    public static void main(String[] args) {
day today = day.MONDAY;// they are already objects no need to create with new

System.out.println(today);
    
    }
}

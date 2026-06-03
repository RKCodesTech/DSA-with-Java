package Generic;

public class IntroEnum {

    enum Day {
        MONDAY("Work Day"),
        SUNDAY("Holiday");

        private String type;

        Day(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }
    }

    public static void main(String[] args) {

        System.out.println(Day.MONDAY);
        System.out.println(Day.MONDAY.getType());

        System.out.println(Day.SUNDAY);
        System.out.println(Day.SUNDAY.getType());
    }
}
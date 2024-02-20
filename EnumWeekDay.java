package javaAssighnment;
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public boolean isWeekend() {
        return this == SATURDAY || this == SUNDAY;
    }
}

public class EnumWeekDay {
    public static void main(String[] args) {
        Day today = Day.SUNDAY; // Assume today is Saturday

        if (today.isWeekend()) {
            System.out.println(today + " is part of the weekend.");
        } else {
            System.out.println(today + " is a weekday.");
        }
    }
}

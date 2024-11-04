package app;

public class Advisor implements DayOfWeek {
    @Override
    public void advice(Day day) {
        switch (day) {
            case Monday -> System.out.println("Monday advice: Make a to-do list at the end of the day");
            case Tuesday -> System.out.println("Tuesday advice: Plan your free time");
            case Wednesday -> System.out.println("Wednesday advice: Don't get carried away by deadlines");
            case Thursday -> System.out.println("Thursday advice: Make lists of things that don't require a lot of energy");
            case Friday -> System.out.println("Happy Friday!");
            case Saturday -> System.out.println("Saturday advice: visit the Lviv Opera House");
            case Sunday -> System.out.println("Sunday advice:  visit the House of Scientists");
            default -> System.out.println("Unknown day of the week");
        }
    }
}

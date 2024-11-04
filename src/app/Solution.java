package app;

public class Solution {
    public static void main(String[] args) {
        DayOfWeek advisor = new Advisor();
        advisor.advice(Day.Monday);
        advisor.advice(Day.Tuesday);
        advisor.advice(Day.Wednesday);
        advisor.advice(Day.Thursday);
        advisor.advice(Day.Friday);
        advisor.advice(Day.Saturday);
        advisor.advice(Day.Sunday);
    }
}

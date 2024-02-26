package pl.kriskensy;

public class StudentGroupX extends StudentGroup {
    private String dayOfTheWeek;

    public StudentGroupX(String groupName) {
        super(groupName);
    }

    public String getDayOfTheWeek() {
        return dayOfTheWeek;
    }

    public void setDayOfTheWeek(String dayOfTheWeek) {
        this.dayOfTheWeek = dayOfTheWeek;
    }

    @Override
    public void showGroupSchedule() {
        System.out.println("Java lessons on " + dayOfTheWeek);
    }

    @Override
    public void planFinalTest() {
        System.out.println("Java final test on " + dayOfTheWeek);
    }
}
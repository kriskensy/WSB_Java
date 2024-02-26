package pl.kriskensy;

public class StudentGroupK extends StudentGroup {
    private String dayOfTheWeek;

    public StudentGroupK(String groupName) {
        super(groupName);
    }

    public void setDayOfTheWeek(String dayOfTheWeek) {
        this.dayOfTheWeek = dayOfTheWeek;
    }

    public String getDayOfTheWeek() {
        return dayOfTheWeek;
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
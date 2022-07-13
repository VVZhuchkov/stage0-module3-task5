package lang.print.gaps.task5;

public class TimeConvertor {
    public void convert(float minutes) {
        final float SECONDS_IN_MINUTE = 60f;
        float seconds = minutes * SECONDS_IN_MINUTE;
        System.out.println(seconds);
    }
}

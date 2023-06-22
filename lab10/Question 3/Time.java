public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) throws HrsException, MinException, SecException {
        if (hours < 0 || hours > 24) {
            throw new HrsException("Invalid hours value");
        }
        if (minutes < 0 || minutes > 60) {
            throw new MinException("Invalid minutes value");
        }
        if (seconds < 0 || seconds > 60) {
            throw new SecException("Invalid seconds value");
        }

        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public static void main(String[] args) {
        try {
            Time time = new Time(25, 0, 0);
            System.out.println("Time: " + time.getHours() + ":" + time.getMinutes() + ":" + time.getSeconds());
        } catch (HrsException | MinException | SecException e) {
            e.printStackTrace();
        }
    }
}
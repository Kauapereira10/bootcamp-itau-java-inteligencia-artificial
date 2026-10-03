package exercicios;

public sealed abstract class Clock permits BRLClock, USClock{

    protected int hour;
    protected int minute;
    protected int second;

    public abstract Clock convert(Clock clock);

    public String getTime() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23) {
            throw new IllegalArgumentException("A hora deve estar entre 0 e 23.");
        }
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute > 59) {
            throw new IllegalArgumentException("Os minutos devem estar entre 0 e 59.");
        }
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second < 0 || second > 59) {
            throw new IllegalArgumentException("Os segundos devem estar entre 0 e 59.");
        }
        this.second = second;
    }
}

package exercicios;

public non-sealed class USClock extends Clock{

    private String periodIndicator;

    public void setHour(int hour) {
        this.periodIndicator = "AM";
        if ((hour > 12) && (hour <= 23)) {
            this.periodIndicator = "PM";
            this.hour = hour - 12;
        } else if (hour >= 24) {
            this.hour = 0;
        } else {
            this.hour = hour;
        }
    }

    @Override
    public String getTime() {
        return super.getTime() + " " + this.getPeriodIndicator();
    }

    @Override
    public Clock convert(Clock clock) {
        this.second = clock.getSecond();
        this.minute = clock.getMinute();
        switch (clock) {
            case USClock usClock -> {
                this.hour = usClock.getHour();
                this.periodIndicator = usClock.getPeriodIndicator();
            }
            case BRLClock brlClock -> {
                this.setHour(brlClock.getHour());
            }
        }
        return this;
    }

    public String getPeriodIndicator() {
        return periodIndicator;
    }

    public void setPeriodIndicator(String periodIndicator) {
        this.periodIndicator = periodIndicator;
    }
}

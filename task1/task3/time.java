package practice2.task1.task3;



class time {
    private int hour;
    private int minute;
    private int second;

    public time(int hour, int minute, int second) {
        this.setTime(hour, minute, second);
    }
    public void setTime(int hour, int minute, int second) {
        if (hour >= 0 && hour < 24 && minute >= 0 && minute < 60 && second >= 0 && second < 60) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        } else {
            System.out.println("Invalid time input!");
        }
    }
    public String toUniversal() {
        return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
    }
    public String toStandard() {
        int h = (this.hour == 0 || this.hour == 12) ? 12 : this.hour % 12;
        String amPm = (this.hour < 12) ? "AM" : "PM";
        return String.format("%02d:%02d:%02d %s", h, this.minute, this.second, amPm);
    }
    public void add(time t) {
        int totalSeconds = (this.hour * 3600 + this.minute * 60 + this.second) +
                (t.hour * 3600 + t.minute * 60 + t.second);


        this.hour = (totalSeconds / 3600) % 24;
        this.minute = (totalSeconds % 3600) / 60;
        this.second = totalSeconds % 60;
    }
}
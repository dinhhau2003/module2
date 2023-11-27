package ss4;

public class StopWatch {
    private long startTime,endTime;

    public StopWatch() {
    }

    public StopWatch(long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "StopWatch{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
    public void start(){
        startTime=System.currentTimeMillis();
    }
    public void stop(){
        endTime=System.currentTimeMillis();
    }
    public long getElapsedTime(){
        if (endTime == 0) {
            return System.currentTimeMillis() - startTime;
        } else {
            return endTime - startTime;
        }
    }
    
}

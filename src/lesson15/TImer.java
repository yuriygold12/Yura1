package lesson15;

public class TImer {

    private long start;
    private long end;
    private long resuts;

    public TImer() {
        this.start = 0;
        this.end = 0;
        this.resuts = 0;
    }


    public void startTime()
    {
        this.start = System.currentTimeMillis();
    }

    public void finishTime()
    {
        this.end = System.currentTimeMillis();
    }

    public long resutsTime()
    {
        return resuts = end - start;
    }
}

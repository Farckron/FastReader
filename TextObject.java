public class TextObject {
    private int totalWordCount = 0;
    private double totalTimeMilliseconds = 0.0;

    // constructor
    public TextObject() {
        this.totalWordCount = 0;
        this.totalTimeMilliseconds = 0.0;
    }

    public void incrementWordCount() {
        this.totalWordCount++;
    }

    public void incrementTimeMilliseconds(double milliseconds) {
        this.totalTimeMilliseconds += milliseconds;
    }

    public int getTotalWordCount() {
        return this.totalWordCount;
    }

    public double getTotalTimeMilliseconds() {
        return this.totalTimeMilliseconds;
    }
}
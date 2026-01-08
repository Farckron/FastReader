public class TextObject {
    private int totalWordCount = 0;

    // constructor
    public TextObject() {
        this.totalWordCount = 0;
    }

    public void incrementWordCount() {
        this.totalWordCount++;
    }

    public int getTotalWordCount() {
        return this.totalWordCount;
    }
}
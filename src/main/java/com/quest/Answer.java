public class Answer {
    String text;
    int nextQuestionId;

    public int getNextQuestionId() {
        return nextQuestionId;
    }

    public String getText() {
        return text;
    }

    public Answer(String text, int nextQuestionId) {
        this.text = text;
        this.nextQuestionId = nextQuestionId;
    }
}

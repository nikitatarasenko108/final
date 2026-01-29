import java.util.List;

public class Question {
    private final int id;
    private final String text;
    private final List<Answer> answers;
    private final boolean isFinal;

    public Question(int id, String text, boolean isFinal, List<Answer> answers) {
        this.id = id;
        this.text = text;
        this.isFinal = isFinal;
        this.answers = answers;
    }

    // Тоже добавь геттеры

    public boolean isFinal() {
        return isFinal;
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public List<Answer> getAnswers() {
        return answers;
    }
}
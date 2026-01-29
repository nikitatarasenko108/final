import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QuestRepository {
    Map<Integer, Question> questions = new HashMap<>();
    public Question  getQuestionById(int i){
        return questions.get(i);
    }

    public QuestRepository() {
        // Вопрос 1
        questions.put(1, new Question(
                1,
                "Ты теряешь память. Принять вызов НЛО?",
                false,
                List.of(
                        new Answer("Принять вызов", 2),
                        new Answer("Отклонить вызов", 3)
                )
        ));

        // Вопрос 2 (ветка успеха)
        questions.put(2, new Question(
                2,
                "Ты поднялся на мостик. Кто ты?",
                false,
                List.of(
                        new Answer("Рассказать правду о себе", 4),
                        new Answer("Лгать", 5)
                )
        ));

        // Вопрос 3 (ветка поражения)
        questions.put(3, new Question(
                3,
                "Ты отклонил вызов. Поражение.",
                true, // isFinal = true
                List.of() // ответов нет, это конец
        ));

        // ... и так далее по цепочке
    }
}

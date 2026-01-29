import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LogicServlet extends HttpServlet {
    QuestRepository questRepository = new QuestRepository();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      HttpSession session = req.getSession();
        String name = req.getParameter("name");
        if(name!= null){
            session.setAttribute("name", name);
        }

        String idParam = req.getParameter("id");
        int questionId = (idParam == null) ? 1 : Integer.parseInt(idParam);
        Question question = questRepository.getQuestionById(questionId);

        req.setAttribute("question", question);
        req.getRequestDispatcher("/game.jsp").forward(req, resp);
    }
}

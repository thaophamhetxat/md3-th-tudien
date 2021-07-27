import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "TuDien", value = "/index")
public class TuDien extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String, String> tuDien = new HashMap<>();
        tuDien.put("hello", "xin chao");
        tuDien.put("how", "the nao");
        tuDien.put("book", "quyen vo");
        tuDien.put("computer", "may tinh");
        String search = req.getParameter("txtsearch");
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        String result = tuDien.get(search);
        if (result != null) {
            writer.printf("WORD: " + search);
            writer.printf("Result: " + result);

        } else {
            writer.println("NOT POUND");
        }
        writer.println("</html>");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}

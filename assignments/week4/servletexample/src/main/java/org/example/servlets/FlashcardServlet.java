package org.example.servlets;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.models.Flashcard;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// Annotation Based Registration
@WebServlet(
        urlPatterns = "/flashcard",
        loadOnStartup = 2,
        initParams = {
                @WebInitParam(name = "flashcard-servlet-key", value = "flashcard-servlet-value"),
                @WebInitParam(name = "another-param", value = "another-value")
        })
public class FlashcardServlet extends HttpServlet {

    // This is bad practice since we need to create some sort of ObjectMapper object everytime we create a servlet
    private final ObjectMapper mapper = new ObjectMapper();

    @Override
    public void init() throws ServletException {
        System.out.println("[LOG] - FlashcardServlet Instantiated!");
        System.out.println("[LOG] - Init param flashcard-servlet-key: " + this.getServletConfig().getInitParameter("flashcard-servlet-key"));
        System.out.println("[LOG] - Init param test-init-key: " + this.getServletConfig().getInitParameter("test-init-key"));
        System.out.println("[LOG] - Context param test-init-key: " + this.getServletContext().getInitParameter("test-context-key"));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // Pretend this value came from the database
        Flashcard card = new Flashcard(123, "What does OOP stand for?", "Object Oriented Programming");
        String respPayload = mapper.writeValueAsString(card);
        resp.setContentType("application/json");
        resp.getWriter().write(respPayload);
    }
}

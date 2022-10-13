package org.example.servlets;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.models.AppUser;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;

@WebServlet("/users")
public class UserServlet extends HttpServlet {

    // TODO What if the other servlets need an objectmapper?? How do we share this reference across all classes?
    ObjectMapper mapper = new ObjectMapper();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        System.out.println("[LOG] - UserServlet Received a GET request" + LocalDateTime.now());
        //When we did our POST request before we basicaly parsed a JSON string into a java object now to do the reverse

        //Let;s emulate a value that may come from some data source
        AppUser someuser = new AppUser(123, "Jane", "Doe", "1234@rev.com", "jd123", "password");

        //We want to convert this java object into a json string
        ObjectMapper mapper = new ObjectMapper();
        String respPayload = mapper.writeValueAsString(someuser);
        resp.setStatus(200);
        resp.setContentType("application/json");
        resp.getWriter().write(respPayload);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPut(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doPost(req, resp);
        System.out.println("[LOG] - UserServlet Received a request" + LocalDateTime.now());

        //To print out from our input stream
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(req.getInputStream()));
//        String line;
//        while((line = bufferedReader.readLine()) != null){
//            System.out.println(line);
//        }

        ObjectMapper mapper = new ObjectMapper();
        AppUser newuser = mapper.readValue(req.getInputStream(), AppUser.class);
        System.out.println(newuser);


        resp.setStatus(204);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doDelete(req, resp);
    }
}

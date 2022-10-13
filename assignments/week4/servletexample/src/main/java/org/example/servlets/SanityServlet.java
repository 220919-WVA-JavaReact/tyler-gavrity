package org.example.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;

    //Whenever we want to create a servlet we'll extend the http servlet abstract class to handle our methods
    public class SanityServlet extends HttpServlet {
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

            //We'll just add some print line statement to check some information about the request
            System.out.println("[LOG] - SanityServlet received a request at " + LocalDateTime.now());
            System.out.println("[LOG] - Request URI" + req.getRequestURI());
            System.out.println("[LOG] - Request Method: " + req.getMethod());
            System.out.println("[LOG] - Request Header, example " + req.getHeader("example"));
            //We'll formulate a basic response to send back
            resp.setStatus(200); //default is 200

            resp.setHeader("Content-type", "plain/text");
            resp.setHeader("example-response-header", "some-example-value");
            resp.getWriter().write("This is the response payload");

        }

    }

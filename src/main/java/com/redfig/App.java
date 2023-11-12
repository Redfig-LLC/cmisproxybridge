package com.redfig;

import java.io.IOException;

import javax.servlet.ServletException;
// import java.io.IOException;
// import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
// import javax.servlet.http.HttpServletRequest;
// import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Hello world!
 *
 */
public class App extends HttpServlet {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    private static final long serialVersionUID = 1L;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String repoName = System.getProperty("redfig.reponame");
        String repoKey = System.getProperty("redfig.repokey");
        boolean repoKeyExists = repoKey.length() > 0;
        response.getWriter().println("<p>Hello! Repo is " + repoName + " and repoKey is present?: " + repoKeyExists);
    }
}

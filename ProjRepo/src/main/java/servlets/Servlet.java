package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Servlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //RequestHelper.getProcess(request, response);

    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

       // RequestHelper.postProcess(request, response);

    }
    public void doPut(HttpServletRequest request, HttpServletResponse response){
       // RequestHelper.putProcess(request, response);
    }

    public void deleteProcess(HttpServletRequest request, HttpServletResponse response){
//
    }
}

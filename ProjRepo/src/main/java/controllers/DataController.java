package controllers;

import com.google.gson.Gson;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

public class DataController {

    Object mObjectServices;
    Gson gson = new Gson();

    public DataController(Object newObjectServices) {
        this.mObjectServices = newObjectServices;
    }

    //This method should be called when we want to get a movie.
    public void getId(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String input = request.getAttribute("id").toString();
    }

    public void get(HttpServletRequest request, HttpServletResponse response) throws IOException {

        //This one is simple. Needs no extra info/data/params. Just call service method.
        //List<Object> dataList = mObjectServices.getAllData();

        //esponse.getWriter().append(gson.toJson(dataList));

    }

    public void add(HttpServletRequest request, HttpServletResponse response) throws IOException {


    }

    public void update(HttpServletRequest request, HttpServletResponse response) throws IOException {


    }
}

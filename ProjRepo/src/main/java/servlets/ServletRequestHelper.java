package servlets;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

public class ServletRequestHelper {

    public static void getProcess(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String uri = request.getRequestURI();
        System.out.println(uri);

        String[] uriTokens = uri.split("/");
        System.out.println(Arrays.toString(uriTokens));
    }

    public static void putProcess(HttpServletRequest request, HttpServletResponse response) {
        String uri = request.getRequestURI();
        String[] uriTokens = uri.split("/");
    }

    public static void postProcess(HttpServletRequest request, HttpServletResponse response) {
        String uri = request.getRequestURI();
        String[] uriTokens = uri.split("/");

    }

    public static void deleteProcess(HttpServletRequest request, HttpServletResponse response) {
        String uri = request.getRequestURI();
        String[] uriTokens = uri.split("/");
    }
}


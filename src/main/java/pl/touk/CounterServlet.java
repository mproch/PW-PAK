package pl.touk;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/counter", name = "counter")
public class CounterServlet extends HttpServlet {

    private Counter counter = new Counter();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        counter.inc();
        ServletOutputStream response = resp.getOutputStream();
        response.print(String.format("counter = %d", counter.getCounter()));
        response.close();
    }
}

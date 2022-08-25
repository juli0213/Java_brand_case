package org.zhu.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import javax.servlet.http.HttpServlet;

public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException
    {
//        响应的文本类型
        response.setContentType("text/html");
//        获取响应的输出流
        PrintWriter out = response.getWriter();
//      输出
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Hello World!</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Hello World!</h1>");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }


    public static void main(String[] args) {

    }
}
package com.zhuzhu.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;

public class FileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1. 向浏览器输出消息（一直在讲，就不说了）下载文件要获取下载文件的路径
        String realPath = "D:\\my_code\\Javaweb-02-servlet\\response\\src\\main\\resources\\11.png";
        System.out.println("下载文件的路径：" + realPath);
        //2.
        //3.
        //4. 下载的文件名是啥？
        String fileName = realPath.substring(realPath.lastIndexOf("\\") + 1);
        //5. 设置想办法让浏览器能够支持下载我们需要的东西
        resp.setHeader("Content-Disposition","attachment;filename="+ URLEncoder.encode(fileName,"UTF-8"));
        //6. 获取下载文件的输入流
        FileInputStream in = new FileInputStream(realPath);
        //7. 创建缓冲区
        int len = 0;
        byte[] buffer = new byte[1024];
        //8. 获取OutputStream对象
        ServletOutputStream out = resp.getOutputStream();
        //9. 将FileOutputStream流写入到bufer缓冲区
        while ((len=in.read(buffer))>0){
            out.write(buffer,0,len);
        }
        //10. 使用OutputStream将缓冲区中的数据输出到客户端！
        in.close();
        out.close();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}

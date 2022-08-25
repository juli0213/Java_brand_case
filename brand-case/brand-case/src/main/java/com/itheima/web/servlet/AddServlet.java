package com.itheima.web.servlet;

import com.alibaba.fastjson.JSON;
import com.itheima.pojo.Brand;
import com.itheima.service_20211015_114634.BrandService;
import com.itheima.service_20211015_114634.impl.BrandServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;


@WebServlet("/addServlet")
public class AddServlet extends HttpServlet {

    // �ȶ���һ��BrandService�࣬��������������add����������Ҳ�Ǵ��⴩��
    private BrandService brandService = new BrandServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1. ����Ʒ������
        BufferedReader br = request.getReader();
        String params = br.readLine();//json�ַ���

        //תΪbrand����
        Brand brand = JSON.parseObject(params, Brand.class);

        //2. ����service���
        brandService.add(brand);

        //3. ��Ӧ�ɹ��ı�ʾ
        response.getWriter().write("success");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}

package com.itheima.service_20211015_114634.impl;

import com.itheima.mapper.BrandMapper;
import com.itheima.pojo.Brand;
import com.itheima.service_20211015_114634.BrandService;
import com.itheima.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class BrandServiceImpl implements BrandService {


    // 1. 创建SqlSessionFactory 工厂对象
//    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();
    //1. 创建SqlSessionFactory 工厂对象
    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();


    @Override
    public List<Brand> selectAll() {
        //2. 获取SqlSession对象
        SqlSession sqlSession = factory.openSession();
        //3. 获取BrandMapper
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);

        //4. 调用方法
        List<Brand> brands = mapper.selectAll();

        //5. 释放资源
        sqlSession.close();

        System.out.println("-0-----------------------你好-------");

        return brands;

    }

    @Override
    public void add(Brand brand) {
        //2. 获取SqlSession对象
        SqlSession sqlSession = factory.openSession();
        //3. 获取BrandMapper
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        // 4. 调用方法
        mapper.add(brand);
        //5. 添加方法需要提交事务
        sqlSession.commit();
        //6. 释放资源
        sqlSession.close();


    }
}

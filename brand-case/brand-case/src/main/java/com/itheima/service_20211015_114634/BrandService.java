package com.itheima.service_20211015_114634;

import com.itheima.pojo.Brand;

import java.util.List;

public interface BrandService {

    /**
     * 查询所有
     * @return
     */
    List<Brand> selectAll();

    void add(Brand brand);
}

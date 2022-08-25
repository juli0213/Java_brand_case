package com.itheima.mapper;

import com.itheima.pojo.Brand;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BrandMapper {
//    此处为Dao层，用于从数据库获取数据，返回brand对象
    @Select("select * from tb_brand")
    @ResultMap("brandResultMap")
    List<Brand> selectAll();
//    因为Brand类中的变量名和数据库中的名字不匹配，
//    所以需要使用resultmap来将两者对应起来

    // 添加数据
    @Insert("insert into tb_brand values(null,#{brandName},#{companyName},#{ordered},#{description},#{status})")
    void add(Brand brand);
}

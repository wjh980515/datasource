package com.example.datasource.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.datasource.pojo.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductMapper extends BaseMapper<Product> {
}

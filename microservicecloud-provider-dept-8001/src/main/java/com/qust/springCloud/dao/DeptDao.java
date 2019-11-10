package com.qust.springCloud.dao;

import com.qust.springCloud.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptDao {
    public boolean add(Dept dept);
    public Dept findById(Long id);
    public List<Dept> findAll();
}

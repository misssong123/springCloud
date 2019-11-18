package com.qust.springCloud.service.impl;

import com.qust.springCloud.dao.DeptDao;
import com.qust.springCloud.entity.Dept;
import com.qust.springCloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao dao;
    @Override
    public boolean add(Dept dept) {
        return dao.add(dept);
    }

    @Override
    public Dept get(Long id) {
        return dao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return dao.findAll();
    }
}

package com.jsbh.portfolio.service;

import java.util.List;

import com.jsbh.portfolio.domain.TestTable;
import com.jsbh.portfolio.repository.TestRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TestService {
    
    @Autowired
    TestRepository testRepository;
    
    public int countAllData() {
        return (int) testRepository.count();
    }

    public List<TestTable> findDataByName(String name) {
        return null;
    }
}

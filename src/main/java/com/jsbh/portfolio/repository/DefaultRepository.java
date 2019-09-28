package com.jsbh.portfolio.repository;

import com.jsbh.portfolio.domain.TestTable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DefaultRepository extends CrudRepository<TestTable, Long> {

}
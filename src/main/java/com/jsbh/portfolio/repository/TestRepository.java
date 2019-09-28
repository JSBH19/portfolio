package com.jsbh.portfolio.repository;

import java.util.List;

import com.jsbh.portfolio.domain.TestTable;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface TestRepository extends DefaultRepository {

    @Query(value = "SELECT * from jsbh.test where name <= :name", nativeQuery = true)
    List<TestTable> findDataByName(@Param("name") String name);
}
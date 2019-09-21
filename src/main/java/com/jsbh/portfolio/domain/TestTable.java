package com.jsbh.portfolio.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "testTable")
public class TestTable {
    
    @Id
    @Column(name = "id")
    private String id;
    
    @Column(name = "name")
	private String name;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "TestTable [id=" + id + ", name=" + name + "]";
	}
}
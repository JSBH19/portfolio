package com.jsbh.portfolio.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Setter;
import lombok.Getter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class TestTable {

	public TestTable(String name) {
		this.name = name;
	}

    @Id
	@Column(name = "id", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @Column(name = "name", length = 50, nullable = false)
	private String name;

	@Override
	public String toString() {
		return "TestTable [id=" + id + ", name=" + name + "]";
	}
}
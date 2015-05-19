package com.kms.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import com.kms.mapper.TestMapper;
import com.kms.model.TestModel;

public class TestDao {
	private SqlSessionTemplate oracleSession;

	public void setOracleSession(SqlSessionTemplate oracleSession) {
		this.oracleSession = oracleSession;
	}
	
	public List<TestModel> getDbValue(){
		return oracleSession.getMapper(TestMapper.class).getDbValue();
	}
}

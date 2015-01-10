package com.xebia.hrims.dao.leave.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.xebia.hrims.dao.crud.impl.DAOImpl;
import com.xebia.hrims.dao.leave.ITypeDao;
import com.xebia.hrims.model.leave.Type;

@Repository("leavetypeDao")
public class TypeDaoImpl extends DAOImpl<Type> implements ITypeDao{

	  public TypeDaoImpl() {
		super(Type.class);
	  }

	@Override
	public List<Type> getTypeOfLeaves() {
		try{
			List<Type> typeOfLeaves = findAll();
			return typeOfLeaves;
		} catch (Exception e) {
			System.out.println("Error while getting leave "+e.getMessage());
			return new ArrayList<Type>();
		}
	}
}

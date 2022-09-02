package com.lifeinsurance.service;

import java.util.List;

import com.lifeinsurance.model.Nominee;

public interface INomineeService {

	void addNominee(Nominee nominee);
	void updateNominee( );
	void deleteNominee(int age);
	
	List<Nominee> getByNomineeName(String nomineeName);
	List<Nominee> getByRelation(String relation);
	
}

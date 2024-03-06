package com.maboglia.service;

import java.util.List;

import com.maboglia.entities.Serie;
import com.maboglia.repos.SerieDao;

public class SerieServiceImpl implements SerieService {

	private SerieDao dao;
	
	
	@Override
	public List<Serie> addSerie() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Serie addSerie(Serie s) {
		// TODO Auto-generated method stub
		return dao.save(s);
	}

}

package com.maboglia.service;

import java.util.List;

import com.maboglia.entities.Serie;

public interface SerieService {

	List<Serie> addSerie();
	Serie addSerie(Serie s);
}

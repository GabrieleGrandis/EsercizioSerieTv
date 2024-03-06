package com.maboglia.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maboglia.entities.Serie;

@Repository
public interface SerieDao extends JpaRepository<Serie, Integer> {

}

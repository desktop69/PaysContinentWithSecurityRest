package com.saad.pays.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saad.pays.entities.Continent;

public interface ContinentRepository extends JpaRepository<Continent, Long> {

}

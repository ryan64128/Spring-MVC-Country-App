package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Country;

@Repository
public interface CountryRepo extends JpaRepository<Country, Integer>{

}

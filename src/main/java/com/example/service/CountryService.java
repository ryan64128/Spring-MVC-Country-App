package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Country;
import com.example.repo.CountryRepo;

import java.util.*;

import javax.transaction.Transactional;

@Service
public class CountryService {
	@Autowired
	CountryRepo repo;
	
	@Transactional
	public List<Country> getListOfCountries(){
		return repo.findAll();
	}
	
	@Transactional
	public Country getCountryById(int id) {
		return repo.findById(id).get();
	}
	
	@Transactional
	public void deleteById(int id) {
		repo.deleteById(id);
	}
	
	@Transactional
	public void addCountry(String name, String capital, int population) {
		repo.save(new Country(name, capital, population));
	}
	
	@Transactional
	public void saveCountry(Country country) {
		repo.save(country);
	}
}

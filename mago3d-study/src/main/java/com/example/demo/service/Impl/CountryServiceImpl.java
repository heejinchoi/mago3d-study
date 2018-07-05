package com.example.demo.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Country;
import com.example.demo.persistence.CountryMapper;
import com.example.demo.service.CountryService;

@Service
public class CountryServiceImpl implements CountryService {
	@Autowired
	CountryMapper countryMapper;

	@Override
	public List<Country> getCountryList(Country country) {

		return countryMapper.getCountryList(country);
	}
	

}

package com.example.demo.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.Country;

@Mapper
public interface CountryMapper {
	
	List<Country> getCountryList(Country country);

}

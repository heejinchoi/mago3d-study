package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/*@MapperScan(value= {"com.example.demo.persistence"})*/
public class Mago3dStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(Mago3dStudyApplication.class, args);
	}
	
/*	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
		SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		sessionFactory.setDataSource(dataSource);
		
		Resource[] resouce = new PathMatchingResourcePatternResolver().getResources("classpath:mybatis/*Mapper.xml");
		sessionFactory.setMapperLocations(resouce);
		
		return sessionFactory.getObject();
	}*/
}

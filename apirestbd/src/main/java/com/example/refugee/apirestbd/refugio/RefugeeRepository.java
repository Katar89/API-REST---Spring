package com.example.refugee.apirestbd.refugio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RefugeeRepository extends JpaRepository <Refugee, Integer> {

}

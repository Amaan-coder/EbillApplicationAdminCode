package com.example.ebill.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ebill.dto.EbillDto;

@Repository
public interface EbillRepo extends JpaRepository<EbillDto, Long> {

}

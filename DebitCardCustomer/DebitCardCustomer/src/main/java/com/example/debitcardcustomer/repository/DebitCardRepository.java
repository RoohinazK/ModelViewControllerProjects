package com.example.debitcardcustomer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.debitcardcustomer.entity.DebitCard;

@Repository
public interface DebitCardRepository extends JpaRepository<DebitCard, Integer>{

}

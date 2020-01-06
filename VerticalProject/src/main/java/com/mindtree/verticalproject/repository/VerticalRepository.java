package com.mindtree.verticalproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.verticalproject.entity.Vertical;

@Repository
public interface VerticalRepository extends JpaRepository<Vertical, Integer> {

}

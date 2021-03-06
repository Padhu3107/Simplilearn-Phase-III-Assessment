package com.simplilearn.sportyshoes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.sportyshoes.vo.ShoeVO;
import com.simplilearn.sportyshoes.vo.UserVO;

@Repository
public interface ShoeRepository extends JpaRepository<ShoeVO, Integer> {
	
}

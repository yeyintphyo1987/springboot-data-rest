package com.yyp.springbootrest.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yyp.springbootrest.entity.UserNumber;

@Repository
public interface UserNumberRepository extends CrudRepository<UserNumber, Long> {
	 List<UserNumber> findByVoucherId(Long voucherId);
	 Optional<UserNumber> findByIdAndVoucherId(Long id, Long voucherId);
}
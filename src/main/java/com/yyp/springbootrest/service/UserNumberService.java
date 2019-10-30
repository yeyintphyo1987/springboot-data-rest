package com.yyp.springbootrest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.yyp.springbootrest.dao.UserNumberRepository;
import com.yyp.springbootrest.dto.UserNumberDto;
import com.yyp.springbootrest.entity.UserNumber;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class UserNumberService {
	@Autowired
	UserNumberRepository repository;

	public void add(UserNumberDto dto) {
		repository.save(new UserNumber(dto));
	}

	public void delete(long id) {
		repository.deleteById(id);
	}

	public List<UserNumber> getUserNumber() {
		return (List<UserNumber>) repository.findAll();
	}

	public UserNumber getUserNumberById(long id) {
		Optional<UserNumber> optionalUserNumber = repository.findById(id);
		return optionalUserNumber
				.orElseThrow(() -> new UserNumberNotFoundException("Couldn't find a UserNumber with id: " + id));
	}

}
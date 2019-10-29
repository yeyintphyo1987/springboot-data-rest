package com.yyp.springbootrest.service;

import com.yyp.springbootrest.dao.VoucherRepository;
import com.yyp.springbootrest.dto.VoucherDto;
import com.yyp.springbootrest.entity.Voucher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class VoucherService {
	@Autowired
	VoucherRepository repository;

	public void add(VoucherDto dto) {
		Voucher voucher = new Voucher(dto);
		repository.save(voucher);
	}

	public void delete(long id) {
		repository.deleteById(id);
	}

	public List<Voucher> getVoucher() {
		return (List<Voucher>) repository.findAll();
	}

	public Voucher getVoucherById(long id) {
		Optional<Voucher> optionalVoucher = repository.findById(id);
		return optionalVoucher
				.orElseThrow(() -> new VoucherNotFoundException("Couldn't find a Voucher with id: " + id));
	}

}
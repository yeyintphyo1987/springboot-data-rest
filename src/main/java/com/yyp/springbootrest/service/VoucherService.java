package com.yyp.springbootrest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.yyp.springbootrest.dao.UserNumberRepository;
import com.yyp.springbootrest.dao.VoucherRepository;
import com.yyp.springbootrest.dto.UserNumberDto;
import com.yyp.springbootrest.dto.VoucherDto;
import com.yyp.springbootrest.entity.UserNumber;
import com.yyp.springbootrest.entity.Voucher;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class VoucherService {
	@Autowired
	private VoucherRepository voucherRepository;

	@Autowired
	private UserNumberRepository userNumberRepository;

	public void add(VoucherDto dto) {
		Voucher voucher = new Voucher(dto);
		voucherRepository.save(voucher);

		for (UserNumberDto userNumberDto : dto.getUserNumberDtoList()) {
			UserNumber userNumber = new UserNumber(userNumberDto);
			userNumber.setVoucher(voucher);
			userNumberRepository.save(userNumber);
		}
	}

	public void delete(long id) {
		voucherRepository.deleteById(id);
	}

	public List<Voucher> getVoucher() {
		return (List<Voucher>) voucherRepository.findAll();
	}

	public Voucher getVoucherById(long id) {
		Optional<Voucher> optionalVoucher = voucherRepository.findById(id);
		return optionalVoucher
				.orElseThrow(() -> new VoucherNotFoundException("Couldn't find a Voucher with id: " + id));
	}

}
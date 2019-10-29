package com.yyp.springbootrest.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yyp.springbootrest.entity.Voucher;

@Repository
public interface VoucherRepository extends CrudRepository<Voucher, Long> {}
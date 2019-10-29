package com.yyp.springbootrest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yyp.springbootrest.dto.VoucherDto;
import com.yyp.springbootrest.entity.Voucher;
import com.yyp.springbootrest.service.VoucherService;

import java.util.List;

@RestController
@RequestMapping("/voucher")
public class VoucherController {
    @Autowired VoucherService service;

    @GetMapping
    public List<Voucher> getVoucher() {
        return service.getVoucher();
    }

    @PostMapping
    public void postVoucher(@RequestBody VoucherDto dto) {
        service.add(dto);
    }

    @GetMapping("/{id}")
    public Voucher getById(@PathVariable(required = true) long id) {
        return service.getVoucherById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable(required = true) long id) {
        service.delete(id);
    }
}
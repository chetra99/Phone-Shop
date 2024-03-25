package com.chetra.java.springboot.phoneshop.impl;

import com.chetra.java.springboot.phoneshop.entity.Brand;
import com.chetra.java.springboot.phoneshop.repository.BrandRepository;
import com.chetra.java.springboot.phoneshop.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandRepository brandRepository;
    @Override
    public Brand create(Brand brand) {
        return brandRepository.save(brand);
    }
}

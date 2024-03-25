package com.chetra.java.springboot.phoneshop.controller;

import com.chetra.java.springboot.phoneshop.dto.BrandDTO;
import com.chetra.java.springboot.phoneshop.entity.Brand;
import com.chetra.java.springboot.phoneshop.service.BrandService;
import com.chetra.java.springboot.phoneshop.util.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("brands")
public class BrandController {

    @Autowired
     private BrandService brandService;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> create(@RequestBody BrandDTO brandDTO){
        Brand brand = Mapper.toBrand(brandDTO);
        brandService.create(brand);
        return ResponseEntity.ok(Mapper.toBrandDTO(brand));

    }
}

package com.chetra.java.springboot.phoneshop.util;

import com.chetra.java.springboot.phoneshop.dto.BrandDTO;
import com.chetra.java.springboot.phoneshop.entity.Brand;

public class Mapper {
    public static Brand toBrand(BrandDTO dto){
        Brand brand = new Brand();
        brand.setId(dto.getId());
        brand.setName(dto.getName());
        return brand;
    }
    public static BrandDTO toBrandDTO(Brand brand){
        BrandDTO brandDTO = new BrandDTO();
        brandDTO.setName(brand.getName());
        return brandDTO;
    }
}

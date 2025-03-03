package com.dipankar.controller;

import com.dipankar.domain.AccountStatus;
import com.dipankar.exception.SellerException;
import com.dipankar.model.HomeCategory;
import com.dipankar.model.Seller;
import com.dipankar.service.HomeCategoryService;
import com.dipankar.service.SellerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")

public class AdminController {

    private final SellerService sellerService;
    private final HomeCategoryService homeCategoryService;

    public AdminController(SellerService sellerService, HomeCategoryService homeCategoryService) {
        this.sellerService = sellerService;
        this.homeCategoryService = homeCategoryService;
    }


    @PatchMapping("/seller/{id}/status/{status}")
    public ResponseEntity<Seller> updateSellerStatus(
            @PathVariable Long id,
            @PathVariable AccountStatus status) throws SellerException {

        Seller updatedSeller = sellerService.updateSellerAccountStatus(id,status);
        return ResponseEntity.ok(updatedSeller);

    }

    @GetMapping("/home-category")
    public ResponseEntity<List<HomeCategory>> getHomeCategory(
          ) throws Exception {

        List<HomeCategory> categories=homeCategoryService.getAllCategories();
        return ResponseEntity.ok(categories);

    }

    @PatchMapping("/home-category/{id}")
    public ResponseEntity<HomeCategory> updateHomeCategory(
            @PathVariable Long id,
            @RequestBody HomeCategory homeCategory) throws Exception {

        HomeCategory updatedCategory=homeCategoryService.updateCategory(homeCategory,id);
        return ResponseEntity.ok(updatedCategory);

    }
}

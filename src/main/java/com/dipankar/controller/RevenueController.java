package com.dipankar.controller;

import com.dipankar.dto.RevenueChart;
import com.dipankar.exception.SellerException;
import com.dipankar.model.Seller;
import com.dipankar.service.RevenueService;
import com.dipankar.service.SellerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/api/seller/revenue/chart")
public class RevenueController {
    private final RevenueService revenueService;
    private final SellerService sellerService;

    public RevenueController(RevenueService revenueService, SellerService sellerService) {
        this.revenueService = revenueService;
        this.sellerService = sellerService;
    }

    @GetMapping()
    public ResponseEntity<List<RevenueChart>> getRevenueChart(
            @RequestParam(defaultValue = "today") String type,
            @RequestHeader("Authorization") String jwt) throws SellerException {
        Seller seller = sellerService.getSellerProfile(jwt);
        List<RevenueChart> revenue = revenueService
                .getRevenueChartByType(type, seller.getId());
        return ResponseEntity.ok(revenue);
    }

}

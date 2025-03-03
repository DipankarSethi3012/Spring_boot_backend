package com.dipankar.service;

import com.dipankar.model.Seller;
import com.dipankar.model.SellerReport;

public interface SellerReportService {
    SellerReport getSellerReport(Seller seller);
    SellerReport updateSellerReport( SellerReport sellerReport);

}

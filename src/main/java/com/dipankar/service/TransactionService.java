package com.dipankar.service;

import com.dipankar.model.Order;
import com.dipankar.model.Seller;
import com.dipankar.model.Transaction;

import java.util.List;

public interface TransactionService {

    Transaction createTransaction(Order order);
    List<Transaction> getTransactionBySeller(Seller seller);
    List<Transaction>getAllTransactions();
}

package com.bank.passiveTransaction.model;

import lombok.Data;

@Data
public class Account {
    
    private String id;
    private String idClient;
    private String nameProduct;
    private String cardNumber;
    private String typeAccount;
    private String accountNumber;
    private Double balance;
    private Double maintenance;
    private Integer monthlyMovements;

}

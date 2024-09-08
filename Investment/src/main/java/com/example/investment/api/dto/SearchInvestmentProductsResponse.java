package com.example.investment.api.dto;

public class SearchInvestmentProductsResponse {
    private String stockName;         // 종목명
    private String marketClassification;        // 시장 구분
    private long marketCapitalization;  // 시가 총액
    private double fluctuationRate;     // 등락률
}

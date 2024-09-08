package com.example.investment.api.Inquiry_api.jay.service;

import com.example.investment.api.Inquiry_api.jay.infrastructure.dto.ApiResponse;

import java.util.List;

public interface Requester {

    List<ApiResponse> requestStocks();
}

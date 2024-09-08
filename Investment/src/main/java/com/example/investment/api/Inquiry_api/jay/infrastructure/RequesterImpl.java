package com.example.investment.api.Inquiry_api.jay.infrastructure;

import com.example.investment.api.Inquiry_api.jay.infrastructure.dto.ApiResponse;
import com.example.investment.api.Inquiry_api.jay.service.Requester;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RequiredArgsConstructor
@Component
public class RequesterImpl implements Requester {

    private final RestTemplate restTemplate;

    @Override
    public List<ApiResponse> requestStocks() {
        URI url = UriComponentsBuilder.fromHttpUrl("https://blabla")
                .build()
                .toUri();

        HttpHeaders httpHeaders = new HttpHeaders();
//        httpHeaders.set(); // todo

//        RequestDto body = new RequesterDto() // Todo: 요청시 필요한 dto 정의


        var result = restTemplate.exchange(
                url, HttpMethod.POST,
                new HttpEntity<>(body, headers),
                HttpMethod.POST,
                ApiResponse.class
        );
    }
}

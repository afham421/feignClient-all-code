package com.example.project_to_access_vendor_data_by_fiegnclient.feignClient.service;

import com.example.project_to_access_vendor_data_by_fiegnclient.feignClient.dto.VendorEntity;
import com.example.project_to_access_vendor_data_by_fiegnclient.feignClient.external.OtherServiceFeignClient;
import com.example.project_to_access_vendor_data_by_fiegnclient.feignClient.external.RequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class FeignClientService {


//    private final RestTemplate restTemplate;

//    @Autowired
//    public FeignClientService(RestTemplate restTemplate) {
//        this.restTemplate = restTemplate;
//    }

//    public ResponseEntity<List<VendorEntity>> getDataFromOtherService() {
//        String url = "http://localhost:8080/getAllVendor";
//
//
//        ResponseEntity<List<VendorEntity>> response =
//                restTemplate.exchange(url, HttpMethod.GET, null,
//                        new ParameterizedTypeReference<List<VendorEntity>>() {
//                        });
//
//        // Extract the list of entities from the response body
////        List<VendorEntity> entityList = response.getBody();
//        return response;
//
//    }

//
//    //////////////////for feign client//////////////


    private final OtherServiceFeignClient otherServiceFeignClient;

    @Autowired
    public FeignClientService(OtherServiceFeignClient otherServiceFeignClient) {
        this.otherServiceFeignClient = otherServiceFeignClient;
    }

    public ResponseEntity<List<VendorEntity>> getDataFromOtherService(String name) {
        return otherServiceFeignClient.getDataFromOtherService(name);
    }
}

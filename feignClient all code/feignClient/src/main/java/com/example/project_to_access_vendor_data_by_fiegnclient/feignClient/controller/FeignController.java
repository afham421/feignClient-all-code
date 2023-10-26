package com.example.project_to_access_vendor_data_by_fiegnclient.feignClient.controller;

import com.example.project_to_access_vendor_data_by_fiegnclient.feignClient.dto.VendorEntity;
import com.example.project_to_access_vendor_data_by_fiegnclient.feignClient.external.OtherServiceFeignClient;
import com.example.project_to_access_vendor_data_by_fiegnclient.feignClient.external.RequestDto;
import com.example.project_to_access_vendor_data_by_fiegnclient.feignClient.service.FeignClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class FeignController {

    @Autowired
    private  FeignClientService feignClientService;

    @GetMapping("/getData")
    public ResponseEntity<List<VendorEntity>> getDataFromOtherService(@RequestParam String name) {
        return feignClientService.getDataFromOtherService(name);
    }

}

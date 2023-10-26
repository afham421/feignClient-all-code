package com.example.project_to_access_vendor_data_by_fiegnclient.feignClient.external;

import com.example.project_to_access_vendor_data_by_fiegnclient.feignClient.dto.VendorEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "venderService", url = "http://localhost:8080")
public interface OtherServiceFeignClient {

    @GetMapping("/getVendor")
    ResponseEntity<List<VendorEntity>> getDataFromOtherService(@RequestParam String name);
}

package com.example.project_to_access_vendor_data_by_fiegnclient.feignClient.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class VendorEntity {


	private Long id;

	private String name;

	private String msisdn;

	private Integer status;

	private String company;

	private String companyAddress;

	private Integer provinceId;

	private String ntn;

	private String gst;

	private Integer ipCheck;

	private Integer dailyReminder;

	private String contactPersonName;

	private String contactPersonEmail;

	private String contactPersonPhone;

	private String contactPersonFax;

	private String techInfoName;

	private String techInfoEmail;

	private String invoiceEmail;

	private String customerSupportEmail;

	private String customerSupportPhone;

	private String website;

	private String remarks;

	private String createdBy;

	private Date createdOn;

	private Integer thresholdReminder;

	private String thresholdReminderEmailAddress;

	private String thresholdReminderStatus;

	private String parentAccount;

	private Integer portalIpCheck;

	private Integer allowUrl;

	// Getters and setters

	// Constructors

	// Other methods
}

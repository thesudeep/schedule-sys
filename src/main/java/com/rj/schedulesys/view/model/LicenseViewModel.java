package com.rj.schedulesys.view.model;

import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.rj.schedulesys.util.JsonDateSerializer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LicenseViewModel {
	
	private Long id;
	private Long userId;
	@JsonSerialize(using = JsonDateSerializer.class)
	private Date expirationDate;
	private String licenseNumber;
	
}

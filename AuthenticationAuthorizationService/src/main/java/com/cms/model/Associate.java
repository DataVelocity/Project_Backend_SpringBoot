package com.cms.model;

import java.io.Serializable;


import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.validation.constraints.NotEmpty;
@Document
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Associate implements Serializable{
	@Transient
    public static final String SEQUENCE_NAME = "associate_sequences";
	
	@Id
	private String associateId;	
	@NotEmpty(message="Name cannot be empty")
	private String associateName;	
	private String associateAddress;	
	private String associateEmailId;


}
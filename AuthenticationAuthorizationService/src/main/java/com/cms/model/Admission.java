package com.cms.model;
import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Admission implements Serializable{
	@Transient
    public static final String SEQUENCE_NAME = "admission_sequences";
	@Id
	private long registrationId;	
	private String courseId	;
	private String associateId	;
	private int fees;	
	private String feedback	;
	

}







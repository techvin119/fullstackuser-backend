package com.fse.user.exception;

import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Component
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class InvalidAssociateId extends RuntimeException {

	private static final long serialVersionUID = 1L;
	public String associateId;
	public String message;
	

}

package com.app.aop.aspect;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author Ashwani Kumar
 * Created on 29/12/23.
 */
@Slf4j
@Aspect
@Component
public class ApiValidationAspect {
	@Before("execution(* com.app.aop.controller.CartController.*(..)) && args(.., affiliate)")
	public void validateAndModifyAffiliate(JoinPoint joinPoint, String affiliate) {
		log.info("In Advice - affiliate: {}", affiliate);
		String validatedAffiliate = validateAndModifyAffiliateHeader(affiliate);
		Object[] args = joinPoint.getArgs();
		for (int i = 0; i < args.length; i++) {
			if (args[i] instanceof String && args[i].equals(affiliate)) {
				args[i] = validatedAffiliate;
			}
		}
	}
	private String validateAndModifyAffiliateHeader(String affiliate) {
		if (!affiliate.matches("[A-Za-z0-9]+")) {
			throw new IllegalArgumentException("Invalid affiliate header format");
		}
		return affiliate.toUpperCase();
	}
}

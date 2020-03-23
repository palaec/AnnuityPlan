/**
 * 
 */
package com.lendico.annuityplan;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.lendico.util.GetFormulas;

/**
 * @author Arghya
 *
 */
@SpringBootTest
public class GetForlumasTest {
	
	@Test
	void annuityPaymentTest(){
		BigDecimal loanAmount = new BigDecimal("218.45");
		BigDecimal interestRate = new BigDecimal("5.00");
		int duration = 1;
		BigDecimal amt =  GetFormulas.calculateAnnunity(loanAmount, interestRate, duration);
		assertEquals("219.36", amt.toString());
	}

	@Test
	void interestTest(){
		BigDecimal loanAmount = new BigDecimal("218.45");
		BigDecimal interestRate = new BigDecimal("5.00");
		int days = 30;
		BigDecimal amt =  GetFormulas.calculateInterest(loanAmount, interestRate, days);
		assertEquals("0.91", amt.toString());
	}
	
	@Test
	void PrincipleTest(){
		BigDecimal annuity = new BigDecimal("219.36");
		BigDecimal interest = new BigDecimal("20.83");
		BigDecimal amt =  GetFormulas.calculatePrinciple(annuity,interest);
		assertEquals("198.53", amt.toString());
	}
	
}

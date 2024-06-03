package com.kulkeez.loans.dto;

import com.kulkeez.loans.entity.Loan;
import com.kulkeez.loans.entity.LoanStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LoanDto {
    private String loanId;
    private String customerName;
    private int customerId;
    private BigDecimal amount;
    private LoanStatus loanStatus;

    public static LoanDto from(Loan loan) {
        return new LoanDto(loan.getLoanId(), loan.getCustomerName(), loan.getCustomerId(),
                loan.getAmount(), loan.getLoanStatus());
    }
}

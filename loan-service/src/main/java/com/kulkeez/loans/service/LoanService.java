package com.kulkeez.loans.service;

import com.kulkeez.loans.client.FraudDetectionClient;
import com.kulkeez.loans.dto.LoanDto;
import com.kulkeez.loans.entity.Loan;
import com.kulkeez.loans.entity.LoanStatus;
import com.kulkeez.loans.repository.LoanRepository;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LoanService {

    private final FraudDetectionClient fraudDetectionClient;
    private final LoanRepository loanRepository;

    public List<LoanDto> listAllLoans() {
        return loanRepository.findAll()
                .stream()
                .map(LoanDto::from)
                .toList();
    }

    public String applyLoan(LoanDto loanDto) {
        var loan = Loan.from(loanDto);
        LoanStatus loanStatus = fraudDetectionClient.evaluateLoan(loan.getCustomerId());
        loan.setLoanStatus(loanStatus);
        if (loanStatus.equals(LoanStatus.APPROVED)) {
            loanRepository.save(loan);
            return "Loan applied successfully";
        }
        return "Sorry! Your loan was not approved";
    }
}

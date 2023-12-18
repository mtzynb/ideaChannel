package com.rahand.idea.channel.wrapper.saman;

import com.rahand.idea.channel.dto.deposit.*;
import com.rahand.idea.channel.service.deposit.DepositService;
import com.rahand.idea.channel.service.transfer.TransferService;
import com.rahand.idea.channel.wrapper.saman.deposit.balance.service.SamanDepositBalanceService;
import com.rahand.idea.channel.wrapper.saman.deposit.statement.service.SamanDepositStatementService;
import com.rahand.idea.channel.wrapper.saman.transfer.service.SamanTransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SamanService implements DepositService, TransferService {

    @Autowired
    private SamanDepositBalanceService balanceService;

    @Autowired
    private SamanDepositStatementService statementService;

    @Autowired
    private SamanTransferService transferService;

    @Override
    public DepositInfoResponse getDepositInfo(DepositInfoRequest request) {
        return null;
    }

    @Override
    public DepositBalanceResponse getDepositBalance(DepositBalanceRequest request) {
        return balanceService.depositBalance(request);
    }

    @Override
    public DepositStatementsResponse getDepositStatements(DepositStatementsRequest request) {
        return statementService.depositStatement(request);
    }

    @Override
    public String ACHTransfer(String request) {
        return transferService.ACHTransfer(request);
    }
}

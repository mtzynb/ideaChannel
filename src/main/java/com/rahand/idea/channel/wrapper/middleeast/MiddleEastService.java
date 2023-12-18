package com.rahand.idea.channel.wrapper.middleeast;

import com.rahand.idea.channel.dto.deposit.*;
import com.rahand.idea.channel.service.deposit.DepositService;
import com.rahand.idea.channel.wrapper.middleeast.service.deposit.MiddleEastDepositService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MiddleEastService implements DepositService {

    @Autowired
    private MiddleEastDepositService middleEastDepositService;

    @Override
    public DepositInfoResponse getDepositInfo(DepositInfoRequest request) {
        return null;
    }

    @Override
    public DepositBalanceResponse getDepositBalance(DepositBalanceRequest request) {
        return middleEastDepositService.getDepositBalance(request);
    }

    @Override
    public DepositStatementsResponse getDepositStatements(DepositStatementsRequest request) {
        return middleEastDepositService.getDepositStatements(request);
    }

}

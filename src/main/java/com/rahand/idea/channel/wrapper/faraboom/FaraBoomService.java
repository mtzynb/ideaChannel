package com.rahand.idea.channel.wrapper.faraboom;

import com.rahand.idea.channel.dto.deposit.*;
import com.rahand.idea.channel.service.deposit.DepositService;
import com.rahand.idea.channel.wrapper.faraboom.service.deposit.FaraBoomDepositService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FaraBoomService implements DepositService {

    @Autowired
    private FaraBoomDepositService depositService;

    @Override
    public DepositInfoResponse getDepositInfo(DepositInfoRequest request) {
        return null;
    }

    @Override
    public DepositBalanceResponse getDepositBalance(DepositBalanceRequest request) {
        return depositService.getDepositBalance(request);
    }

    @Override
    public DepositStatementsResponse getDepositStatements(DepositStatementsRequest request) {
        return depositService.getDepositStatements(request);
    }
}

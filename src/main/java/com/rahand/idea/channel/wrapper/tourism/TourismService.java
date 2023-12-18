package com.rahand.idea.channel.wrapper.tourism;

import com.rahand.idea.channel.dto.deposit.*;
import com.rahand.idea.channel.service.deposit.DepositService;
import com.rahand.idea.channel.wrapper.tourism.service.deposit.TourismDepositService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TourismService implements DepositService {

    @Autowired
    private TourismDepositService tourismDepositService;

    @Override
    public DepositInfoResponse getDepositInfo(DepositInfoRequest request) {
        return null;
    }

    @Override
    public DepositBalanceResponse getDepositBalance(DepositBalanceRequest request) {
        return tourismDepositService.getDepositBalance(request);
    }

    @Override
    public DepositStatementsResponse getDepositStatements(DepositStatementsRequest request) {
        return tourismDepositService.getDepositStatements(request);
    }
}

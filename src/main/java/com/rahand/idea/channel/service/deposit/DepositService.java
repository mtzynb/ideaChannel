package com.rahand.idea.channel.service.deposit;

import com.rahand.idea.channel.dto.deposit.*;

public interface DepositService {

    DepositInfoResponse getDepositInfo(DepositInfoRequest request);

    DepositBalanceResponse getDepositBalance(DepositBalanceRequest request);

    DepositStatementsResponse getDepositStatements(DepositStatementsRequest request);
}

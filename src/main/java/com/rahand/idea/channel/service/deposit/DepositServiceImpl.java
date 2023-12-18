package com.rahand.idea.channel.service.deposit;

import com.rahand.idea.channel.dto.deposit.*;
import com.rahand.idea.channel.factory.BankServiceFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;

@Service
public class DepositServiceImpl implements DepositService {

    @Autowired
    private BankServiceFactory bankServiceFactory;

    @Override
    public DepositInfoResponse getDepositInfo(DepositInfoRequest request) {
//        BankInterface bankInterface = banInterfaceFactory.get(request.getBankName());
//        bankInterface.getDepositInfo(request);
//        throw new GeneralException("message.exception.test");
//        List<DepositInfoResponse> tmp = new ArrayList<>();
        DepositInfoResponse mock = new DepositInfoResponse();
        mock.setBalance(1000l);
        mock.setAvailable_balance(1000l);
        mock.setBlocked_amount(1);
        mock.setMaximum_balance(2000);
        mock.setDeposit_number(request.getDeposit_number());
        mock.setDeposit_title("0201255801006");
        mock.setOperation_time(1632491602064l);
        mock.setCurrency("IRR");
        mock.setDeposit_status("OPEN");
        mock.setOwner("PERSONAL_DEPOSIT");
        mock.setGroup("SHORT_ACCOUNT");
        mock.setSupport_deposit_status("UNKNOWN");
        mock.setWithdrawal_option("PERSONAL_WITHDRAWAL");
        mock.setIban("IR070660000000201255801006");
        mock.setSignature("OWNER_OF_DEPOSIT_AND_SIGNATURE");
        mock.setBranch_code("0131");
        mock.setExtra_available_balance(39956691379l);
        mock.setMinimum_balance(0);
        mock.setPersonality("ACTUAL");
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
            mock.setInauguration_date(simpleDateFormat.parse("2014-10-17T03:19:42+0330"));
            mock.setExpire_date(simpleDateFormat.parse("2071-03-21T14:25:06+0430"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
//        tmp.add(mock);
        return mock;
    }

    @Override
    public DepositBalanceResponse getDepositBalance(DepositBalanceRequest request) {

        DepositService depositService = bankServiceFactory.getBankService(request.getBankName(), DepositService.class);
        return depositService.getDepositBalance(request);
    }

    @Override
    public DepositStatementsResponse getDepositStatements(DepositStatementsRequest request) {

        DepositService depositService = bankServiceFactory.getBankService(request.getBankName(), DepositService.class);
        return depositService.getDepositStatements(request);
    }
}

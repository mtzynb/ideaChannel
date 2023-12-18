package com.rahand.idea.channel.service.transfer;

import com.rahand.idea.channel.enums.BankName;
import com.rahand.idea.channel.factory.BankServiceFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author aglitchyy
 * @created 09/11/2021
 */

@Component
public class TransferServiceImpl implements TransferService {
    @Autowired
    private BankServiceFactory bankServiceFactory;

    @Override
    public String ACHTransfer(String request) {
        TransferService transferService = bankServiceFactory.getBankService(BankName.SAMAN, TransferService.class);
        return transferService.ACHTransfer(request);
    }
}

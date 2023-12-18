package com.rahand.idea.channel.wrapper.saman.transfer.service;

import com.rahand.idea.channel.service.transfer.TransferService;
import org.springframework.stereotype.Component;

/**
 * @author aglitchyy
 * @created 09/11/2021
 */

@Component
public class SamanTransferService implements TransferService {
    @Override
    public String ACHTransfer(String request) {
        return "SAMAN ACH Transfer Successful";
    }
}

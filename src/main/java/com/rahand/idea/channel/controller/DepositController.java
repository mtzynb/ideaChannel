package com.rahand.idea.channel.controller;

import com.rahand.idea.channel.dto.deposit.*;
import com.rahand.idea.channel.service.deposit.DepositService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/deposit")
public class DepositController {

    @Autowired
    @Qualifier("depositServiceImpl")
    private DepositService depositService;

    @PostMapping(value = "/info", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DepositInfoResponse> getDepositInfo(@Valid @RequestBody DepositInfoRequest depositInfoRequest) {
        return new ResponseEntity<>(depositService.getDepositInfo(depositInfoRequest), HttpStatus.OK);
    }

    @PostMapping(value = "/balance", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DepositBalanceResponse> getDepositBalance(@Valid @RequestBody DepositBalanceRequest balanceRequest) {
        return new ResponseEntity<>(depositService.getDepositBalance(balanceRequest), HttpStatus.OK);
    }

    @PostMapping(value = "/statements", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DepositStatementsResponse> getDepositStatements(@Valid @RequestBody DepositStatementsRequest statementsRequest) {
        return new ResponseEntity<>(depositService.getDepositStatements(statementsRequest),
                HttpStatus.OK);
    }

}

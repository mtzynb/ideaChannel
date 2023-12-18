package com.rahand.idea.channel.controller;

import com.rahand.idea.channel.service.transfer.TransferService;
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

/**
 * @author aglitchyy
 * @created 09/11/2021
 */

@RestController
@RequestMapping("/transfer")
public class TransferController {

    @Autowired
    @Qualifier("transferServiceImpl")
    private TransferService transferService;

    @PostMapping(value = "/ach", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> ACHTransfer(@Valid @RequestBody String request) {
        return new ResponseEntity<>(transferService.ACHTransfer(request), HttpStatus.OK);
    }
}

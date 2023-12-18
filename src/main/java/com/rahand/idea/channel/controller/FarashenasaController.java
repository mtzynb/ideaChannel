package com.rahand.idea.channel.controller;

import com.rahand.idea.channel.dto.farashenasa.image.SelfieRequest;
import com.rahand.idea.channel.dto.farashenasa.image.SignatureRequest;
import com.rahand.idea.channel.dto.farashenasa.token.TokenRequest;
import com.rahand.idea.channel.dto.farashenasa.video.VideoRequest;
import com.rahand.idea.channel.service.farashenasa.FarashenasaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author aglitchyy
 * @created 21/02/2022
 */

@RestController
@RequestMapping("farashenasa")
public class FarashenasaController {

    @Autowired
    private FarashenasaService farashenasaService;

    @PostMapping(value = "/token",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getToken(@Valid @RequestBody TokenRequest request) {
        return new ResponseEntity<>(farashenasaService.getToken(request), HttpStatus.OK);
    }

    @PostMapping(value = "/selfie",
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> processImage(@RequestHeader("token") String token,
                                               @Valid @ModelAttribute SelfieRequest request) {
        return new ResponseEntity<>(farashenasaService.processSelfie(request, token), HttpStatus.OK);
    }

    @PostMapping(value = "/signature",
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> processImage(@RequestHeader("token") String token,
                                               @Valid @ModelAttribute SignatureRequest request) {
        return new ResponseEntity<>(farashenasaService.processSignature(request, token), HttpStatus.OK);
    }

    @GetMapping(value = "/testVideo",
//            consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> testVideo(@RequestHeader("token") String token,
                                            @Valid @RequestParam("uniqueKey") String uniqueKey) {
        return new ResponseEntity<>(farashenasaService.testVideo(uniqueKey, token), HttpStatus.OK);
    }

    @PostMapping(value = "/video",
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> processVideo(@RequestHeader("token") String token,
                                               @Valid @ModelAttribute VideoRequest request) {
        return new ResponseEntity<>(farashenasaService.processVideo(request, token), HttpStatus.OK);
    }

}

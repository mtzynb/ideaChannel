package com.rahand.idea.channel.wrapper.farashenasa.image;

import com.rahand.idea.channel.config.FarashenasaConfig;
import com.rahand.idea.channel.constant.FarashenasaEndpoints;
import com.rahand.idea.channel.dto.farashenasa.image.SelfieRequest;
import com.rahand.idea.channel.dto.farashenasa.image.SignatureRequest;
import com.rahand.idea.channel.dto.farashenasa.token.TokenRequest;
import com.rahand.idea.channel.util.LogUtils;
import com.rahand.idea.channel.util.restclient.WebClientInstance;
import org.slf4j.Logger;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.client.MultipartBodyBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;

import java.nio.charset.StandardCharsets;

/**
 * @author aglitchyy
 * @created 21/02/2022
 */
@Component
public class FarashenasaImageService {

    private FarashenasaConfig farashenasaConfig;
    private WebClientInstance webClient;
    private Logger logger = LogUtils.getLogger();

    public FarashenasaImageService(FarashenasaConfig farashenasaConfig, WebClientInstance webClient) {
        this.farashenasaConfig = farashenasaConfig;
        this.webClient = webClient;
    }

    public String processSelfie(SelfieRequest request, String token) {

        logger.info("FARASHENASA => processSelfie() Service call started, SelfieRequest: {}", request.toString());

        String baseUrl = farashenasaConfig.getBaseUrl();

        MultipartBodyBuilder builder = new MultipartBodyBuilder();
        builder.part("selfie", request.getSelfie().getResource());
        builder.part("uniqueKey", request.getUniqueKey());
        builder.part("type", request.getType());

        String response = webClient.getWebClientInstance(baseUrl, MediaType.MULTIPART_FORM_DATA_VALUE, "Farashenasa")
                .post()
                .uri(FarashenasaEndpoints.IMAGE)
                .acceptCharset(StandardCharsets.UTF_8)
                .header("token", token)
                .body(BodyInserters.fromMultipartData(builder.build()))
                .retrieve()
                .bodyToMono(String.class)
                .elapsed()  // map the stream's time into our streams data
                .doOnNext(tuple -> logger.info("FARASHENASA => processSelfie() ****** Response time took {} Milliseconds ******", tuple.getT1()))
                .map(Tuple2::getT2) // after outputting the measurement, return the data only
                .block();

        logger.info("FARASHENASA => processSelfie() response: " + response);

        return response;


    }

    public String processSignature(SignatureRequest request, String token) {

        logger.info("FARASHENASA => processSignature() Service call started, SelfieRequest: {}", request.toString());

        String baseUrl = farashenasaConfig.getBaseUrl();

        MultipartBodyBuilder builder = new MultipartBodyBuilder();
        builder.part("signature", request.getSignature().getResource());
        builder.part("uniqueKey", request.getUniqueKey());
        builder.part("type", request.getType());
        builder.part("signType", request.getSignType());

        String response = webClient.getWebClientInstance(baseUrl, MediaType.MULTIPART_FORM_DATA_VALUE, "Farashenasa")
                .post()
                .uri(FarashenasaEndpoints.IMAGE)
                .acceptCharset(StandardCharsets.UTF_8)
                .header("token", token)
                .body(BodyInserters.fromMultipartData(builder.build()))
                .retrieve()
                .bodyToMono(String.class)
                .elapsed()  // map the stream's time into our streams data
                .doOnNext(tuple -> logger.info("FARASHENASA => processSignature() ****** Response time took {} Milliseconds ******", tuple.getT1()))
                .map(Tuple2::getT2) // after outputting the measurement, return the data only
                .block();

        logger.info("FARASHENASA => processSignature() response: " + response);
        return response;


    }

}

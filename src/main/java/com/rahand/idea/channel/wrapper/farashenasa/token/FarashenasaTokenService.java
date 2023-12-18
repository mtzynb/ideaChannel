package com.rahand.idea.channel.wrapper.farashenasa.token;

import com.rahand.idea.channel.config.FarashenasaConfig;
import com.rahand.idea.channel.constant.FarashenasaEndpoints;
import com.rahand.idea.channel.dto.farashenasa.token.TokenRequest;
import com.rahand.idea.channel.util.LogUtils;
import com.rahand.idea.channel.util.restclient.WebClientInstance;
import org.slf4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;

import java.nio.charset.StandardCharsets;

/**
 * @author aglitchyy
 * @created 21/02/2022
 */

@Component
public class FarashenasaTokenService {

    private FarashenasaConfig farashenasaConfig;
    private WebClientInstance webClient;
    private Logger logger = LogUtils.getLogger();

    public FarashenasaTokenService(FarashenasaConfig farashenasaConfig, WebClientInstance webClient) {
        this.farashenasaConfig = farashenasaConfig;
        this.webClient = webClient;
    }

    public String getToken(TokenRequest request) {

        String baseUrl = farashenasaConfig.getBaseUrl();
//        String baseUrl = "https://demo-rahand.farashenasa.ir/";

        String response = webClient.getWebClientInstance(baseUrl, MediaType.APPLICATION_JSON_VALUE, "Farashenasa")
                .post()
                .uri(FarashenasaEndpoints.TOKEN)
                .acceptCharset(StandardCharsets.UTF_8)
                .body(Mono.just(request), TokenRequest.class)
                .retrieve()
                .bodyToMono(String.class)
                .elapsed()  // map the stream's time into our streams data
                .doOnNext(tuple -> logger.info("FARASHENASA => getToken() ****** Response time took {} Milliseconds ******", tuple.getT1()))
                .map(Tuple2::getT2) // after outputting the measurement, return the data only
                .block();

        System.out.println("getToken response => " + response);
        return response;
    }


//    public static void main(String[] args) {
//        FarashenasaTokenService service = new FarashenasaTokenService();
//        TokenRequest tokenRequest = new TokenRequest();
//        tokenRequest.setUniqueKey("12444b2b-8bf0-11ec-bb2d-fa163e30679e");
//        String res  = service.getToken(tokenRequest);
//        System.out.println(res);
//
//    }
}

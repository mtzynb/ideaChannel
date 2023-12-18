package com.rahand.idea.channel.wrapper.farashenasa.video;

import com.rahand.idea.channel.config.FarashenasaConfig;
import com.rahand.idea.channel.constant.FarashenasaEndpoints;
import com.rahand.idea.channel.dto.farashenasa.image.SignatureRequest;
import com.rahand.idea.channel.dto.farashenasa.video.VideoRequest;
import com.rahand.idea.channel.util.LogUtils;
import com.rahand.idea.channel.util.restclient.WebClientInstance;
import org.slf4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.http.client.MultipartBodyBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import reactor.util.function.Tuple2;

import java.nio.charset.StandardCharsets;

/**
 * @author aglitchyy
 * @created 21/02/2022
 */
@Component
public class FarashenasaVideoService {

    private FarashenasaConfig farashenasaConfig;
    private WebClientInstance webClient;
    private Logger logger = LogUtils.getLogger();

    public FarashenasaVideoService(FarashenasaConfig farashenasaConfig, WebClientInstance webClient) {
        this.farashenasaConfig = farashenasaConfig;
        this.webClient = webClient;
    }

    public String testVideo(String uniqueKey, String token) {

        logger.info("FARASHENASA => testVideo() Service call started, uniqueKey: {}", uniqueKey);

        String baseUrl = farashenasaConfig.getBaseUrl();

        String response = webClient.getWebClientInstance(baseUrl, MediaType.APPLICATION_JSON_VALUE, "Farashenasa")
                .get()
                .uri(uriBuilder -> uriBuilder.path(FarashenasaEndpoints.TEST_VIDEO)
                        .queryParam("uniqueKey", uniqueKey)
                        .build())
                .acceptCharset(StandardCharsets.UTF_8)
                .header("token", token)
                .retrieve()
                .bodyToMono(String.class)
                .elapsed()  // map the stream's time into our streams data
                .doOnNext(tuple -> logger.info("FARASHENASA => testVideo() ****** Response time took {} Milliseconds ******", tuple.getT1()))
                .map(Tuple2::getT2) // after outputting the measurement, return the data only
                .block();

        logger.info("FARASHENASA => testVideo() response: " + response);

        return response;
    }

    public String processVideo(VideoRequest request, String token) {

        logger.info("FARASHENASA => processVideo() Service call started, VideoRequest: {}", request.toString());

        String baseUrl = farashenasaConfig.getBaseUrl();

        MultipartBodyBuilder builder = new MultipartBodyBuilder();
        builder.part("testVideo", request.getTestVideo().getResource());
        builder.part("uniqueKey", request.getUniqueKey());
        builder.part("type", request.getType());
        builder.part("mode", request.getMode());

        String response = webClient.getWebClientInstance(baseUrl, MediaType.MULTIPART_FORM_DATA_VALUE, "Farashenasa")
                .post()
                .uri(FarashenasaEndpoints.VIDEO)
                .acceptCharset(StandardCharsets.UTF_8)
                .header("token", token)
                .body(BodyInserters.fromMultipartData(builder.build()))
                .retrieve()
                .bodyToMono(String.class)
                .elapsed()  // map the stream's time into our streams data
                .doOnNext(tuple -> logger.info("FARASHENASA => processVideo() ****** Response time took {} Milliseconds ******", tuple.getT1()))
                .map(Tuple2::getT2) // after outputting the measurement, return the data only
                .block();

        logger.info("FARASHENASA => processVideo() response: " + response);
        return response;
    }

}

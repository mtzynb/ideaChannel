package com.rahand.idea.channel.wrapper.farashenasa;

import com.rahand.idea.channel.dto.farashenasa.image.SelfieRequest;
import com.rahand.idea.channel.dto.farashenasa.image.SignatureRequest;
import com.rahand.idea.channel.dto.farashenasa.token.TokenRequest;
import com.rahand.idea.channel.dto.farashenasa.video.VideoRequest;
import com.rahand.idea.channel.service.farashenasa.FarashenasaService;
import com.rahand.idea.channel.wrapper.farashenasa.image.FarashenasaImageService;
import com.rahand.idea.channel.wrapper.farashenasa.token.FarashenasaTokenService;
import com.rahand.idea.channel.wrapper.farashenasa.video.FarashenasaVideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author aglitchyy
 * @created 21/02/2022
 */
@Component
public class FarashenasaServiceImpl implements FarashenasaService {

    @Autowired
    private FarashenasaTokenService tokenService;

    @Autowired
    private FarashenasaImageService imageService;

    @Autowired
    private FarashenasaVideoService videoService;

    @Override
    public String getToken(TokenRequest request) {
        return tokenService.getToken(request);
    }

    @Override
    public String processSelfie(SelfieRequest request, String token) {
        return imageService.processSelfie(request, token);
    }

    @Override
    public String processSignature(SignatureRequest request, String token) {
        return imageService.processSignature(request, token);
    }

    @Override
    public String testVideo(String uniqueKey, String token) {
        return videoService.testVideo(uniqueKey, token);
    }

    @Override
    public String processVideo(VideoRequest request, String token) {
        return videoService.processVideo(request, token);
    }
}

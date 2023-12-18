package com.rahand.idea.channel.service.farashenasa;

import com.rahand.idea.channel.dto.farashenasa.image.SelfieRequest;
import com.rahand.idea.channel.dto.farashenasa.image.SignatureRequest;
import com.rahand.idea.channel.dto.farashenasa.token.TokenRequest;
import com.rahand.idea.channel.dto.farashenasa.video.VideoRequest;

/**
 * @author aglitchyy
 * @created 21/02/2022
 */

public interface FarashenasaService {

    String getToken(TokenRequest request);

    String processSelfie(SelfieRequest request, String token);

    String processSignature(SignatureRequest request, String token);

    String testVideo(String uniqueKey, String token);

    String processVideo(VideoRequest request, String token);

}

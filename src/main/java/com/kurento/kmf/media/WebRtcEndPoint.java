package com.kurento.kmf.media;

import com.kurento.kms.api.MediaObject;
import com.kurento.kms.api.SdpEndPointType;

public class WebRtcEndPoint extends SdpEndPoint {

	private static final long serialVersionUID = 1L;

	static final SdpEndPointType sdpEndPointType = SdpEndPointType.WEBRTC_END_POINT;

	public WebRtcEndPoint(MediaObject webRtcEndPoint) {
		super(webRtcEndPoint);
	}

}
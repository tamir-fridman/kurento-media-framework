package com.kurento.kmf.content;

/**
 * 
 * Defines the events associated to the HTTP play operation (
 * {@link #onContentRequest(HttpPlayerSession)},
 * {@link #onContentCompleted(HttpPlaySession)}, and
 * {@link #onContentError(PlayRequest, ContentException)}); the implementation
 * of the PlayerHandler should be used in conjunction with
 * {@link HttpPlayerService} annotation. The following snippet shows an skeleton
 * with the implementation of a Player:
 * 
 * <pre>
 * &#064;PlayerService(name = &quot;MyPlayerHandlerName&quot;, path = &quot;/my-player&quot;, redirect = &quot;true&quot;, useControlProtocol = &quot;false&quot;)
 * public class MyPlayerHandler implements PlayerHandler {
 * 
 * 	&#064;Override
 * 	public void onPlayRequest(PlayRequest playRequest) throws ContentException {
 * 		// My implementation
 * 	}
 * 
 * 	&#064;Override
 * 	public void onContentPlayed(PlayRequest playRequest) {
 * 		// My implementation
 * 	}
 * 
 * 	&#064;Override
 * 	public void onContentError(PlayRequest playRequest,
 * 			ContentException exception) {
 * 		// My implementation
 * 	}
 * 
 * }
 * </pre>
 * 
 * @see HttpPlayerService
 * @author Luis López (llopez@gsyc.es)
 * @author Miguel París (mparisdiaz@gsyc.es)
 * @author Boni García (bgarcia@gsyc.es)
 * @version 1.0.0
 */
public abstract class HttpPlayerHandler extends
		ContentHandler<HttpPlayerSession> {
}
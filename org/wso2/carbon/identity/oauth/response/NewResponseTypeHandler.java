public class NewResponseTypeHandler extends AbstractResponseTypeHandler {

    public NewResponseTypeHandler() {

    }

    public OAuth2AuthorizeRespDTO issue(OAuthAuthzReqMessageContext oauthAuthzMsgCtx) throws IdentityOAuth2Exception {

        OAuth2AuthorizeRespDTO respDTO = new OAuth2AuthorizeRespDTO();
        OAuth2AuthorizeReqDTO authzReqDTO = oauthAuthzMsgCtx.getAuthorizationReqDTO();
        OAuth2AuthorizeReqDTO authorizationReqDTO = oauthAuthzMsgCtx.getAuthorizationReqDTO();
        
        //write your logic in here
        
        return respDTO;
    }

}


public class NewResponseTypeValidator extends AbstractValidator<HttpServletRequest> {

    public NewResponseTypeValidator() {

        this.requiredParams.add(Constants.RESPONSE_TYPE);
        this.requiredParams.add(Constants.CLIENT_ID);

    }

    @Override
    public void validateMethod(HttpServletRequest request) throws OAuthProblemException {

        String method = request.getMethod();
        if (!OAuth.HttpMethod.GET.equals(method) && !OAuth.HttpMethod.POST.equals(method)) {
            throw OAuthProblemException.error(OAuthError.CodeResponse.INVALID_REQUEST)
                    .description("Method not correct.");
        }
    }

    @Override
    public void validateContentType(HttpServletRequest request) throws OAuthProblemException {

    }
}

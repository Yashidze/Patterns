class LinkedinConnector(_password: String, _login: String) : SocialConnector(_password) {
    private val login: String
    init {
        login = _login
    }
}
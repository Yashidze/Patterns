class SlackAdapter(_slack: Slack): INotificator {
    private var slack: Slack
    init {
        slack = _slack
    }
    fun Authorize(login: String, apiKey: String) {
        TODO("Not yet implemented")
    }
    override fun Send(message: String) {
        TODO("Not yet implemented")
    }
}
class FacebookPublisher : IPublisher {
    override fun publicCreate(): FacebookConnector {
        return  FacebookConnector("password", "login");
    }
}
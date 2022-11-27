class LinkedinPublisher: IPublisher {
    override fun publicCreate(): LinkedinConnector {
        return  LinkedinConnector("password", "email");
    }
}
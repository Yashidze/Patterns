class EmailNotification(_adminEmail:String): INotificator {
    private val adminEmail: String
    init {
        adminEmail = _adminEmail
    }
    override fun Send(message: String)
    {
        TODO("Not yet implemented")
    }
}
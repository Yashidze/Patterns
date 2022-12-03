class SmsAdapter(_sms: Sms): INotificator {
    private val sms: Sms
    init {
        sms = _sms
    }
    private lateinit var phoneNumber: String
    override fun Send(message: String) {
        TODO("Not yet implemented")
    }
    fun SetPhoneNumber(number: String) {
        phoneNumber = number
    }
}
class Task(_name: String, _user: User, val _logger: ILogger) {

    private val Name: String
    private lateinit var Status: String
    private val User: User
    init {
        Name = _name
        User = _user
    }
    fun StatusChange(_status: String, _user: User){
        Status = _status
        _logger.log("")
    }
}
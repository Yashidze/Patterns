class Project(_projectName: String, _admin: User, val _logger: ILogger, val _sender: ISender) {

    private val ProjectName: String
    private val Admin: User
    val users = mutableListOf<User>()
    val tasks = mutableListOf<Task>()
    init {
        ProjectName = _projectName
        Admin = _admin
    }
    fun CreateUser(user: User){
        users.add(user)
        _logger.log("")
        _sender.send("", Admin)
    }
    fun CreatrTask(name: String, user: User){
        var task: Task = Task(name, user, _logger)
        tasks.add(task)
        _logger.log("")
    }
}
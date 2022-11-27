class LocalDisk private constructor() : IStorage {

    companion object {
        var instance = LocalDisk()

        fun getInstance(): IStorage {
            if (instance == null)
                instance = LocalDisk()
            return instance
        }
    }
}
class AmazonS3 private constructor() : IStorage {

    companion object {
        var instance = AmazonS3()

        fun getInstance(): IStorage {
            if (instance == null)
                instance = AmazonS3()
            return instance
        }
    }
}
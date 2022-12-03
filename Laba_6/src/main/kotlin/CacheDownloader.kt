class CacheDownloader(_downloader: IDowloader): IDowloader {
    private val downloader: IDowloader
    private lateinit var cache: String
    init {
        downloader = _downloader
    }
    fun setCache(cache: String) {
        this.cache = cache
    }
    override fun Download(): String {
        if (cache == null) {
            cache = downloader.Download()
        }
        return cache
    }
}
class Download(_cacheDownloader: CacheDownloader) {
    private val cacheDownloader: CacheDownloader
    init {
        cacheDownloader = _cacheDownloader
    }
    fun renderPage(): String {
        return cacheDownloader.Download()
    }
}
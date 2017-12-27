abstract class VideoGame() {
    abstract fun initialize()
    abstract fun startPlay()
    abstract fun endPlay()

    fun play() {
        initialize()
        startPlay()
        endPlay()
    }
}
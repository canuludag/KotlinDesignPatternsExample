class GrandTheftAuto() : VideoGame() {
    override fun initialize() {
        println("Initializing GTA...")
    }

    override fun startPlay() {
        println("GTA started. Have fun!")
    }

    override fun endPlay() {
        println("GTA finished. Play again?")
    }
}
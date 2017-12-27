class WeatherObserver(subject: Subject) : Observer, DataPresenter {

    private var pressure: Int = 0
    private var temperature: Int = 0
    private var humidity: Int = 0

    init {
        subject.addObserver(this)
    }

    override fun update(pressure: Int, temperature: Int, humidity: Int) {
        this.pressure = pressure
        this.temperature = temperature
        this.humidity = humidity

        showData()
    }

    override fun showData() {
        println("Pressure: ${this.pressure} - Temperature: ${this.temperature} - Humidity: ${this.humidity}")
    }

}

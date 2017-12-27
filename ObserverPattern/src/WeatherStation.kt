class WeatherStation() : Subject {
    var pressure: Int = 0
        set(value) {
            field = value
            println("Pressure changed...")
            notifyAllObservers()
        }
    var temperature: Int = 0
        set(value) {
            field = value
            println("Temperature changed...")
            notifyAllObservers()
        }
    var humidity: Int = 0
        set(value) {
            field = value
            println("Humidity changed...")
            notifyAllObservers()
        }
    private var observersList: ArrayList<Observer> = arrayListOf()

    override fun addObserver(observer: Observer) {
        this.observersList.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        this.observersList.remove(observer)
    }

    override fun notifyAllObservers() {
        observersList.forEach {
            it.update(pressure, temperature, humidity)
        }
    }
}
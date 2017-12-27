fun main(args: Array<String>) {
    val station = WeatherStation()
    val weatherObserver = WeatherObserver(station)

    station.humidity = 100
    station.pressure = 400
    station.temperature = 200

    station.humidity = 150
}
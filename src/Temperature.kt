class Temperature (private val unit: TemperatureUnit) {

    private var tempInC = 0.0

    fun setTemperature(newTemp: Double) {
        when(unit) {
            TemperatureUnit.Fahrenheit -> this.tempInC = (newTemp - 32.0) * 5.0 / 9.0
            TemperatureUnit.Celsius -> this.tempInC = newTemp
            TemperatureUnit.Kelvin -> this.tempInC = newTemp - 273.15
        }
    }

    fun getTemperatureInF() : Double {
        return (this.tempInC * 9.0 / 5.0) + 32
    }
    fun getTemperatureInC() : Double {
        return this.tempInC
    }

    fun getTemperatureInK() : Double {
        return this.tempInC + 273.15
    }
}

enum class TemperatureUnit {
    Celsius,
    Kelvin,
    Fahrenheit
}
fun main() {
    val thing = Temperature(TemperatureUnit.Fahrenheit)
    thing.setTemperature(25.0)
    println(thing.getTemperatureInC())
    println(thing.getTemperatureInF())
    println(thing.getTemperatureInK())
}
fun main() {
    var suhuCelsius : Double = 0.0
    var suhuFahrenheit = (suhuCelsius * 9/5) + 32
    var suhuKelvin = suhuCelsius + 273.15
    
    print("Masukkan suhu dalam Celsius: ")
    suhuCelsius = readln().toDouble()
    
    println("Suhu dalam Fahrenheit: $suhuFahrenheit")
    println("Suhu dalam Kelvin: $suhuKelvin")
}

var convertTemp = function(celsius) {
    const kelvin = (celsius + 273.15).toFixed(5);
    const fahrenheit = ((celsius * 1.8 ) + 32).toFixed(5)
    return [kelvin, fahrenheit]
}

convertTemp(36.50)
convertTemp(122.11)
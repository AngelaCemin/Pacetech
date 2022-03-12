algoritmo "semnome"

.
var

inicio
Escreval("Digite a temperatura em graus Celcius:")
         leia(celsius)
         fahrrenheit <- (celsius * 1.8) + 32
         Escreval("A temperatura é :",fahrrenheit, " Fahrrenheit")
      senao
      se menu = "4" entao
         Escreval("Informe a temperatura graus Fahrrenheit:")
         leia(fahrrenheit)
         celsius <- (fahrrenheit - 32) × (5/9)
         Escreval("A temperatura é",celsius, " graus Celsius")
// Seção de Comandos 
fimalgoritmo

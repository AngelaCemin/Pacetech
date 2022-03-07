algoritmo "Temperaturas - projeto semana 5"

var
  F, C : real
  menu: literal
  

inicio
Repita
Escreval("Qual conversão deseja realizar?")
Escreval (" Digite 1 pra Converter Celsius para Fahrenheit")
Escreval ("ou 2 para converter Fahrenheit para Celsius.")
leia (menu)

         Escreval("Informe a temperatura em Celsius.")
         leia(C)
         F <- (9 * C + 160) / 5
         Escreval (" A temperaturea em  Fahrenheit é:",F)
        senao se
        menu = "2" entao
        Escreval ("Informe a temperatura em Fahrenheit.")
         leia(F)
         C <- (F-32)/1,8
         Escreval (" A temperatura em  Celsiud é",C)

fimse

fimalgoritmo

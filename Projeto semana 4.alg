algoritmo "Projeto Semana 4"

var
cotacaodolar, reais, dolar, fahrrenheit, celsius:real
menu:literal
inicio
Escreval("Bem vindo!")
Escreval("Estou aqui para facilitar o seu dia! Por favor informe a cotação atual do dólar:")
leia(cotacaodolar)
repita
      Escreval("Digite a opção desejada:")
      Escreval(" Digite 1 para converter dólar em real.")
      Escreval("Digite 2 para converter real em dólar.")
      Escreval("Digite 3 para converter Fahrrenheit para graus Celcius.")
      Escreval("Digite 4 para converter graus Celcius para Fahrrenheit.")
      Escreval("Ou digite 5 para sair do aplicativo")
      leia(menu)
      se menu = "1" entao
         Escreval("Informe a quantidade de dolar que pretende converter. Digite apenas números:")
         leia(dolar)
         reais <- dolar*cotacaodolar
         escreval(" O valor é R$:" ,reais)
      senao
      se menu = "2" entao
         Escreval("Informe a quantidade de reias que pretende converter.")
         leia(reais)
         dolar <- reais/cotacaodolar
         Escreval("O valor é USD:" ,dolar )
      senao
      se menu = "3" entao
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
      senao
      se menu = "5" entao
         Escreval("Tenha um bom dia!")
      fimse
      fimse
      fimse
      fimse
      fimse
ate menu = "5"

fimalgoritmo

algoritmo "projetoSemana4"

var
opcaomenu : caractere
tempC, tempF, cotacaoDolar, reais, dolares : real
inicio

enquanto opcaomenu <> "5" faca

escreval ("Olá, seja bem vindo!")
escreval ("Digite o número correspondente a opção que deseja fazer, por favor.")
escreval ("1 - Para converter graus Celsius para Fahrenheit.")
escreval ("2 - Para converter graus Fahrenheit para Celsius.")
escreval ("3 - Para converter Reais para Dólares.")
escreval ("4 - Para converter Dólares para Reais.")
escreval ("5 - Para sair do programa.")
escreval ("")
leia (opcaomenu)

escolha (opcaomenu)

caso "1"
escreval ("Você escolheu converter graus Celsius para graus Fahrenheit")
escreval ("Diga a temperatura em graus Celsius, por favor")
leia (tempC)
tempF <- (tempC * 1.8) + 32
escreval ("A temperatura convertida é igual a ", tempF, " graus Fahrenheit")
escreval ("")

caso "2"
escreval ("Você escolheu converter graus Fahrenheit para graus Celsius")
escreval ("Diga a temperatura em graus Fahrenheit, por favor")
leia (tempF)
tempC <- (tempF - 32) / 1.8
escreval ("A temperatura convertida é igual a ", tempC, " graus Celsius")
escreval ("")


caso "3"
escreval ("Você escolheu Reais para Dólares")
escreval ("Diga quantos reais valem 1 dólar, por favor")
leia (cotacaoDolar)
escreval ("Diga o valor em real que deseja converter em dólar, por favor.")
leia (reais)
dolares <- reais / cotacaoDolar
escreval (reais, " reais é igual a ", dolares, " dólares.")
escreval ("")

caso "4"
escreval ("Você escolheu Dólares para Reais")
escreval ("Diga quantos reais valem 1 dólar, por favor")
leia (cotacaoDolar)
escreval ("Diga o valor em dólar que deseja converter em reais, por favor.")
leia (dolares)
reais <- dolares * cotacaoDolar
escreval (dolares, " dólares é igual a ", reais, " reais.")
escreval ("")

caso "5"
escreval ("Você escolheu sair do programa!")

outrocaso
escreval ("Opção inválida")
escreval ("")

fimescolha
fimenquanto

fimalgoritmo

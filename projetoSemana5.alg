algoritmo "projetoSemana5"

var
opcaomenu : caractere
aux : real
i,j :inteiro
cotacaoDolar, reais, dolares : real
hora : vetor[1..4] de inteiro
tempC : vetor[1..4] de real
tempF : vetor[1..4] de real
numeros : vetor[1..4] de real
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
para i de 1 ate 4 faca
escreval ("Diga a temperatura em graus Celsius, por favor")
leia (tempC[i])
escreval ("Diga que horas a temperatura foi registrada")
escreval ("")
leia (hora[i])
tempF[i] <- ((tempC[i] * 1.8) + 32)
fimpara


para i de 1 ate 4 faca
   para j de 1 ate 4 faca
      se tempC[j] > tempC[i] entao
         aux <- tempC[i]
         tempC[i] <- tempC[j]
         tempC[j] <- aux
      fimse
   fimpara
fimpara

para i de 1 ate 4 faca
   para j de 1 ate 4 faca
      se tempF[j] > tempF[i] entao
         aux <- tempF[i]
         tempF[i] <- tempF[j]
         tempF[j] <- aux
      fimse
   fimpara
fimpara

para i de 1 ate 4 faca
escreval ("A temperatura ",tempC[i], " graus C "," Registrado as ",hora[i]," horas ", " convertita fica ", tempF[i], " graus F ")
fimpara

caso "2"
para i de 1 ate 4 faca
escreval ("Diga a temperatura em graus Fahrenheit, por favor")
leia (tempF[i])
escreval ("Diga que horas a temperatura foi registrada")
leia (hora[i])
tempC[i] <- ((tempF[i] - 32) / 1.8)
escreval ("")
fimpara


para i de 1 ate 4 faca
   para j de 1 ate 4 faca
      se tempC[j] > tempC[i] entao
         aux <- tempC[i]
         tempC[i] <- tempC[j]
         tempC[j] <- aux
      fimse
   fimpara
fimpara

para i de 1 ate 4 faca
   para j de 1 ate 4 faca
      se tempF[j] > tempF[i] entao
         aux <- tempF[i]
         tempF[i] <- tempF[j]
         tempF[j] <- aux
      fimse
   fimpara
fimpara

para i de 1 ate 4 faca
escreval ("A temperatura ",tempF[i], " graus F "," Registrado as ",hora[i]," horas ", " convertita fica ", tempC[i], " graus C ")
fimpara



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
leia (dólares)
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

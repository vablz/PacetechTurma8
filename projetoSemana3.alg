algoritmo "projetoSemana3"
//Este é um algoritmo onde um usuário informa o seu salário e é retornado a ele o seu salário + 30%
var
  salario, salario30 : real
inicio

escreval ("Seja bem vindo!")
escreval("Informe o seu salário")
leia (salario)
salario30 <- (0.3 * salario) + salario
escreval("Parabéns! Você ganhou um aumento de 30%, agora seu salário é de ",salario30," reais")

fimalgoritmo

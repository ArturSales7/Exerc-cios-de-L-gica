
const idade = Number(prompt('Informe sua idade:'));

if (isNaN(idade) || idade < 0) {
  alert('Idade inválida. Digite um número positivo.');
} else if (idade < 16) {
  alert('Você não pode votar ainda.');
} else if ((idade >= 16 && idade < 18) || idade >= 70) {
  alert('O voto é opcional para você.');
} else {
  alert('O voto é obrigatório para você.');
}

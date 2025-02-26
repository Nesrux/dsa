const name = "Alice";
const age = 12;
const points = 9.1;

//Literais simples
// Utilizando aspas simples
const str2 = "Olá mundo!";

//Utilizando aspas duplas
const str1 = "Olá mundo!";

//Utilizando crase
const str3 = `Olá mundo!`;

console.log(str1);

//Concatenação de Strings
//usar a concateção é uma boa forma para criar strings mais complexas
//e dinamicas
console.log(
  `${name} tem ${age} anos de idade e possui a pontuação de ${points}`
);

// Caracteres de escape

const str4 = "Cliente \n Alice quebrou";
const str5 = "C:\\program files \\ windows";
const st6 = ' "Entendo " ';

// Imutabilidade
let str = "Olá, meu nome é Joao";
let arr = str.split("");
arr[18] = "ã";
str = arr.join("");

console.log(str);

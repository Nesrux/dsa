/**
 * Dado um array de vendedores, cada um representado por um objeto com o nome do vendedor 
 * name e o valor de suas vendas amount, crie uma função para encontrar e retornar o vendedor
 * que obteve o maior valor de venda.
 * Utilize o seguinte arquivo para o problema: seller.json

 */

const sellers = [
  {
    name: "Barry Allen",
    amount: 18196.0,
  },
  {
    name: "Logan",
    amount: 4255.0,
  },
  {
    name: "Maria",
    amount: 10298.0,
  },
  {
    name: "Ana",
    amount: 26485.0,
  },
  {
    name: "Aurora",
    amount: 19982.0,
  },
  {
    name: "Noah",
    amount: 15820.0,
  },
  {
    name: "Leo",
    amount: 21412.0,
  },
  {
    name: "Alex",
    amount: 12000.0,
  },
];

const findMaxSellers = (arr) => {
  let maxAmount = 0;
  let seller;
  for (const item of arr) {
    if (item.amount > maxAmount) {
      maxAmount = item.amount;
      seller = item;
    }
  }
  return seller;
};

//Exemplo de uso
const maxSeller = findMaxSellers(sellers);

console.log(maxSeller)

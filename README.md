# # 📌 Operações Condicionais e Cálculos com Listas em Java

Este repositório contém diversos programas em Java que exploram o uso de estruturas condicionais, 
manipulação de dados, e a criação de métodos para modularizar e organizar o código. 
O foco principal é a manipulação de listas, como a `List<Integer>`, 
e a realização de operações envolvendo loops, verificações de condições, e captura de exceções com `try-catch`.

Um dos exemplos de aplicação é a implementação de um método que recebe um valor numérico, como 12, 
e retorna todos os números primos anteriores a esse valor no formato de um array. Para isso, 
foi necessário utilizar um laço `for` e manipulação da lista de primos, aproveitando 
o método `.size()` para determinar o comprimento da lista.

## 🚀 Tecnologias Utilizadas

- **Java (JDK 8+)**
- **Scanner** para entrada de dados do usuário
- **Estruturas de controle** (condicionais: `if`, `else if`, `else`; loops: `for`)
- **Estruturas de dados** (`List<Integer>`, `Map` e `entrySet`)
- **Captura de exceções** com `try-catch`
- **Métodos** para modularização e organização do código
- **Manipulação de listas** para cálculo de números primos

## 📌 Confira meu artigo no DEV.to

Para aprender mais sobre Java e ver exemplos de exercícios práticos, confira meu artigo no 
[DEV.to](https://dev.to/vitorpaiola/lista-de-exercicios-basicos-em-java-part-4-5fl0)! 🚀 No artigo, 
compartilho soluções de problemas comuns e discuto técnicas para melhorar o código Java, 
além de apresentar exemplos de uso de estruturas condicionais, loops e manipulação de dados.

## 📂 Estrutura do Projeto

```estrutura
📦 repeat-loops
├── 📁 calculoPotencia
│   └── CalculoPotencia.java
├── 📁 metodoIntStreamV1
│   └── MetodoIntStreamV1.java
├── 📁 metodoIntStreamV2
│   └── MetodoIntStreamV2.java
├── 📁 metodoIntStreamV3
│   └── MetodoIntStreamV3.java
├── 📁 metodoIntStreamV4
│   └── MetodoIntStreamV4.java
├── 📁 numerosDeUmACem
│   └── NumerosDeUmACem.java
├── 📁 numerosDeUmADez
│   └── NumerosDeUmADez.java
├── 📁 numerosDeUmADezV2
│   └── NumerosDeUmADezV2.java
├── 📁 numerosParesImparesV1
│   └── NumerosParesImparesV1.java
├── 📁 numerosParesImparesV2
│   └── NumerosParesImparesV2.java
├── 📁 numerosParesImparesV3
│   └── NumerosParesImparesV3.java
├── 📁 numerosParesV1
│   └── NumerosParesV1.java
├── 📁 numerosParesV2
│   └── NumerosParesV2.java
├── 📁 numerosParesV3
│   └── NumerosParesV3.java
├── 📁 numerosPrimos
│   └── NumerosPrimos.java
├── 📁 somaNumeros
│   └── SomaNumeros.java
├── 📁 somaNumerosPares
│   └── SomaNumerosPares.java
├── 📁 tabuada
│   └── Tabuada.java
├── 📁 tabuadaV2
│   └── TabuadaV2.java
└── 📁 verificarNumeroPrimo
    └── VerificarNumeroPrimo.java
```

## 🛠️ Como Compilar e Executar

Para compilar e executar qualquer um dos programas, siga os passos abaixo:

### 1️⃣ **Compilar**

Abra o terminal e navegue até a pasta `src` do projeto. Em seguida, 
execute o seguinte comando para compilar o código:

```sh
javac -d . repeat-loops/NomeDaPasta/NomeDoArquivo.java
```

### 2️⃣ **Executar**

Após a compilação, você pode executar o programa com o comando abaixo:

```sh
java repeat-loops.NomeDaPasta.NomeDoArquivo
```

Exemplo:

```sh
java repeat-loops.numerosParesV1.NumerosParesV1
```

## 📌 Descrição dos Programas

### ⚡ **Cálculo de Potência**
Escreva um programa que calcule e exiba o valor da potência de um número informado pelo usuário elevado a um expoente também informado pelo usuário, utilizando laços de repetição.

### 🔄 **Método IntStream V1**
Quando Usar IntStream?
1. Quando quiser código mais conciso e legível. Em vez de um `for` tradicional, um `IntStream` pode simplificar a iteração, deixando o código mais claro e enxuto.

### 🔄 **Método IntStream V2**
2. Quando precisar de operações encadeadas (Map, Filter, Reduce). Se precisar transformar números, filtrar valores ou calcular somas/médias, os métodos de `IntStream` tornam essas operações mais simples e eficientes.

### 🔄 **Método IntStream V3**
3. Quando precisar de paralelismo para melhor performance. Se estiver lidando com grandes quantidades de dados, o `parallel()` do `IntStream` pode ser utilizado para otimizar o processamento em múltiplos núcleos de CPU.

### 🔄 **Método IntStream V4**
4. Quando precisar de cálculos estatísticos rapidamente. A API de Streams facilita cálculos como média, máximo e mínimo, permitindo que você obtenha resultados de forma rápida e com menos código.

### 🔢 **Números de 1 a 100**
Faça um programa que exiba todos os números de 1 a 100 usando `IntStream`.

### 🔢 **Números de 1 a 10**
Escreva um programa que exiba todos os números de 1 a 10, utilizando um laço de repetição `while`.

### 🔢 **Números de 1 a 10 - Versão 2**
Escreva um programa que exiba todos os números de 1 a 10, utilizando um laço de repetição `for`.

### 🔢 **Números Pares e Ímpares - Versão 1**
Escreva um programa que exiba os números pares de 1 a 50 e os números ímpares de 51 a 100 utilizando um laço de repetição `while`.

### 🔢 **Números Pares e Ímpares - Versão 2**
Escreva um programa que exiba os números pares de 1 a 50 e os números ímpares de 51 a 100 utilizando um laço de repetição `for`.

### 🔢 **Números Pares e Ímpares - Versão 3**
Escreva um programa que exiba os números pares de 1 a 50 e os números ímpares de 51 a 100 utilizando `IntStream`.

### 🔢 **Números Pares - Versão 1**
Escreva um programa que exiba todos os números pares de 1 a 100 utilizando `IntStream`.

### 🔢 **Números Pares - Versão 2**
Escreva um programa que exiba todos os números pares de 1 a 100, e também exiba seu primeiro e último número, utilizando `int[]`, `Arrays` e `IntStream`.

### 🔢 **Números Pares - Versão 3**
Escreva um programa que exiba todos os números pares de 1 a 100 e calcule a soma entre eles, utilizando `List<Integer>` e `IntStream`.

### 🔢 **Números Primos**
Escreva um programa que solicite ao usuário um número N e exiba todos os números primos menores que N e a quantidade de números primos presentes naquele intervalo.

### ➕ **Soma de Números**
Escreva um programa que solicite ao usuário um número N e exiba a soma de todos os números de 1 a N, utilizando `for`, `while`, `IntStream` e `Map`.

### ➕ **Soma de Números Pares**
Faça um programa que calcule e exiba a soma dos números pares de 1 a 100 utilizando um laço de repetição (`while`, `for`, `IntStream` e `Map`).

### ➗ **Tabuada**
Crie um programa que solicite ao usuário um número e exiba a tabuada desse número utilizando um laço de repetição (`for`, `while` e `IntStream`).

### ➗ **Tabuada - Versão 2**
Escreva um programa que imprima na tela a tabuada de todos os números de 1 a 10 utilizando `for`, `while`, `IntStream` e `Map`.

### 🔢 **Verificação de Número Primo**
Escreva um programa que solicite ao usuário um número N e diga se o mesmo é primo ou não, utilizando `for`, `IntStream` e `Map`.

## 📌 Quer acompanhar mais dicas e novidades sobre Java?

🔔 Fique por dentro de tudo sobre Java! Me siga no [Twitter](https://x.com/v__souz) para receber dicas, 
novidades e atualizações! 🚀✨

---

### 📜 **Licença**
Este projeto foi desenvolvido por mim e está livre para uso e modificação sem restrições formais.
Fique à vontade para usar e adaptar o código conforme necessário.

### 🤝 **Contribuições**
Contribuições são sempre bem-vindas! Se você tem sugestões ou gostaria de adicionar novos 
programas ou funcionalidades, sinta-se à vontade para abrir um Pull Request. 
Estou ansioso para ver suas melhorias! 😃

# Lista de Exercício Fundamentos Java

Boas-vindas ao repositório do exercício `Fundamentos Java`

Para realizar o exercício, atente-se a cada passo descrito a seguir e se tiver **qualquer dúvida**, nos envie no _Slack_ da turma! #vqv 🚀

Aqui, você vai encontrar os detalhes de como estruturar o desenvolvimento do seu exercício a partir desse repositório, utilizando uma branch específica e um _Pull Request_ para colocar seus códigos.

## Termos e acordos
Ao iniciar este exercício, você concorda com as diretrizes do [Código de Conduta e do Manual da Pessoa Estudante da Trybe](https://app.betrybe.com/learn/student-manual/codigo-de-conduta-da-pessoa-estudante).

## Entregáveis

<details>
  <summary>🤷🏽‍♀️ Como entregar</summary><br />

Para entregar o seu exercício, você deverá criar um _Pull Request_ neste repositório.

Lembre-se que você pode consultar nosso conteúdo sobre [Git & GitHub](https://app.betrybe.com/learn/course/5e938f69-6e32-43b3-9685-c936530fd326/module/fc998c60-386e-46bc-83ca-4269beb17e17/section/fe827a71-3222-4b4d-a66f-ed98e09961af/day/1a530297-e176-4c79-8ed9-291ae2950540/lesson/2b2edce7-9c49-4907-92a2-aa571f823b79) e nosso [Blog - Git & GitHub](https://blog.betrybe.com/tecnologia/git-e-github/) sempre que precisar!
</details>

<details>
  <summary>👨‍💻 O que deverá ser desenvolvido</summary><br />

<!-- 🤔 Explicar brevemente o que será realizado ao longo do exercício. Aqui, é a porta de entrada para o exercício como projeto. 
Exemplo: Vamos fazer um exercício que vai deixar nítido como funções,com responsabilidades bem definidas,deixam o código mais bem escrito. Para isso, vamos criar uma série de funções com respostas já definidas e exercitar nossa lógica de programação.
-->

Esta é uma lista de exercícios, ou seja, cada um dos requisitos que iremos apresentar terá um contexto totalmente diferente entre si.

Nosso objetivo é explorar e praticar a lógica de programação.

</details>

<details>
  <summary><strong>📝 Habilidades a serem trabalhadas</strong></summary>

Neste exercício, verificamos se você é capaz de:

Utilizar conceitos de abstração para criar classes em Java.

Implementar getters e setters em classes de programação para acessar e modificar atributos.

Utilizar os tipos primitivos e não primitivos, estrutura de repetição em conjuntos e herança para criar classes derivadas de outras classes.

</details>

## Orientações

<details>

   <summary><strong>‼ Antes de começar a desenvolver </strong></summary>

1. Clone o repositório

- Use o comando: `git clone <url do repositório>`
- Entre na pasta do repositório que você acabou de clonar:
    - `cd <nome do repositório>`

2. Instale as dependências

    - `mvn install`  

3. Crie uma branch a partir da branch `main`

- Verifique que você está na branch `main`
    - Exemplo: `git branch`
- Se você não estiver, mude para a branch `main`
    - Exemplo: `git checkout main`
- Agora, crie uma branch à qual você vai submeter os `commits` do seu exercício:
    - Você deve criar uma branch no seguinte formato: `nome-sobrenome-nome-do-exercício`;
    - Exemplo: `git checkout -b maria-soares-lessons-learned`

4. Crie na raiz do exercício os arquivos que você precisará desenvolver:

- Verifique que você está na raiz do exercício:
    - Exemplo: `pwd` -> o retorno vai ser algo tipo _/Users/maria/code/**sd-0x-project-lessons-learned**_
- Crie os arquivos index.html e style.css:
    - Exemplo: `touch index.html style.css`

5. Adicione as mudanças ao _stage_ do Git e faça um `commit`

- Verifique que as mudanças ainda não estão no _stage_:
    - Exemplo: `git status` (devem aparecer listados os novos arquivos em vermelho)
- Adicione o novo arquivo ao _stage_ do Git:
    - Exemplo:
        - `git add .` (adicionando todas as mudanças - _que estavam em vermelho_ - ao stage do Git)
        - `git status` (devem aparecer listados os arquivos em verde)
- Faça o `commit` inicial:
    - Exemplo:
        - `git commit -m 'iniciando o exercício. VAMOS COM TUDO :rocket:'` (fazendo o primeiro commit)
        - `git status` (deve aparecer uma mensagem tipo _nothing to commit_ )

6. Adicione a sua branch com o novo `commit` ao repositório remoto

- Usando o exemplo anterior: `git push -u origin maria-soares-lessons-learned`

7. Crie um novo `Pull Request` _(PR)_

- Vá até a página de _Pull Requests_ do [repositório no GitHub](https://github.com/tryber/sd-0x-project-lessons-learned/pulls)
    - Clique no botão verde _"New pull request"_
    - Clique na caixa de seleção _"Compare"_ e escolha a sua branch **com atenção**
- Coloque um título para o seu _Pull Request_
    - Exemplo: _"Cria tela de busca"_
- Clique no botão verde _"Create pull request"_

- Adicione uma descrição para o _Pull Request_, um título nítido que o identifique, e clique no botão verde _"Create pull request"_

 <img width="1335" alt="Exemplo de pull request" src="https://user-images.githubusercontent.com/42356399/166255109-b95e6eb4-2503-45e5-8fb3-cf7caa0436e5.png">

- Volte até a [página de _Pull Requests_ do repositório](https://github.com/tryber/sd-0x-project-lessons-learned/pulls) e confira que o seu _Pull Request_ está criado

</details>

<details>

<summary><strong>⌨️ Durante o desenvolvimento</strong></summary>

Faça `commits` das alterações que você fizer no código regularmente, pois assim você garante visibilidade para o time da Trybe e treina essa prática para o mercado de trabalho :) ;

- Lembre-se de sempre após um (ou alguns) `commits` atualizar o repositório remoto;
- Os comandos que você utilizará com mais frequência são:
    - `git status` _(para verificar o que está em vermelho - fora do stage - e o que está em verde - no stage)_;
    - `git add` _(para adicionar arquivos ao stage do Git)_;
    - `git commit` _(para criar um commit com os arquivos que estão no stage do Git)_;
    - `git push -u origin nome-da-branch` _(para enviar o commit para o repositório remoto na primeira vez que fizer o `push` de uma nova branch)_;
    - `git push` _(para enviar o commit para o repositório remoto após o passo anterior)_.

</details>

<details>
<summary><strong>🎛 Checkstyle</strong></summary>

Para garantir a qualidade do código, vamos utilizar neste exercício o `Checkstyle`. Assim o código estará alinhado com as boas práticas de desenvolvimento, sendo mais legível e de fácil manutenção! Para poder rodar o `Checkstyle` certifique-se de ter executado o comando `mvn install` dentro do repositório.

Para rodá-los localmente no repositório, execute os comandos abaixo:

```bash
mvn checkstyle:check
```

Se a análise do `Checkstyle` encontrar problemas no seu código, tais problemas serão mostrados no seu terminal. Se não houver problema no seu código, nada será impresso no seu terminal.

Você pode também instalar o plugin do `Checkstyle` na sua `IDE`. Para isso, volte na primeira seção do conteúdo.

⚠️ **PULL REQUESTS COM ISSUES NO `Checkstyle` NÃO SERÃO AVALIADAS. ATENTE-SE PARA RESOLVÊ-LAS ANTES DE FINALIZAR O DESENVOLVIMENTO!** ⚠️

</details>

<details>
<summary><strong>🛠 Testes</strong></summary>

Para executar todos os testes basta rodar o comando:
```bash
mvn test
```

Para executar apenas uma classe de testes:
```bash
mvn test -Dtest="TestClassName"
```

</details>

## Requisitos

### 1 - Controle da Lâmpada

<details>
  <summary>Descrição</summary><br />

Para a primeira tarefa, espera-se que você consiga criar um algoritmo usando a linguagem Java. Este algoritmo deve controlar o estado de uma lâmpada. Para isso, você precisa implementar dois métodos: `ligarLampada` e `desligarLampada`, que irão mudar o estado da lâmpada. Além disso, você também deve criar um terceiro método, chamado `isLampadaLigada`, que será responsável por verificar e informar se a lâmpada está ligada ou não.💡

```java
public class SmartHouse {
 
  /*
   * Atributos.
   */
  
  /*
  * Métodos `ligarLampada`, `desligarLampada` e `isLampadaLigada`.
  */
}
```

Por exemplo,

- Supondo que a lâmpada esteja ligada, então a saída para o método `isLampadaLigada` será:
  
```text
true
```

- Supondo que a lâmpada esteja desligada, então a saída para o método `isLampadaLigada` será:

```text
false
```

</details>

### 2 - Monitoramento do Residente

<details>
  <summary>Descrição</summary><br />

No segundo requisito a casa inteligente precisa monitorar quem está residindo nela.


Você implementará a parte de um sistema! Sua função é implementar a classe `Residente` com os atributos públicos:

- `nome`: esse atributo é do tipo `String`;
- `idade`: esse atributo é do tipo `int`;
- `peso`: esse atributo é do tipo `double`;
- `altura`: esse atributo é do tipo `double`;

```java
public class Residente {
 
  // Seu código aqui
  /*
   * Atributos.
   */
}
```

Implemente seu construtor para que, quando um novo residente surgir (o objeto seja instanciado), seus atributos já sejam inicializados.

Imagine que você deseja visualizar as informações de um residente na saída do console do seu ambiente de desenvolvimento integrado (IDE). Veja abaixo como fazer isso com mais detalhes:

1. Criando a casa (objeto 'residente'): Primeiro, nós precisamos de um objeto Residente para representar a residente. No nosso exemplo, vamos criar um objeto residente que representa uma casa com um residente chamado "João". Este residente tem 22 anos, pesa 72 kg com 1,75 metros de altura. Criamos este objeto da seguinte forma:

```java
Residente residente = new Residente("João", 22, 72, 1.75);
```

2. Imprimindo as informações do residente: Agora que temos o nosso objeto residente, podemos imprimir as informações do residente no console. Para isso, utilizamos System.out.println, que é o comando que imprime textos na saída padrão (geralmente, o console da sua IDE). Aqui está como fazemos isso:

```java
System.out.println("Nome: " + residente.nome + "\nIdade: " + residente.idade + "\nPeso: " + residente.peso
     + "\nAltura: " + residente.altura);
```

Aqui está o código completo:

```java
public class Principal {
  public static void main(String[] args) {
      Resident residente = new Resident("João", 22, 72, 1.75);

    System.out.println("Nome: " + residente.nome + "\nIdade: " + residente.idade + "\nPeso: " + residente.peso
        + "\nAltura: " + residente.altura);
  }

}
```

</details>

### 3 - Cálculo do IMC

<details>
  <summary>Descrição</summary><br />

O terceiro requisito a casa inteligente deve conseguir calcular o Índice de Massa Corporal (IMC) do residente. Para isso, crie o método
- `calcularImc`

Por exemplo,

Supondo que os dados sejam: peso igual a 72kg e altura igual a 1.75, então a saída será:

```text
23.51020
```

Supondo que os dados sejam: peso igual a 54kg e altura igual a 1.70, então a saída será:

```text
18.68512
```

Imagine que você deseja visualizar as informações de um residente na saída do console do seu ambiente de desenvolvimento integrado (IDE). Veja abaixo como fazer isso com mais detalhes:

1. Criando o objeto `'residente'`: Primeiro, precisamos de um objeto Residente para representar o residente. Vamos criar um objeto chamado residente com nome de "João". Este residente tem 22 anos, pesa 72 kg e mede 1.75 metros de altura. Criamos esse objeto assim:

```java
Resident residente = new Residente("João", 22, 72, 1.75);
```

2. Calculando o IMC: O Índice de Massa Corporal é uma medida útil para entender se alguém está num peso saudável para a sua altura. No nosso objeto residente, há um método chamado calculaImc que realiza esse cálculo para o residente. Nós chamamos esse método e armazenamos o resultado na variável h:

```java
double h = residente.calculaImc();
```

Lembre-se, double é um tipo de dado que pode conter números reais, que é o tipo de valor que o cálculo do IMC produz.

Aqui está o código completo:

```java
public class Principal {
  public static void main(String[] args) {
    Residente residente = new Residente("João", 22, 72, 1.75);
    double h = residente.calculaImc();
    System.out.println(h);
  }
}
```

Após executar este programa, a saída será um número que representa o IMC do residente "João". Por exemplo, pode aparecer 23.51020, o IMC calculado com base no peso e altura fornecidos.

</details>

### 4 - Conexão à Internet

<details>
  <summary>Descrição</summary><br />

No quarto requisito, a casa inteligente deve tentar se conectar à internet. Dito isso, crie um método `conectarInternet` que simula a tentativa de conexão à internet usando uma taxa de conexão fornecida.

```java
public class SmartHouse {
 
  // Seu código aqui

  /*
  * Método `conectarInternet`.
  */
}
```

**Por exemplo:**

O método `conectarInternet` deve simular a tentativa da casa inteligente de se conectar à internet usando uma taxa de sucesso fornecida. Lembre-se de que este é um método de simulação; portanto, não precisaremos realmente implementar uma conexão com a Internet, apenas simular o processo.

Comece escrevendo a assinatura do método. No caso, ele é um método público que retorna um booleano (verdadeiro ou falso). Portanto, sua assinatura deve começar com `public boolean`. Em seguida, dê o nome ao método `conectarInternet` e adicione parênteses com um argumento `double` para a taxa de sucesso da conexão.

A lógica interna do método é bastante direta:

1. Se a `connectionRate` (taxa de conexão) for maior que 0.5, o método deve retornar `true`, indicando uma conexão bem-sucedida.
2. Se for menor ou igual a 0.5, o método deve retornar `false`, indicando que a conexão falhou.

**Por exemplo**, ao chamar `conectarInternet(0.8)`, você terá uma alta chance de sucesso e retornará `true`. No entanto, ao chamar `conectarInternet(0.2)`, o retorno é `false`.

```java
public class Principal {
  public static void main(String[] args) {
    SmartHouse casa = new SmartHouse();
    boolean conectado = casa.conectarInternet(0.7);
    System.out.println(conectado ? "Conectado à Internet" : "Falha na conexão à Internet");
  }
}
```
</details>

---

<details>
<summary><strong> 🗣 Nos dê feedbacks sobre o exercício!</strong></summary>

Ao finalizar e submeter o exercício, não se esqueça de avaliar sua experiência preenchendo o [formulário](https://be-trybe.typeform.com/to/ZTeR4IbH#cohort_hidden=CH1&template=betrybe/java-0x-exercicio-lista-fundamentos-java).
**Leva menos de 3 minutos!**

</details>

---

### respostas-aula-1

##### 1. (1 ponto) O que são variáveis, e quais os seus tipos?
 Variáveis são caracteres que o programador define para serão usadas para armazenamento. O que será armazenado em java depende do tipo dela. Existem dois tipos de tipos, primitivos e compostos. Os primitivos seriam int, char, double, float, boolean. E os compostos são String, Integer. Em java os compostos são na verdade classes definidas pela própria linguagem, por isso existem métodos neles. 

##### 2. (1 ponto) Explique com suas palavras, o que é Syntax (ou Sintaxe).
 Syntax é a forma de que o código deve ser escrito para que funcione, como as palavras reservadas devem ser usadas, pode-se dizer que são regras de escrita. Exemplo for deve ser seguido por parênteses e ter 3 argumentos dentro dele dividido por ponto e virgula.

##### 3. (1 ponto) Escreva uma função que receba um número, via Scanner, e imprima se o número é par ou impar.
Resposta:
``` java
import java.util.Scanner;

  public static void verificarParImpar(){
      System.out.println("Insira um número no console: ");
      Scanner entrada = new Scanner(System.in);
      int number = entrada.nextInt();
      if (number%2 ==0)
          System.out.println("O número "+number+" é par.");
      else
          System.out.println("O número "+number+" é impar.");
  }
```
##### 4. (1 ponto) Escreva uma função que receba um parâmetro e informe se o mesmo é ou não um número inteiro.
Resposta:
```java
    public static void verificarInteiroOuNao(Number number) {
      if (number.equals(number.intValue()))
          System.out.println("O número " + number + " é inteiro.");
      else
          System.out.println("O número " + number + " não é inteiro.");
    }
```

##### 5. (1 ponto) Escreva uma função para ler um valor, via Scanner, e alertar se é positivo ou negativo. Considere o valor zero como positivo.
Resposta:
```java
  public static void verificarPositivoOuNao() {
      System.out.println("Informe um número inteiro: ");
      Scanner entrada = new Scanner(System.in);
      int number = entrada.nextInt();
      if (number >= 0)
          System.out.println("O número " + number + " é positivo.");
      else
          System.out.println("O número " + number + " é negativo.");
  }
```



##### 6.(1 ponto) Escreva uma função que leia o código de origem de um produto, via Scanner, e imprima na tela a região de sua procedência conforme a tabela abaixo:

- Código 1: Sul
- Código 2: Norte
- Código 3: Leste
- Código 4: Oeste
- Código 5 ou 6: Nordeste
- Código 7, 8 ou 9: Sudeste
- Código 10: Centro-Oeste
- Código 11: Noroeste
- Observação: Caso o código não seja nenhum dos especificados o produto deve ser encarado como Importado.

Resposta:
```java
    public static void origemProduto(){
        System.out.println("Informe o número do produto: ");
        Scanner entrada = new Scanner(System.in);
        int number = entrada.nextInt();
        System.out.println("A origem do produto "+number+" é:");
        switch (number){
            case 1:
                System.out.println("Sul");break;
            case 2:
                System.out.println("Norte");
                break;
            case 3:
                System.out.println("Leste");
                break;
            case 4:
                System.out.println("Oeste");
                break;
            case 5:
                System.out.println("Nordeste");
                break;
            case 6:
                System.out.println("Nordeste");
                break;
            case 7:
                System.out.println("Sudeste");
                break;
            case 8:
                System.out.println("Sudeste");
                break;
            case 9:
                System.out.println("Sudeste");
                break;
            case 10:
                System.out.println("Centro-Oeste");
                break;
            case 11:
                System.out.println("Noroeste");
                break;
            default:
                System.out.println("Importado");
        }
    }
```
##### 7.(5 pontos) Resolver o exercícios hard core 3 dos slides acima citados.
Está no src deste mesmo repositório.









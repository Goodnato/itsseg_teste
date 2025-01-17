
# Desafio de Programação

Crie um repositório no seu GITHUB, resolva as questões abaixo e passe o link para avaliarmos as respostas.  
:D  

---

## 1 - Verificar se uma frase é pangramática

Uma frase pangramática utiliza todas as letras do alfabeto pelo menos uma vez.  
Por exemplo, a sentença `"Quero faxina nas locadoras de video: jogue blitz com whisky PM"` cumpre essa característica, pois contém cada letra de A a Z ao menos uma vez (detalhes extras podem ser ignorados).  

Dado um texto, determine se ele é pangramático ou não. Retorne `True` caso seja, e `False` caso contrário.  
Desconsidere números e símbolos de pontuação na verificação.  

```java
public class ExercicioUmTest {
    @Test
    public void test1() {
        String pangram1 = "Quero faxina nas locadoras de video: jogue blitz com whisky PM";
        TesteUm pc = new TesteUm();
        assertEquals(true, pc.check(pangram1));
    }
    @Test
    public void test2() {
        String pangram2 = "You shall not pass!";
        TesteUm pc = new TesteUm();
        assertEquals(false, pc.check(pangram2));
    }
}
```

## 2 - Remover vogais de comentários ofensivos

Comentários indesejados estão invadindo sua página!  

Uma estratégia eficiente para lidar com isso é eliminar todas as vogais presentes nas mensagens ofensivas, enfraquecendo o impacto delas.  

O desafio é criar uma função que receba um texto e devolva uma nova versão sem nenhuma vogal.  

Por exemplo, ao processar a frase `"This website is for losers LOL!"`, o resultado seria `"sts st pr prdrs LL!"`.  

```java
public class ExercicioDoisTest {
    public void test1() {
        assertEquals("Ths wbst s fr lsrs LL!", ExercicioDois.disemvowel("This website is for losers LOL!"));

        assertEquals("N ffns bt, Yr wrtng s mng th wrst 'v vr rd", ExercicioDois.disemvowel("No offense but, Your writing is among the worst I've ever read"));

        assertEquals("Wht r y,  cmmnst?", ExercicioDois.disemvowel("What are you, a communist?"));
    }
}
```

## 3 - Encontrar o maior e o menor número em uma sequência

Nesta pequena tarefa, você recebe uma sequência de números separados por espaços e deve retornar o maior e o menor número.  

**Exemplos:**  
```java
highAndLow("1 2 3 4 5") // return "5 1"
highAndLow("1 2 -3 4 5") // return "5 -3"
highAndLow("1 9 3 4 -5") // return "9 -5"
```

## 4 - Verificar se uma string termina com outra

Complete a solução para que ela retorne verdadeiro se o primeiro argumento (string) passado terminar com o segundo argumento (também uma string).  

**Exemplos:**  
```java
solution('abc', 'bc') // returns true
solution('abc', 'd') // returns false
```

## 5 - Inverter palavras em uma frase

Complete a função que aceita um parâmetro string e inverte cada palavra na string. Todos os espaços na string devem ser mantidos.  

**Exemplos:**  
```java
"This is an example!" ==> "sihT si na !elpmaxe"
"double  spaces"      ==> "elbuod  secaps"
```

## 6 - Fechando em soma

Crie uma função que retorne a soma dos dígitos formados a partir do primeiro e do último dígito, até o centro do número.

**Exemplo:**
```java
2520 ➞ 72

# The first and last digits are 2 and 0.
# 2 and 0 form 20.
# The second digit is 5 and the second to last digit is 2.
# 5 and 2 form 52.
# 20 + 52 = 72

121 ➞ 13
# 11 + 2

1039 ➞ 22
# 19 + 3

22225555 ➞ 100
# 25 + 25 + 25 + 25
```

**Notas**
```java
Se o número tiver um número ímpar de dígitos, basta adicionar o número de um único dígito no centro (veja o exemplo nº 1).
Qualquer número preenchido com zeros conta como um único dígito (veja o exemplo nº 2).
```

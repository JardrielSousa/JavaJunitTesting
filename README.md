# README para a Classe de Testes `CalcTest`

A classe `CalcTest` foi criada para testar as operações matemáticas básicas fornecidas pela classe `SimpleCalc`. Os testes foram implementados usando o JUnit 5 e Spring Boot Test para garantir a correta funcionalidade das operações matemáticas.

## Descrição dos Testes

A classe `CalcTest` inclui os seguintes métodos de teste:

1. **Soma**
   - **Descrição:** Verifica se a soma de 5 e 4.5 resulta em 9.5.
   - **Método:** `testSum_when_Five_is_addBy_FourDotFive_ShouldReturnNineDotFive()`
   - **Teste realizado:** Calcula a soma dos números e compara o resultado com o valor esperado.

2. **Subtração**
   - **Descrição:** Verifica se a subtração de 10 por 9 resulta em 1.
   - **Método:** `testSubtration_when_ten_is_subtrationBy_nine_shouldReturnOne()`
   - **Teste realizado:** Calcula a subtração dos números e compara o resultado com o valor esperado.

3. **Multiplicação**
   - **Descrição:** Verifica se a multiplicação de 7 por 3 resulta em 21.
   - **Método:** `test_multiplication_when_seven_multiplyByThree_ShouldReturn_Twenty_one()`
   - **Teste realizado:** Calcula a multiplicação dos números e compara o resultado com o valor esperado.

4. **Divisão**
   - **Descrição:** Verifica se a divisão de 10 por 5 resulta em 2.
   - **Método:** `test_Division_ten_divisionBy_five_shouldReturn_Two()`
   - **Teste realizado:** Calcula a divisão dos números e compara o resultado com o valor esperado.

5. **Divisão por Zero**
   - **Descrição:** Verifica se a tentativa de dividir 10 por 0 lança uma exceção `ArithmeticException` com a mensagem "Impossible to divide by zero!".
   - **Método:** `test_Division_ten_divisionBy_Zero_shouldReturn_Throw()`
   - **Teste realizado:** Executa a divisão por zero e valida se a exceção lançada é a esperada e se a mensagem da exceção corresponde à esperada.

6. **Raiz Quadrada**
   - **Descrição:** Verifica se a raiz quadrada de 25 resulta em 5.
   - **Método:** `squareRootTest()`
   - **Teste realizado:** Calcula a raiz quadrada do número e compara o resultado com o valor esperado.

## Como Executar os Testes

Para executar os testes, você precisa ter o Maven ou Gradle configurado no seu projeto. Utilize os seguintes comandos para executar os testes:

- **Com Maven:**
  ```bash
  mvn test

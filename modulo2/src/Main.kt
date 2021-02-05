/*
* Tipos básicos de dados no kotlin
*
* Byte: de -128 até 127
* Short: -32768 até 32767
* Int: Inteiro, é sempre o default quando não se declara o tipo. Vai de -2^31 até -2^32-1
* Long: posso declarar como long ou usar um L após o valor da variável para transformá-la em um Long.
* Float: igual ao long, posso transformar colocando a letra f ao valor da variável. Casas decimais
* Double: casas decimais. Dar preferência para usar esse ao invés de float.
* Boolean: Booleano (Verdadeiro/Falso)
* arrayOf: Tipo vetor/matriz. Sempre iniciam na posição 0
* String: tipo que aceita textos e caracteres.
*
* O kotlin aceita underscore para separar as casas dos números grandes por exemplo 1000000 fica 1_000_000
*
* Posso converter o conteúdo das variáveis igual no javascript, com o nome da variável e .to onde escolherei a nova
* tipagem.
*
* Quebra de linha no Kotlin: utilizar """texto""" ou \n
* Template string: usar o $ para exibir uma variável
* */

/*
* Tipos de variáveis
*
* val: não podem ser modificadas, constantes
* var: podem ser alteradas
*
* As variáveis no kotlin devem sempre ser inicializadas. Se eu não quiser inicializar imediatamente, posso atribuir
* null ou usar lateinit var
* */

fun main() {
    println("Hello World!")
}
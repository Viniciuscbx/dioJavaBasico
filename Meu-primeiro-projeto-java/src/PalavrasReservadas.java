// controle de pacotes
import // importa pacotes ou classes para dentro do codigo
package // especifica a que pacote todas as classes de um arquivo pertencem

//Modifcadores de acesso
public // acesso de qualquer classe
private // acesso apenas dentro da classe
protected // acesso por classes ne mesmo pacote e subclasses

//Tipos primitivos
boolean // um valor indicando verdaeiro ou falso
byte // um inteiro de 8 bits (signed)
char // um caracter unicode (16-bit unsigned)
double // um número de ponto flutuante de 64 bits (signed)
float // um numero de ponto flutuante de 32 bits (signed)
long // um numero inteiro de 64 bits (signed)
short // um inteiro de 32 bits (signed)
void // indica que o método não tem retorno de valor

// Modificadores de classes, variáveis ou métodos
abstract // classe que não pode ser instanciada ou método que precisa ser implementado por uma subclasse não abstrata
class // especifica uma classe
extends // indica a superclasse que a subclasse está estendendo
final // impossibilita que uma classe seja estandida, que um método seja sobrescrito ou que uma variável seja reinicializada
implements // indica as interfaces que uma classe irá implementar
interface // especifica uma interface
native // indica que um método está escrito em uma liguagem dependente de plataforma, como o C
new // instancia um novo objeto, chamando seu construtor
static // faz um método ou variável pertencer à classe ao invés de às instancias
strictfp /* usado em frente a um médoto ou classe para indicar que os 
números de ponto flutuantes seguirão as regras de ponto flutuante em 
todas as expressões */
synchronized /* indica que um método só pode ser acessado por uma thread de cada vez */
transient // impede a serialização de campos
volatile // indica que uma variável podser alterada durante o uso de threads


//Controle de fluxo de um bloco de código
break // sai do bloco de código em que ele está
case // executa um bloco de código dependendo do teste do switch
continue // pula a execução do bloco que viria após essa linha e vai para a proxima passsagem do loop


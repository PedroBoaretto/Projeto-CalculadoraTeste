
package calculadora;

public class CalculadoraTeste {
    //teste SOMA
    public static void main(String[] args) {
        // instanciando novo objeto
        soma calc = new soma(); 
        
        // soma recebendo dois valores
        int soma = calc.somar(3,7); 

        // soma recebendo dois valores sendo um deles negativo
        int soma = calc.somar(3,-7);
        //printando o resultado
        System.out.println(soma); 
    }
    
    //teste SUBTRACAO
    public static void subtrair(String[] args) {
        // instanciando novo objeto
        subtracao calc = new subtracao(); 
        
        // substracao recebendo dois valores inteiros 
        int subtracao = calc.subtrair(7,3);
        
        // substracao recebendo dois valores sendo o minuendo menor que o subtraendo 
        int subtracao = calc.subtrair(3,7);
        
        // substracao recebendo dois valores sendo um deles 0 
        int subtracao = calc.subtrair(7,0);
        
        //printando o resultado
        System.out.println(subtracao); 
    }
    
    
    //teste MULTIPLICACAO
    public static void multiplicacao(String[] args) {
       // instanciando novo objeto
        multiplicacao calc = new multiplicacao(); 
        
        // multiplicacao recebendo dois valores inetiros
        int multiplicacao = calc.multiplicar(3,7);
        
        // multiplicacao recebendo dois valores sendo um 0
        int multiplicacao = calc.multiplicar(3,0);
        
        // multiplicacao recebendo dois valores sendo um negativo
        int multiplicacao = calc.multiplicar(3,-7);
        
        // multiplicacao recebendo dois valores sendo um decimal
        int multiplicacao = calc.multiplicar(3,7.1);
        
        //printando o resultado
        System.out.println(multiplicacao); 
    }
    
    
    //teste DIVISAO
    public static void divisao(String[] args) {
        // instanciando novo objeto
        divisao calc = new divisao(); 
        
        // variavel divisao recebendo dois valores inteiros sendo o divisor maior que o dividendo
        float divisao = calc.dividir(3,7);
        
        // variavel divisao recebendo dois valores inteiros(divisao possivel, sem erros)
        float divisao = calc.dividir(7,3);
        
        // variavel divisao recebendo dois valores inteiros sendo o dividendo 0
        float divisao = calc.dividir(0,7);
        
        // variavel divisao recebendo dois valores inteiros sendo o divisor 0
        float divisao = calc.dividir(3,0);
        //printando o resultado
        System.out.println(divisao); 
    }
    
}

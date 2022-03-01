package listadeexerciciosl02;

import java.util.Scanner; 

public class Ex003Lucro {
    public static void main(String[] args) {
        
        float precoProduto; 
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe o valor do produto: ");
        precoProduto = input.nextFloat(); 
        
        float resultadoLucro; 
        
        //(a fórmula para calcular é: lucro bruto = receitas totais – custos).
        
        if(precoProduto <= 20){
            //45%
            resultadoLucro = precoProduto - 45; 
        } else {
            //30%
            resultadoLucro = precoProduto - 30; 
        }
        
        System.out.println(resultadoLucro);

    }
}

public class OperadoresCondicionais {
    public static void main(String[] args) throws Exception {
        double salario = 6000; 
        String mensagemDoar = "Eu vou doar 500 pro DevDojo"; 
        String mesagemNaoDoar = "Ainda não tenho condições, mas vou ter!"; 
        String resultado = salario > 5000 ? mensagemDoar : mesagemNaoDoar; 
        System.out.println(resultado);
    }
}

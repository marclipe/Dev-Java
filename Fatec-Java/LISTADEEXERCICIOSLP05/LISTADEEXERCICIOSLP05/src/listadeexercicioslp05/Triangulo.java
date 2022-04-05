package listadeexercicioslp05;


public class Triangulo {
    /*atributos a base e altura de um triângulo.*/
    
    /*Atributos da classe triangulo*/
    float base, altura, Area; 
    
    // Metodo para leitura
    //Na classe definir um método para leitura da base e altura
    public void SetTriangulo(float Base, float Altura) {
        base = Base;  
        altura = Altura; 
    }
    
    // Metodo para Calculo da Area 
    //um método construtor e um método para Calcular a área do triângulo (Area=Base* Altura)/2
    public float GetTriangulo(){
        Area = base * altura / 2;
        return Area; 
    }
    
    // Construtor da Media
    Triangulo() {
        base = 0; 
        altura = 0; 
        Area = 0; 
    } 
}

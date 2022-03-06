package estruturascondicionais;

public class EstruturasCondicionais07Switch {

    public static void main(String[] args) {
        //Dados os valores de 1 a 7, imprima se é dia útil ou final de semana 
        //Considerando 1 como Domingo 
        byte dia = 4;
        switch (dia) {
            case 1:
            case 7:
                System.out.println("FDS");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}

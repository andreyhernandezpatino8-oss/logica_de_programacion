public class app2 {
    static boolean salir = true;
    public static void main(String[] args) throws Exception{
          operacion(0, 0, "suma");
    }

    
    public static void operacion(double n1, double n2,String operacion){

        if (operacion.equals("suma")) {
            System.out.println(n1+n2); 
        }
        else if (operacion.equals("resta")) {
            System.out.println(n1-n2);
        }
        else if (operacion.equals("multiplicacion")) {
            System.out.println(n1*n2);
        }
        else if (operacion.equals("division")) {
            System.out.println(n1/n2);
        }
        else{
            System.out.println("Operacion no valida");
        }

       
    }
}

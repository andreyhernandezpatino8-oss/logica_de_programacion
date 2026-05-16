import java.util.Scanner;

public class app1 {
    static boolean salir = true;
    public static void main(String[] args) throws Exception
    {
         Scanner sc1= new Scanner(System.in);
         while (salir) {
            menu();
            int opcion = sc1.nextInt();
            navegacionMenu(opcion);
    }
    System.out.println("Fin");
    }
        public static void menu(){
            System.out.println("------------------------------");
            System.out.println("menu");
            System.out.println("pagar");
            System.out.println("resivir ");    
            System.out.println("consultar ");
            System.out.println("salir ");
            System.out.println("seleccione una opcion");
        }
        public static void navegacionMenu(int opcion){ 
        switch (opcion) {         
            case 1:
                pagar();
                break;
            case 2:
                recibir();
                break;
            case 3:
                consultar();
                break;
            case 4:
                salir = false;
                break;
            default: 
                System.out.println("Opcion no valida");
                break;
        }
       System.out.println("Fin");
    }

        }
        public static void pagar(){
            System.out.println("pagar");
        }
        public static void recibir(){
            System.out.println("revisando");
        }
        public static void consultar(){
            System.out.println("consultando");
        }
        public static void salir(){
            System.out.println("saliendo");
        }

        

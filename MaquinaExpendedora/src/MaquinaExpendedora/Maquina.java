package MaquinaExpendedora;

import java.util.Scanner;

public class Maquina {

    protected double precioBebida;
    protected String objetoSeleccionado;
    protected boolean maquinaOn_Off = true;
    protected boolean condicionalWhile = true;

    public Maquina() {

    }

    public void maquinaExpendedora() {

        while (condicionalWhile == true) {
            System.out.println("1 : Usar maquina\n2 : No usar maquina\nPor favor ingrese el numero correspondiente:");
            Scanner scanMaquinaOffOn = new Scanner(System.in);
            int maquinaOffOn = Integer.parseInt(scanMaquinaOffOn.nextLine());
            switch (maquinaOffOn) {
                case 1:
                    condicionalWhile = false;
                    maquinaOn_Off = true;
                    break;
                case 2:
                    condicionalWhile = false;
                    maquinaOn_Off = false;
                    break;
                default:
                    condicionalWhile = true;
                    maquinaOn_Off = false;
                    System.out.println("Numero erroneo.\nVuelva a ingresar la opcion correcta...\n");
            }
        }
        if (maquinaOn_Off == true) {
            System.out.println("Precios\n1 : Papas fritas(Lays) = $80\n2 : doritos = $70\n3 : Coca Cola(355 ml) = $120\n4 : Pepsi cola(355 ml) = $110\n5 : Fanta(355 ml)= $115\n6 : 3D(Snack) = $75\n7 : Alfajor guaymallen = $35\n8 : Alfajor Tofi triple = $96");
            System.out.println("Ingrese el dinero correspondiente a lo que quiere: \tEjemplo: Coca Cola = '120'");
            Scanner scanPrecio = new Scanner(System.in);
            precioBebida = Integer.parseInt(scanPrecio.nextLine());

            if (precioBebida == 80) {
                objetoSeleccionado = "Papas fritas(Lays)";
                System.out.println("Entregando " + objetoSeleccionado + "...");
                System.out.println("Gracias por su compra!");
            } 
            else if (precioBebida == 70) {
                objetoSeleccionado = "doritos";
                System.out.println("Entregando " + objetoSeleccionado + "...");
                System.out.println("Gracias por su compra!");
            } 
            else if (precioBebida == 120) {
                objetoSeleccionado = "Coca Cola(355 ml)";
                System.out.println("Entregando " + objetoSeleccionado + "...");
                System.out.println("Gracias por su compra!");
            } 
            else if (precioBebida == 110) {
                objetoSeleccionado = "Pepsi cola(355 ml)";
                System.out.println("Entregando " + objetoSeleccionado + "...");
                System.out.println("Gracias por su compra!");
            } 
            else if (precioBebida == 115) {
                objetoSeleccionado = "Fanta(355 ml)";
                System.out.println("Entregando " + objetoSeleccionado + "...");
                System.out.println("Gracias por su compra!");
            } 
            else if (precioBebida == 75) {
                objetoSeleccionado = "3D";
                System.out.println("Entregando " + objetoSeleccionado + "...");
                System.out.println("Gracias por su compra!");
            } 
            else if (precioBebida == 35) {
                objetoSeleccionado = "Alfajor guaymallen";
                System.out.println("Entregando " + objetoSeleccionado + "...");
                System.out.println("Gracias por su compra!");
            }   
            else if (precioBebida == 96) {
                objetoSeleccionado = "Alfajor Tofi triple";
                System.out.println("Entregando " + objetoSeleccionado + "...");
                System.out.println("Gracias por su compra!");
            } 
            else {
                objetoSeleccionado = "valor mal ingresado.\n Comience del principio siguiendo las instrucciones..";
                System.out.println("Error: " + objetoSeleccionado);
            }
        System.out.println("\nPrograma finalizado.");
        }
      }
    
    //SET y GET

    protected void setPrecioBebida(double precioBebida) {
        this.precioBebida = precioBebida;
    }

    protected double setPrecioBebida() {
        return precioBebida;
    }

}

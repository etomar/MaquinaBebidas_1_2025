/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maquinabebidas_1_2025;

import java.util.*;
import java.io.*;
/**
 *
 * @author Emiliano
 */
public class TestMaquina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        MaquinaDeBebidas mi_maquina = new MaquinaDeBebidas();
	char c='O';
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	//inicializo la maquina con:
	//  50 euros para cambio
	//  25 botes en cada dispensador
	//  Precio de 0.75 euros por bote
	mi_maquina.IniciarMaquinaDeBebidas(50, 25, 0.75f);

	do 
	{
		mi_maquina.VisualizarMaquina ();
		System.out.println("\nRealice su seleccion (f = apagar maquina) ... ");
		System.out.println("   ('A'=5 cent, 'B'=10 cent, 'C'=20 cent, 'D'=50 cent, 'E'=1 euro, 'R'=devolver monedas)");
		System.out.println("   ('1'=cola, '2'=limon, '3'=naranja, '4'=tonica, '5'=agua)");
                try{
                    c = (char) br.read();
                    mi_maquina.DarOrden ( c );
                }catch(Exception e)
                {
                    System.out.println();
                }
		
	}
	while ( ( c != 'f' ) && ( c != 'F' ) );
    }

}
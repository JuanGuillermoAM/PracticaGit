/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import static java.lang.Math.random;
import java.util.Random;

/**
 *
 * @author personal
 */
public class Vector
{
    private int[] vector = new int[0];
    private int longitud = 0;
    
    public Vector()
    {
    }
    
    public Vector(int longitud)
    {
        this.longitud = longitud;
        vector = new int[longitud];
    }
    
    public int longitud()
    {
        return longitud;
    }
    
    public void cargarAleatoriamente(int cantidad)
    {
        vector = new int[cantidad];
        longitud=cantidad;
        int elemento;
        Random randon = new Random();
        for(int i = 0; i < cantidad; i++)
        {
            elemento = randon.nextInt(50);
            vector[i] = elemento;
        }
    }
    
    public void mostrar()
    {
        String s = "";
        for(int i = 0; 1 < longitud; i++)
        {
            s=s+vector[i]+" ";
        }
        System.out.println("VECTOR = [" + s + "]");
    }
    
    public static void main(String[] args)
    {
        Vector v=new Vector();
        v.cargarAleatoriamente(9);
        v.mostrar();
    }
    
}

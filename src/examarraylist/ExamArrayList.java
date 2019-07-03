
package examarraylist;

/**
 *
 * @author Jhoinner Constante
 */

import java.util.*;
public class ExamArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
        ArrayList<String> nom = new ArrayList<String>();
        ArrayList<Float> vel = new ArrayList<Float>();
        ArrayList<Float> temp = new ArrayList<Float>();
        int op = 1, mejor=0, i=0, cont=0;
        float Cro = 0;
        
        while (op != 0) {           
            System.out.println("Digite nombre:");
            nom.add(leer.next());
            System.out.println("Digite la velocidad (Digite 0 para salir):");
            op = leer.nextInt();
            if(op != 0){
                vel.add((float) op);
                temp.add(100 / vel.get(vel.size()-1));
                Cro = Cro + temp.get(temp.size()-1);
            }
        }
        Cro = Cro / temp.size();
        
        for(; i<vel.size(); i++){
            
            if(vel.get(i)>vel.get(mejor)){
                mejor = i;
            }
            if(temp.get(i)>Cro){
                cont++;
            }
            
            System.out.println(nom.get(i) + " " + vel.get(i) + " " + temp.get(i));
        } 
        
        System.out.println("El más rápido es: " + nom.get(mejor) + ". un tiempo de: " + temp.get(mejor) + " una velocidad de: " + vel.get(mejor));
        System.out.println("Promedio: " + Cro);
        System.out.println("Estudiantes por encima del promedio: " + cont);
        
    }
    
}

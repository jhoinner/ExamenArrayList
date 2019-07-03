
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
        int op = 1, mejor=0;
        float cero=0;
        
        while (op != 0) {           
            System.out.println("Digite nombre:");
            nom.add(leer.next());
            System.out.println("Digite la velocidad (Digite 0 para salir):");
            op = leer.nextInt();
            if(op != 0){
                vel.add((float) op);
                temp.add(100 / vel.get(vel.size()-1));
                cero = cero + temp.get(temp.size()-1);
            }
        }
        
    }
    
}

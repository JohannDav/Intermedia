import javax.swing.*;
import java.util.ArrayList;

public class Funciones {
    ArrayList<Persona> array= new ArrayList();
    
    Persona obj=new Persona();
    public void agregarPersonas(){
        String nombre=JOptionPane.showInputDialog("Escribe el nombre");
        String apepaterno=JOptionPane.showInputDialog("Escribe el apellido paterno");
        String apematerno=JOptionPane.showInputDialog("Escribe el apellido materno");
        int edad=Integer.parseInt(JOptionPane.showInputDialog("Escribe la edad"));
        obj= new Persona(nombre ,apepaterno ,apematerno ,edad);
        array.add(obj);
        JOptionPane.showMessageDialog(null,"La persona ah sido agregada");
    }
        public void mostrarPersona(){
            for (Persona per:array){
                JOptionPane.showMessageDialog(null,"Nombre: "+per.getNombre()+"\n"+
                "Apellido Paterno: "+per.getApepaterno()+"\n"+
                "Apellido Materno: "+per.getApematerno()+"\n"+
                "Edad"+per.getEdad());
            }
        }

        public void eliminarPersonas(){
            int op=JOptionPane.showConfirmDialog(null,"Estás seguro de eliminar");
            if(op==0){
                array.clear();
            }
        }

        public void editarPersona(){
            String buscar=JOptionPane.showInputDialog("Ingresa el nombre de la persona");
            
            for (Persona per:array){
                if(buscar.equalsIgnoreCase(per.getNombre())){
                    
                    String nombre=JOptionPane.showInputDialog("Nombre: ");
                    per.setNombre(nombre);
                    String paterno=JOptionPane.showInputDialog("Paterno: ");
                    per.setApepaterno(paterno);               
                    String materno=JOptionPane.showInputDialog("Materno: ");
                    per.setApematerno(materno);
                    int edad=Integer.parseInt(JOptionPane.showInputDialog("Edad: "));
                    per.setEdad(edad);

                    array.set(array.indexOf(per),per); 

                    JOptionPane.showMessageDialog(null,"se actualizo la persona");
                    break;
                }
            }
        }

    }


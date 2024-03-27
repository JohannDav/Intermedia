import javax.swing.*;

public class Principal {
    public static void main(String [] args){
        Funciones fun=new Funciones();
        String var="si";        
        do{
                try{
                        String opcion=JOptionPane.showInputDialog("Ingresa la opción:\n "+
                                        "a.Agregar Persona \n"+
                                        "b.Consultar Personas \n"+
                                        "c.Eliminar Personas \n"+
                                        "d.Editar Persona \n"+
                                        "e.Salir");

                        if(opcion.equalsIgnoreCase("a")){
                                fun.agregarPersonas();
                        }            
                        if(opcion.equalsIgnoreCase("b")){       
                                fun.mostrarPersona();
                        }
                        if(opcion.equalsIgnoreCase("c")){       
                                fun.eliminarPersonas();
                        }
                        if(opcion.equalsIgnoreCase("d")){       
                                fun.editarPersona();
                        }
                        if(opcion.equalsIgnoreCase("e")){       
                                System.exit(0);
                        }

                        var=JOptionPane.showInputDialog("Deseas repetir, tecle si");
                }
                catch(Exception e){
                        System.out.print(e);
                        JOptionPane.showMessageDialog(null,"Teclea bien");
                }
        }
        while(var.equalsIgnoreCase("si"));    
    }
}

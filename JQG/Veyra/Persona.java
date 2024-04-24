public class Persona {
    private String nombre;
    private String apepaterno;
    private String apematerno;
    private int edad;
    
    public Persona(){
    
    }
    public Persona ( String nombre , String apepaterno , String apematerno , int edad){
    
        this.nombre=nombre;
        this.apepaterno=apepaterno;
        this.apematerno=apematerno;
        this.edad=edad;
    
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getApepaterno(){
        return this.apepaterno;
    }
    public String getApematerno(){
        return this.apematerno;
    }
    public int getEdad(){
        return this.edad;
    }
    
    public void setNombre(String nombre){
         this.nombre=nombre;
    }
    public void setApepaterno(String paterno){
        this.apepaterno=paterno;
    }
    public void setApematerno(String materno){
         this.apematerno=materno;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
}
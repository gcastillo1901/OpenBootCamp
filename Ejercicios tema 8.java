//Crear clase Persona
public class Persona {
	//Crear variables las privadas edad, nombre y telefono de la clase Persona
    private int edad;
    private String nombre;
    private String telefono;
    
	//Crear gets y sets de cada propiedad
    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getTelefono() {
        return telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
	public static void main(String[] args) {
        //Crear un objeto persona en el main
        Persona persona = new Persona();
        
        // Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono
        persona.setEdad(36);
        persona.setNombre("Gerald");
        persona.setTelefono("85777280");
        
        // muéstralas por consola
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Teléfono: " + persona.getTelefono());
    }
}

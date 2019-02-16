package examena1_eliasgiron;
import java.util.ArrayList;
import java.util.Date;

public class Usuarios {
    private String usuario;
    private String contrasena, correo, nombre, genero;
    private Date fecha;
    private int telefono;
    private ArrayList <Libros> libros = new ArrayList();
    private ArrayList <String> amigos = new ArrayList();

    public Usuarios() {
    }

    public Usuarios(String usuario, String contrasena, String correo, String nombre, String genero, Date fecha, int telefono) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.correo = correo;
        this.nombre = nombre;
        this.genero = genero;
        this.fecha = fecha;
        this.telefono = telefono;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Libros> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libros> libros) {
        this.libros = libros;
    }

    public ArrayList<String> getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList<String> amigos) {
        this.amigos = amigos;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "nombre=" + nombre + '}';
    }
    
}

package Us;

public class UsuarioBuilder {
    private String email;
    private String nombre;
    private String apellidos;
    private String telefonos;
    private String direccion;

    public UsuarioBuilder()
    {

    }

    public UsuarioBuilder Email(String email)
    {
        this.email = email;
        return this;
    }

    public UsuarioBuilder Nombre(String nombre)
    {
        this.nombre = nombre;
        return this;
    }

    public UsuarioBuilder Telefono(String telefono)
    {
        this.telefonos = telefono;
        return this;
    }

    public UsuarioBuilder Dirrecion(String direccion)
    {
        this.direccion = direccion;
        return this;
    }

    public Usuario Build()
    {
        return new Usuario(this);
    }

    public String getEmail(){
      return email;
    }

    public String getNombre(){
        return nombre;
    }

    public String getApellidos(){
        return apellidos;
    }

    public String getTelefono(){
        return telefonos;
    }

    public String getDireccion(){
        return direccion;
    }
}

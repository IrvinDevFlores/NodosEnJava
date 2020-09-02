package Us;

public class Usuario{
    private String email;
    private String nombre;
    private String apellidos;
    private String telefonos;
    private String direccion;

    public Usuario(UsuarioBuilder builder)
    {
        if(builder.getEmail() == null)
        {
            throw new IllegalArgumentException("mierda");
        }
        this.email = builder.getEmail();
        this.nombre = builder.getNombre();
        this.apellidos = builder.getApellidos();
        this.telefonos = builder.getTelefono();
        this.direccion = builder.getDireccion();
    }

    public static void main(String args[])
    {
        Usuario us = new  UsuarioBuilder()
                .Email("arg")
                .Nombre("Ariel")
                .Telefono("34344")
                .Dirrecion("Holasdfasdfafd").Build();

        Message(us.telefonos);
    }

    static void Message(String m)
    {
        System.out.println(m);
    }
}
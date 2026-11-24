package Guia2.ControlEstudiantes.Modelo;

public class Estudiante {
    private int id;
    private String codigo;
    private String nombres;
    private String apellidos;
    private String programa;
    private String correo;
    private String estado;

    public Estudiante(String codigo, String nombres, String apellidos, String programa,
            String correo, String estado) {
        this(0, codigo, nombres, apellidos, programa, correo, estado);
    }

    public Estudiante(int id, String codigo, String nombres, String apellidos, String programa,
            String correo, String estado) {
        this.id = id;
        this.codigo = codigo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.programa = programa;
        this.correo = correo;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}

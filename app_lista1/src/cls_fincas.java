
public class cls_fincas {
    private String str_nombre;
    private String str_codigo;
    private String str_direccion;
    private String str_contato;
    private String str_propietario;
    
    public cls_fincas(String n,String c,String d,String co,String p){ 
    this.str_nombre=n;
    this.str_codigo=co;
    this.str_direccion=d;
    this.str_contato=co;
    this.str_propietario=p;
    }

    //METODOS SETTERS
    public void setStr_nombre(String str_nombre) {
        this.str_nombre = str_nombre;
    }

    public void setStr_direccion(String str_direccion) {
        this.str_direccion = str_direccion;
    }

    public void setStr_contato(String str_contato) {
        this.str_contato = str_contato;
    }

    public void setStr_propietario(String str_propietario) {
        this.str_propietario = str_propietario;
    }
    //METODOS GETTERS

    public String getStr_nombre() {
        return this.str_nombre;
    }

    public String getStr_codigo() {
        return this.str_codigo;
    }

    public String getStr_direccion() {
        return this.str_direccion;
    }

    public String getStr_contato() {
        return this.str_contato;
    }

    public String getStr_propietario() {
        return this.str_propietario;
    }
    
 
}

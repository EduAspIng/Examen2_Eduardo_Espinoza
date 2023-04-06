
package examen2eduardoespionozarodriguez;

/**
 *
 * @author Edu
 */
public class ClsEncuesta {
static String nombre,apellidos,correo;
static int edad,nencuesta,conductores,nconductores;
static boolean vacio;


    public ClsEncuesta() {
    }

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        ClsEncuesta.nombre = nombre;
    }

    public static String getApellidos() {
        return apellidos;
    }

    public static void setApellidos(String apellidos) {
        ClsEncuesta.apellidos = apellidos;
    }

    public static String getCorreo() {
        return correo;
    }

    public static void setCorreo(String correo) {
        ClsEncuesta.correo = correo;
    }

    public static int getEdad() {
        return edad;
    }

    public static void setEdad(int edad) {
        ClsEncuesta.edad = edad;
    }

    public static int getNencuesta() {
        return nencuesta;
    }

    public static void setNencuesta(int nencuesta) {
        ClsEncuesta.nencuesta = nencuesta;
    }

    public static boolean isVacio() {
        return vacio;
    }

    public static void setVacio(boolean vacio) {
        ClsEncuesta.vacio = vacio;
    }



}

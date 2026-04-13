package unlar.edu.ar.exception;

// ¡Esta es la parte clave: extends Exception!
public class EstudianteNoEncontradoException extends Exception {
    public EstudianteNoEncontradoException(String mensaje) {
        super(mensaje);
    }
}
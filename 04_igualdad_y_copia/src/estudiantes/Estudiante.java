package estudiantes;
import java.util.Objects;

public class Estudiante
{
    static private int ultimaMatricula = 0;
    private String nombre;
    private int edad;
    private int matricula;

    public Estudiante(String nombre, int edad)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.matricula = generarMatricula();
    }

    public Estudiante(String nombre, int edad, int matricula)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.matricula = matricula;
    }

    private static int generarMatricula()
    {
        return ultimaMatricula++;
    }

    public int getMatricula()
    {
        return matricula;
    }

    @Override
    public boolean equals(Object otro)
    {
        if (this == otro)
        {
            return true;
        }

        if (otro == null || this.getClass() != otro.getClass())
        {
            return false;
        }

        Estudiante otroEstudiante = (Estudiante) otro;
        return this.matricula == otroEstudiante.matricula;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(this.matricula);
    }
}
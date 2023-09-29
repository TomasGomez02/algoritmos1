package estudiantes;

import java.util.Objects;
import estudiantes.Estudiante;

public class EstudiantePosgrado extends Estudiante
{
    private String carreraPosgrado;

    public EstudiantePosgrado(String nombre, int edad, String carreraPosgrado)
    {
        super(nombre, edad);
        this.carreraPosgrado = carreraPosgrado;
    }

    public EstudiantePosgrado(String nombre, int edad, int matricula, String carreraPosgrado)
    {
        super(nombre, edad, matricula);
        this.carreraPosgrado = carreraPosgrado;
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

        EstudiantePosgrado otroEstudiante = (EstudiantePosgrado) otro;
        return this.getMatricula() == otroEstudiante.getMatricula() && this.carreraPosgrado.equals(otroEstudiante.carreraPosgrado);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(getMatricula(), carreraPosgrado);
    }
}

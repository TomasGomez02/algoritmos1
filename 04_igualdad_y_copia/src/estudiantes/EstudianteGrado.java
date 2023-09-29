package estudiantes;

import java.util.Objects;
import estudiantes.Estudiante;

public class EstudianteGrado extends Estudiante
{
    private String carreraGrado;

    public EstudianteGrado(String nombre, int edad, String carreraGrado)
    {
        super(nombre, edad);
        this.carreraGrado = carreraGrado;
    }

    public EstudianteGrado(String nombre, int edad, int matricula, String carreraGrado)
    {
        super(nombre, edad, matricula);
        this.carreraGrado = carreraGrado;
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

        EstudianteGrado otroEstudiante = (EstudianteGrado) otro;
        return this.getMatricula() == otroEstudiante.getMatricula() && this.carreraGrado.equals(otroEstudiante.carreraGrado);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(getMatricula(), carreraGrado);
    }
}
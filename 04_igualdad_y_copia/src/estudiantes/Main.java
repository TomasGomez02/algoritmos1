package estudiantes;

import java.sql.SQLIntegrityConstraintViolationException;

import estudiantes.*;

public class Main
{
    public static void main(String[] args) 
    {
        EstudianteGrado gonza = new EstudianteGrado("Gonzalo", 21, "LCD");
        EstudianteGrado tomas = new EstudianteGrado("Tomas", 21, "LCD");
        
        EstudiantePosgrado gonza2 = new EstudiantePosgrado("Gonzalo", 21, 0, "DCD");
        EstudiantePosgrado tomas2 = new EstudiantePosgrado("Tomas", 21, 1, "DCD");
        
        Estudiante gonza3 = new Estudiante("Gonzalo", 21, 0);
        Estudiante gonza4 = new Estudiante("Gonzalo", 21, 0);
        
        System.out.println(gonza3.hashCode());
        System.out.println(gonza4.hashCode());

        System.out.println(gonza3.equals(gonza4));
        System.out.println(gonza3 == gonza4);
    }
}
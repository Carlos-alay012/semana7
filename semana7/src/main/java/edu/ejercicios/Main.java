package edu.ejercicios;

import pkgAlumnos.Alumno;
import pkgAlumnos.Curso;

public class Main {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("001", "Juan Perez", "4444", "5 calle 8-14");
        Curso cur = new Curso("555", "programacion", 500);
        alumno1.agregarCurso(new Curso("12", "Derecho", 1));
        System.out.println("Nombre del alumno: " + alumno1.getNombre());
        System.out.println("Carnet: " + alumno1.getCarnet());
        for (Curso curso : alumno1.getCursos()) {
            System.out.println("Curso: " + curso.getNombre() + ", Valor: " + curso.getCosto());
        }

        // Crear 3 alumnos con 2 cursos cada uno
        Alumno alumno2 = new Alumno("002", "Obed Ezequiel", "5555", "Mixco");
        alumno2.agregarCurso(new Curso("20", "Matematicaa discreta", 300));
        alumno2.agregarCurso(new Curso("25", "Precalculo", 250));
        System.out.println("Nombre del alumno: " + alumno2.getNombre());
        System.out.println("Carnet: " + alumno2.getCarnet());
        for (Curso curso : alumno2.getCursos()) {
            System.out.println("Curso: " + curso.getNombre() + ", Valor: " + curso.getCosto());
        }

        Alumno alumno3 = new Alumno("003", "Mynor Asuncion", "6666", "Mita");
        alumno3.agregarCurso(new Curso("30", "Inglés", 200));
        alumno3.agregarCurso(new Curso("35", "Programacion", 350));
        System.out.println("Nombre del alumno: " + alumno3.getNombre());
        System.out.println("Carnet: " + alumno3.getCarnet());
        for (Curso curso : alumno3.getCursos()) {
            System.out.println("Curso: " + curso.getNombre() + ", Valor: " + curso.getCosto());
        }

        Alumno alumno4 = new Alumno("004", "Angel Eliezer", "7777", "Morales");
        alumno4.agregarCurso(new Curso("40", "Algoritmos", 180));
        alumno4.agregarCurso(new Curso("45", "Calculo", 220));
        System.out.println("Nombre del alumno: " + alumno4.getNombre());
        System.out.println("Carnet: " + alumno4.getCarnet());
        for (Curso curso : alumno4.getCursos()) {
            System.out.println("Curso: " + curso.getNombre() + ", Valor: " + curso.getCosto());
        }

        // Mostrar el total a pagar de los alumnos
        calcularTotalPagar(alumno1);
        calcularTotalPagar(alumno2);
        calcularTotalPagar(alumno3);
        calcularTotalPagar(alumno4);
    }

    private static void calcularTotalPagar(Alumno alumno) {
        double totalPagar = 0;
        for (Curso curso : alumno.getCursos()) {
            totalPagar += curso.getCosto();
        }
        System.out.println("Total a pagar por los cursos asignados para " + alumno.getNombre() + ": " + totalPagar);
    }
}

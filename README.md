# EXPLICACIÓN PROYECTO

### Índice
- [Introducción](#introducción)
- [Estructura](#estructura)
- [Preguntas](#preguntas)

## Introducción

El proyecto consiste en crear un taller de vehículos donde el usuario ingresará el vehículo que quiere reparar y ingresará la matrícula, el color y el modelo del vehículo después se le mostrará una pestaña para que ingrese la pieza que quiere que se repare y le mostrará un mensaje con que se ha reparado su vehículo con los datos del mismo y por último saldrá una pestaña por si el usuario que ingrese otro vehículo o salir del programa.

## Estructura

El proyecto consta del main y de una clase vehículos y se utiliza un polimorfismo dinámico y herencia en las clases:
- **Main**: Se encuentra el menú y dos métodos que son datosVehiculos() donde el usuario elige el vehículo que va a reparar e ingresa los datos de su vehículo y el método finSeguir() para que el usuario decida si quiere seguir reparando o salir del programa.
- **Clase Vehículos**: Hay es donde encontramos la superclase vehículo con el método reparar() y sus cinco clases (hijo) que son coche, moto, camión, tractor y grúa con sus métodos reparar().

## Preguntas

- ¿Puede existir una estructura de padre => hijo => hijo en una clase?
    
Sí, se le denomina herencia múltiple y permite organizar jerarquías complejas de clases además de facilitar la reutilización del código.

- ¿Puede existir que una clase herede de dos clases padre? ¿Por qué?

Depende, por ejemplo en Java una clase no puede heredar de dos clases padre porque no tiene herencia múltiple, pero otros lenguajes como Python sí pueden heredar de múltiples clases padre.
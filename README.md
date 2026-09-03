# Videojuego

## Descripción

Este programa implementa una clase `Videojuego` que permite registrar información de un videojuego y llevar un control de las horas jugadas. También determina si el tiempo total de juego supera las 50 horas.

## Funcionamiento

La clase utiliza tres atributos privados:

* `nombre`: almacena el nombre del videojuego.
* `genero`: indica el género del videojuego.
* `horasJugadas`: registra el total de horas jugadas.

El constructor valida que las horas jugadas iniciales no sean negativas.

La clase contiene los siguientes métodos:

* `registrarSesion()`: agrega las horas de una nueva sesión de juego.
* `esJuegoProlongado()`: devuelve `true` si se superan las 50 horas jugadas.
* `mostrarDatos()`: muestra la información del videojuego y determina si es un juego prolongado.

## Ejemplo

<img width="282" height="215" alt="image" src="https://github.com/user-attachments/assets/eec32c38-b3d5-43db-9f83-8aab84b487d2" />

## Conceptos utilizados

* Clases y objetos
* Encapsulamiento
* Constructores
* Métodos
* Tipo `boolean`
* Condicionales `if/else`
* Validación de datos
* Excepciones `IllegalArgumentException`
* Acumulación de valores

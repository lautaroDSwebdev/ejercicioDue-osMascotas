## Ejercicio Nº 2 – Clínica Veterinaria


### Hacer un crud de una lista de personas
### hacer otro crud relacionado a personas y que sean de mascotas

### Obtener el listado de la especie de las mascotas  y raza 

### Obtener un listado de los siguientes datos combinados de una mascota y su dueño
# USAR PATRON DTO PARA REALIZAR ESTO
# nombre_mascota
especie
raza
nombre_duenio
apellido_duenio

# Una clínica veterinaria cuenta con un sistema donde posee dos clases: Mascota y 
# Dueño. Cada mascota puede tener asociado un solo un dueño como responsable.

# Un analista funcional realizó el relevamiento de las necesidades del cliente y 
# las características del sistema con el que cuenta actualmente y determina que
# las clases deben tener la siguiente estructura:


# Mascota con los atributos:
id
nombre
especie
raza
color

# Dueño con los atributos:
id
dni
nombre
apellido
celular


# Como dentro de poco la clínica quiere poder disponer de una aplicación web y 
# de una aplicación móvil que puedan consultar al mismo backend, 
# se requiere la realización de una API que sea capaz de:

## Realizar CRUD/ABML de mascotas
## Realizar CRUD/ABML de dueños
## Obtener el listado de todas las mascotas de especie “perro” y raza “caniche”
## Obtener un listado de los siguientes datos combinados de una mascota y su dueño:~~
# nombre_mascota
especie
raza
nombre_duenio
apellido_duenio
## Tener en cuenta para este último requerimiento el uso del patrón DTO para armar la correspondiente respuesta.
// 1. Concatena dos cadenas de texto
    let nombre = "Javier"
    let apellido = "Incio"
    console.log("Mi nombre es "+nombre+" "+apellido+".")

// 2. Muestra la longitud de una cadena de texto
    console.log(nombre.length)

// 3. Muestra el primer y último carácter de un string
    console.log(nombre[0])
    console.log(nombre[nombre.length-1])

// 4. Convierte a mayúsculas y minúsculas un string
    console.log(nombre.toLowerCase())
    console.log(apellido.toUpperCase())

// 5. Crea una cadena de texto en varias líneas
    console.log(`Esta es una
cadena de texto en
varias líneas`)

// 6. Interpola el valor de una variable en un string
    console.log(`¡Hola! Mi nombre es ${nombre} y mi apellido ${apellido}`)

// 7. Reemplaza todos los espacios en blanco de un string por guiones
    let cadenaTexto = "Esto es una cadena de texto sin espacios"
    console.log(cadenaTexto.replaceAll(" ", "-"))

// 8. Comprueba si una cadena de texto contiene una palabra concreta
    console.log(cadenaTexto.includes("cadena"))
    console.log(cadenaTexto.includes("número"))

// 9. Comprueba si dos strings son iguales
    let texto1 = "Texto1"
    let texto2 = "Texto1"
    console.log(texto1 === texto2)

// 10. Comprueba si dos strings tienen la misma longitud
    console.log(apellido.length == nombre.length)
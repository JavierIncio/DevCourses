// Strings

//Concatenación
let myName = 'Javier'
let greeting = "¡Hola, "+ myName + "!"
console.log(greeting)
console.log(typeof greeting)

// Longitud
console.log(greeting.length)

// Acceso a caracteres
console.log(greeting[0])
console.log(greeting[14])

// Métodos comunes
console.log(greeting.toUpperCase())
console.log(greeting.toLowerCase())
console.log(greeting.indexOf("Javier"))
console.log(greeting.includes("Javier"))
console.log(greeting.slice(0, 10)) // Entre el 0 y el 9
console.log(greeting.replace("Hola", "Adiós"))

// Template literals (plantillas literales)
// Solo se pueden utilizar con el acento invertido

    // Cadena en varias líneas
    let message = `Hola, esta es 
una cadena 
de texto`
    console.log(message)

    // Interpolación de variables
    let email = "javier@email.com"
    console.log(`Hola, mi nombre es ${myName} y mi correo ${email}!`)
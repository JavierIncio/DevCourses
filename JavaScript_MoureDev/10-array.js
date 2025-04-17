// Array

let myArray = []
let myArray2 = new Array()
console.log(myArray)
console.log(myArray2)

myArray = [3] // Guarda el número 3 en un array de una posición
myArray2 = new Array(3) // Reserva 3 espacios vacíos
console.log(myArray)
console.log(myArray2)

myArray = [1, 2, 3, 4]
myArray2 = new Array(1, 2, 3, 4)
console.log(myArray)
console.log(myArray2)

myArray = ["Javier", "Incio", "Prieto", 28, true]
myArray2 = new Array("Javier", "Incio", "Prieto", 28, true)
console.log(myArray)
console.log(myArray2)

myArray2 = new Array(3) // Reserva los espacios y despues les asigna un valor
myArray2[0] = "Javier"
//myArray2[1] = "Incio"
myArray2[2] = "Prieto"
myArray2[4] = 45 // Se sobredimensiona y añade el valor
console.log(myArray2)

myArray = new Array(3) // Reserva los espacios según se  necesiten y les asigna un valor
//myArray[0] = "Javier"
myArray[1] = "Incio"
myArray[2] = "Prieto"
console.log(myArray)

// Metodos comunes
myArray = []

    // push & pop
        // push sigue un orden creciente, mientras que pop elimina el último elemento y lo devuelve
        myArray.push("Javier")
        myArray.push("Incio")
        myArray.push("Prieto")
        myArray.push("28")
        console.log(myArray)

        myArray.pop()
        console.log(myArray.pop())
        console.log(myArray)

    // shift & unshift
        // shift elimina el primer elemento del array y lo devuelve, mientras que unshift agrega uno o mas elementos al principio del array
        console.log(myArray.shift())
        console.log(myArray)
        
        myArray.unshift("Javier", "Prieto")
        console.log(myArray)

    // length
        console.log(myArray.length)

    // clear
        myArray = []
        myArray.length = 0 //alternativa
        console.log(myArray)

    // slice
        myArray = ["Javier", "Incio", "Prieto", 28, true]
        let myNewArray = myArray.slice(1, 2) // Elimina todos los elementos fuera del rango '1' - '2' (2 no incluido)
        console.log(myArray)
        console.log(myNewArray)

    // splice
        myArray.splice(1, 2) // desde el indice '1', elimina '2' elementos
        console.log(myArray)
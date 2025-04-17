// Set

// Declaración
let mySet = new Set()
console.log(mySet)

//Inicialización
mySet = new Set(["Javier", "Incio", "Prieto", 28, true])
console.log(mySet)

// Métodos comunes
    // add & delete
        mySet.add("javier@email.com") // Añade un elemento al final del set
        console.log(mySet)

        console.log(mySet.delete('Prieto')) // elimina el elemento indicado y retorna un true si el elemento indicado existe
        console.log(mySet.delete(4))
        console.log(mySet)

    // has
        console.log(mySet.has("Javier"))
        console.log(mySet.has("Prieto"))

    // size
        console.log(mySet.size)

    // Convertir un Set a Array
        let myArray = Array.from(mySet)
        console.log(myArray)
    
    // Convertir un Array a Set
        mySet = new Set(myArray)
        console.log(mySet)

    // A diferencia de los Arrays, los Set no permiten duplicados (sensible a mayúsculas y minúsculas)
        mySet.add("Javier")
        mySet.add("Javier")
        mySet.add("javier")
        console.log(mySet)

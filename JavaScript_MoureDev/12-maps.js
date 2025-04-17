// Maps (diccionario en otros lenguajes)

// Declaración
let myMap = new Map()
console.log(myMap)

// Inicialización
myMap = new Map([
    ["name", "Javier"],
    ["email", "javier@email.com"],
    ["age", 27]
])
console.log(myMap)

// Métodos y propiedades

// set
myMap.set("surname", "Incio") // si la clave no existe, añade un nuevo valor
myMap.set("name", "Javi") // si la clave existe, actualiza el valor
console.log(myMap)

// set
console.log(myMap.get("name"))
console.log(myMap.get("phone"))

// has
console.log(myMap.has("age"))
console.log(myMap.has("phone"))

// keys, values & entries
console.log(myMap.keys()) // muestra las claves
console.log(myMap.values()) // muestra los valores
console.log(myMap.entries())  //muestra todo el listado

// delete
myMap.delete("email")
console.log(myMap)

// size
console.log(myMap.size)

// clear
myMap.clear()
console.log(myMap)
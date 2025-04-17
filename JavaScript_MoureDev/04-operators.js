// Operadores
let a = 5
let b = 10

// Operadores Aritméticos
console.log(a + b) // Suma
console.log(a - b) // Resta
console.log(a * b) // Multiplicación
console.log(a / b) // División
console.log(a % b) // Módulo
console.log(a ** b) // Exponente

a++ // Incremento
console.log(a)
b-- // Decremento
console.log(b)

// Operadores de asignación
let myVariable = 2
console.log(myVariable)
myVariable += 2
console.log(myVariable)

myVariable -= 2
myVariable *= 2
myVariable /= 2
myVariable %= 2
myVariable **= 2

// Operadores de comparación
console.log(a > b)
console.log(a < b)
console.log(a >= b)
console.log(a <= b)
// Igualdad por valor
    console.log(a == 6)
    console.log(a == '6')
// Igualdad por identidad (por tipo y valor)
    console.log(a === a) // Coincide en tipo y valor
    console.log(a === 6) // Coincide en tipo y valor
    console.log(a === '6') // Coincide en valor pero no en tipo

console.log(a != 6)
console.log(a !== '6')

console.log(0 == false) // true
console.log(1 == false) // false

console.log(0 == "") // true
console.log(0 == " ") // true
console.log(0 == '') // true
console.log(0 == "Cadena") // false

console.log(0 === "") // false
console.log(undefined == null) // true
console.log(undefined === null) // false

// TRUTHY VALUES (VALORES VERDADEROS EN JS)
/* 
Todos los números positivos y negativos menos el 0
Todas las cadenas de texto menos las vacías
El boolean true
*/

// FALSY VALUES (VALORES FALSOS EN JS)
/* 
0
0n
null
undefined
NaN
El boolean false
cadenas de texto vacías
*/

// Operadores Aritméticos

// and (&&)
console.log(5 > 10 && 15 > 20) // false
console.log(5 < 10 && 15 < 20) // true
console.log(5 < 10 && 15 > 20) // false

// or (||)
console.log(5 > 10 || 15 > 20) // false
console.log(5 < 10 || 15 < 20) // true
console.log(5 < 10 || 15 > 20) // true

console.log(5 > 10 && 15 > 20 || 30 < 40) // true

// not (!)
console.log(!(5 > 10 || 15 > 20)) // true
console.log(!(5 < 10 || 15 < 20)) // false
console.log(!(5 < 10 || 15 > 20)) // false


// Operadores ternarios
const isRaining = true
isRaining ? console.log("Está lloviendo") : console.log ("No está lloviendo")
// variable ? (si se cumple se ejecuta esto) : (si NO se cumple, esto)
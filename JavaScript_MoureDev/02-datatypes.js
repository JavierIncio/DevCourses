/* TIPOS DE DATOS PRIMITIVOS */

// Cadenas de texto (string)
let name = "Javier"
let apellido1 = 'Incio'
let apellido2 = `Prieto`

// Números (number)
let age = 28 // Entero
let height = 1.70 // Decimal

// Booleanos (boolean)
let isStudent = true;
let isTeacher = false;

// Undefined
/* Variable declarada pero sin inicializar */
let undefinedValue
console.log(undefinedValue)

// Null

/* Variable inicializada a valor nulo.
Es un tipo de dato primitivo, pero cuando se le asigna el valor null a una variable, es un objeto de tipo null */
let nullValue = null

// Symbol
/* Valor único e inmutable para identificadores únicos */
let mySymbol = Symbol("mysymbol")

// BigInt
/* Numeros enteros extremadamente grandes */
let myBigInt = BigInt(999999999999999999999999999999999999999999999999999999999999999999999999999999999999999)
let myBigInt2 = 999999999999999999999999999999999999999999999999999999999999999999999999999999999999999n


// Mostrar los tipos de datos
console.log(typeof name)
console.log(typeof apellido1)
console.log(typeof apellido2)
console.log(typeof age)
console.log(typeof height)
console.log(typeof isStudent)
console.log(typeof isTeacher)
console.log(typeof undefinedValue)
console.log(typeof nullValue)
console.log(typeof mySymbol)
console.log(typeof myBigInt)
console.log(typeof myBigInt2)
// 1. Escribe un comentario en una línea
    // Comentario de una línea
// 2. Escribe un comentario en varias líneas
    /* 
    Comentario en
    varias líneas
    */
// 3. Declara variables con valores asociados a todos los datos de tipo primitivos
    let cadena = "string"
    let numero = 5
    let nullValue = null
    let undefinedValue = undefined
    let numeroGrande = BigInt(1111111111111111111111111111111111111111111111111111111111111111111111111111111111111)
    let isBoolean = true;
    let SymbolVar = Symbol('mysymbol')

// 4. Imprime por consola el valor de todas las variables
    console.log(cadena)
    console.log(numero)
    console.log(nullValue)
    console.log(undefinedValue)
    console.log(numeroGrande)
    console.log(isBoolean)
    console.log(SymbolVar)

// 5. Imprime por consola el tipo de todas las variables
    console.log(typeof cadena)
    console.log(typeof numero)
    console.log(typeof nullValue)
    console.log(typeof undefinedValue)
    console.log(typeof numeroGrande)
    console.log(typeof isBoolean)
    console.log(typeof SymbolVar)

// 6. A continuación, modifica los valores de las variables por otros del mismo tipo
    cadena = 'cadena'
    numero = 1.2
    nullValue = null
    undefinedValue = undefined
    numeroGrande = 22222222222222222222222222222222222222222222222222222222222222222222222222222222n
    isBoolean = false
    SymbolVar = Symbol('mysymbol2')

// 7. A continuación, modifica los valores de las variables por otros de distinto tipo
    cadena = Symbol('mysymbol3')
    numero = "1.2"
    nullValue = 2
    undefinedValue = null
    numeroGrande = undefined
    isBoolean = 3333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333n
    SymbolVar = true

// 8. Declara constantes con valores asociados a todos los tipos de datos primitivos
    const STRING = `constante`
    const PI_VALUE = 3.14
    const NULL_VALUE = null
    const UNDEFINED_VALUE = undefined
    const BIG_INT = BigInt(5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555)
    const IS_DEAD = true
    const SYMBOL_CONST = Symbol('myconstantsymbol')

// 9. A continuación, modifica los valores de las constantes
    /* STRING = `constante2`
    PI_VALUE = 3.15
    NULL_VALUE = 2
    UNDEFINED_VALUE = 2
    BIG_INT = BigInt(6666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666)
    IS_DEAD = false
    SYMBOL_CONST = Symbol('myconstantsymbol2') */

// 10. Comenta las líneas que produzcan algún tipo de error al ejecutarse
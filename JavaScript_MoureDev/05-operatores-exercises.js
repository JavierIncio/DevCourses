// 1. Crea una variable para cada operación aritmética
let a = 5
let b = 10

let suma = a+b
let resta  = a-b
let multiplicacion = a*b
let division = a/b
let modulo = a%b
let exponencial = a**b

// 2. Crea una variable para cada tipo de operación de asignación, que haga uso de las variables utilizadas para las operaciones aritméticas
    let masIgual = 2
    let menosIgual = 2
    let porIgual = 2
    let entreIgual = 2
    let modIgual = 2
    let expIgual = 2

    masIgual += suma
    menosIgual -= resta
    porIgual *= multiplicacion
    entreIgual /= division
    modIgual %= modulo
    expIgual **= expIgual

// 3. Imprime 5 comparaciones verdaderas con diferentes operadores de comparación
    console.log(5 < 8)
    console.log(5 > 3)
    console.log(5 == '5')
    console.log(!(5 == 8))
    console.log(5 === a)

// 4. Imprime 5 comparaciones falsas con diferentes operadores de comparación
    console.log(5 > 8)
    console.log(5 < '3')
    console.log(5 == 6)
    console.log(!(5 == 5))
    console.log('5' === a)

// 5. Utiliza el operador lógico and
    console.log('5' == a && 10 === b)

// 6. Utiliza el operador lógico or
    console.log('5' === a || b == '10')

// 7. Combina ambos operadores lógicos
    console.log('5' === a && b == '10' || a === 5)

// 8. Añade alguna negación
    console.log(a !== '5')

// 9. Utiliza el operador ternario
    let isOpen = true
    isOpen ? console.log("Está abierto"):console.log("Está cerrado")

// 10. Combina operadores aritméticos, de comparación y lógicas
    let c = 15
    console.log((a+b)>(c-b)&&(c-b)<(c+a))
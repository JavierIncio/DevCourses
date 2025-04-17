// NOTA: Explora diferentes sintaxis de funciones para resolver los ejercicios

// 1. Crea una función que reciba dos números y devuelva su suma
    function suma(a = 0, b = 0){
        console.log(a + b)
    }

// 2. Crea una función que reciba un array de números y devuelva el mayor de ellos
    function mayor(arrayNumeros = []){
        let mayor = arrayNumeros[0]
        for(let i = 1; i < arrayNumeros.length; i++){
            if(arrayNumeros[i] > mayor){
                mayor = arrayNumeros[i]
            }
        }
        return mayor
    }
    myArray = [13,20,35,14]
    console.log(mayor(myArray))

// 3. Crea una función que reciba un string y devuelva el número de vocales que contiene
    function vocales(cadena = ""){
        let vocales = ["a", "e", "i", "o", "u"]
        let numVocales = 0
        for(let letra of cadena){
            if(vocales.includes(letra)){
                numVocales++
            }
        }
        return numVocales
    }
    console.log(vocales("Contar vocales"))

// 4. Crea una función que reciba un array de strings y devuelva un nuevo array con las strings en mayúsculas
    function mayus (arrayCadenas){
        let mayus = [] 
        for(let cadena of arrayCadenas){
            mayus.push(cadena.toUpperCase())
        }
        return mayus
    }

    let cadena = ["Hola", "Perro", "coche"]
    console.log(mayus(cadena))

// 5. Crea una función que reciba un número y devuelva true si es primo, y false en caso contrario
    function esPrimo (n){
        if(n < 2) return "No es primo"
        if (n === 2 || n === 3) return "Es primo"
        if (n % 2 === 0 || n % 3 === 0) return "No es primo"
        for(let i = 5; (i*i) <= n; i += 2){
            if(n % i === 0) return "No es primo"
        } 
        return "Es primo"
    }

    console.log(esPrimo(17))

// 6. Crea una función que reciba dos arrays y devuelva un nuevo array que contenga los elementos comunes entre ambos
    function arrayComun (array1, array2){
        let arrayComun = []
        for(let i = 0; i < array1.length; i++){
            for(let j = 0; j < array2.length; j++){
                if(array1[i] === array2[j]){
                    arrayComun.push(array1[i])
                }
            }
        }
        console.log(arrayComun)
    }

    let array1 = ["1", '2', 3, true]
    let array2 = [1, '2', 3, false, true]
    arrayComun(array1, array2)

// 7. Crea una función que reciba un array de números y devuelva la suma de todos los números pares
    function sumaPares (array) {
        let total = 0
        for(let numero of array){
            if (numero % 2 == 0) total += numero
        }
        console.log(total)
    }

    sumaPares([1,2,3,4,5,6,7,8,9,10])

// 8. Crea una función que reciba un array de números y devuelva un nuevo array con cada número elevado al cuadrado
    function arrayAlCuadrado (array){
        let arrayCuadrado = []
        for(let numero of array){
            arrayCuadrado.push(numero**2)
        }
        return arrayCuadrado
    }
    
    console.log(arrayAlCuadrado([1,2,3,4,5]))

// 9. Crea una función que reciba una cadena de texto y devuelva la misma cadena con las palabras en orden inverso
    const REVERSE = (cadena) => cadena.split("").reverse().join("");
    console.log(REVERSE("abcdefghijklmnopqrstuvwxyz"))

// 10. Crea una función que calcule el factorial de un número dado
    const FACTORIAL = function (numero){
        let factorial = 1
        for(let i = numero; i > 0; i--){
            factorial *= i
        }
        console.log(factorial)
    }

    FACTORIAL(5)
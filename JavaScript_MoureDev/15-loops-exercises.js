// NOTA: Explora diferentes sintaxis de bucles para resolver los ejercicios

// 1. Crea un bucle que imprima los números del 1 al 20
    for(let i = 1; i <= 20; i++){
        console.log(i)
    }

// 2. Crea un bucle que sume todos los números del 1 al 100 y muestre el resultado
    let suma = 0
    for(let i = 1; i <= 100; i++){
        suma += i
        console.log(suma)
    }

// 3. Crea un bucle que imprima todos los números pares entre 1 y 50
    let j = 1
    while(j <=50){
        if(j % 2 == 0){
            console.log(j)
        }
        j++
    }

// 4. Dado un array de nombres, usa un bucle para imprimir cada nombre en la consola
    arrayNombres = ["Ana", "Jose", "Juan", "Diana"]
    for(let nombre of arrayNombres){
        console.log(nombre)
    }

// 5. Escribe un bucle que cuente el número de vocales en una cadena de texto
    let cadenaTexto = "¿Numero de vocales hay en esta cadena?"
    let vocales = ["a", "e", "i", "o", "u"]
    let cont = 0
    for(let letra of cadenaTexto){
        if(vocales.includes(letra)){
            cont++
        }
    }
    console.log(`En la cadena de texto hay ${cont} vocales`)

// 6. Dado un array de números, usa un bucle para multiplicar todos los números y mostrar el producto
    let arrayNumeros = [1,2,3,4,5]
    let resultado = 1
        for(let numero of arrayNumeros){
            resultado *= numero
        }
        console.log(resultado)

// 7. Escribe un bucle que imprima la tabla de multiplicar del 5
    let i = 1
    const NUM = 5
    console.log(`TABLA DEL ${NUM}`)
    do{
        console.log(`${NUM} * ${i} = ${i*NUM}`)
        i++
    }while(i <= 10)

// 8. Usa un bucle para invertir una cadena de texto
    let cadInvertir = "Cadena a invertir"
    let cadInvertida = []
    for(let letra of cadInvertir){
        cadInvertida.unshift(letra)
    }
    console.log(cadInvertida.join(""))

// 9. Usa un bucle para generar los primeros 10 números de la secuencia de Fibonacci
    let primero = 0
    let segundo = 1
    let num = 1
    let secFibonacci = []
    for(let index = 0; index < 10; index++){
        if(index == 0){
            num = 0;
        }else if (index == 1){
            num = 1
        }else{
            num = primero + segundo
        }
        secFibonacci.push(num)
        primero = segundo
        segundo = num
    }
    console.log(secFibonacci)

// 10. Dado un array de números, usa un bucle para crear un nuevo array que contenga solo los números mayores a 10
    let array1 = [1, 4, 9, 45, 23, 46, 51, 10]
    let array2 = []

    for(let i = 0; i < array1.length; i++){
        if(array1[i] > 10){
            array2.push(array1[i])
        }
    }
    console.log(array2.sort())
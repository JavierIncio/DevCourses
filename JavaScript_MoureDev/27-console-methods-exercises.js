// 1. Crea un función que utilice error correctamente
    let a = 10
    let b = 5
    function suma(a, b){
        if ((typeof a !== "number") || (typeof b !== "number")){
            console.error("Se ha producido un error: ", new Error("Sólo se pueden sumar números"));
            return null
        }
        return a+b
    }
    console.log(a, " + ", b, " = ", suma(10, 3))
    console.log("'10' + ", b, " = ", suma("10", 3))

// 2. Crea una función que utilice warn correctamente
    function multiplica(a, b){
        if (a === 1 || b === 1){
            console.warn(`Atención: Multiplicar un número por 1 no tiene efecto en el resultado`);
        }
        return a*b
    }
    console.log(a, " x ", b, " = ", multiplica(a, b))
    a=1
    console.log(a, " x ", b, " = ", multiplica(a, b))

// 3. Crea una función que utilice info correctamente
    function resta(a, b){
        if (a === 0){
            console.info(`Atención: Restar ${b} a 0 convierte al número en negativo`);
        }
        return a-b
    }
    a=10
    console.log(a, " - ", b, " = ", resta(a, b))
    a = 0
    console.log(a, " - ", b, " = ", resta(a, b))

// 4. Utiliza table
    let persona = [
        {name: "Javier", age: 27, dni: "11111111A"},
        {name: "Ana", age: 34, dni: "22222222B"},
        {name: "Pedro", age: 65, dni: "33333333C"},
        {name: "María", age: 19, dni: "44444444D"}
    ]
    console.table(persona)

// 5. Utiliza group
    console.group("Trabajador")
    console.log("Nombre: Javier, Edad: 27")
    console.log("Nombre: Ana, Edad: 34")
    console.log("Nombre: Pedro, Edad: 65")
    console.groupEnd()

// 6. Utiliza time
    console.time("Tiempo de ejecución de bucle for")
    for(let i = 0; i <= 9999; i++){

    }
    console.timeEnd("Tiempo de ejecución de bucle for")

// 7. Valida con assert si un número es positivo
    let numero = 45
    console.assert(numero > 0, `El número ${numero} no es positivo`)
    numero = -23
    console.assert(numero > 0, `El número ${numero} no es positivo`)

// 8. Utiliza count
    for(let index = 1; index <= 5; index++){
        console.count(`Hola`)
    }
    console.countReset(`Hola`)
    console.count(`Hola`)

// 9. Utiliza trace
    let person = {
        nombre: "Pedro",
        seguimiento: function(){
            console.trace("A continuación se hace un seguimiento del programa: ")
        }
    }

    function llamarObjeto(objeto){
        objeto.seguimiento()
    }

    llamarObjeto(person)

// 10. Utiliza clear
/*     console.clear() */
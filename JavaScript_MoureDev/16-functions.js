// Funciones

// simple
    function myFunc(){
        console.log("Hola, soy una función")
    }

    myFunc()

// con parámetros
    function myFuncWithParams(name){
        console.log(`Hola, soy ${name}`)
    }

    myFuncWithParams("una función con parámetros")

// anónimas
    const myFunc2 = function (name){
        console.log(`Hola, soy ${name}`)
    }

    myFunc2("Javi")

// Arrow functions (sintaxis simplificada de la anónima)
    const myFunc3 = (name) => {
        console.log(`Hola, soy ${name}`)
    }

    myFunc3("Javi")

    const myFunc4 = (name) => console.log(`Hola, soy ${name}`)

    myFunc4("Javi")

// Parámetros por defecto
    function sum(a, b){
        console.log(a + b)
    }
    sum(1,2)
    sum(1)
    sum()

    function defaultSum(a = 0, b = 0){
        console.log(a + b)
    }
    defaultSum(1)
    defaultSum(b = 10)
    defaultSum()

// Retorno de valores
    function mult(a,b){
        return a*b
    }
    let total = mult(5,10)
    console.log(total)

// Funciones anidadas
    function extern(){
        console.log("Función externa")
        function intern(){
            console.log("Función interna")
        }
        intern() // dentro del scope
    }

    extern()
    // intern() Error: fuera del scope

// Funciones de orden superior
    function applyFunc(func, param1, param2){
        func(param1, param2)
    }

    applyFunc(defaultSum, 4, 3)

// forEach (función capaz de ejecutar una función iteradora)

    let myArray = [1, 2, 3, 4]

    let mySet = new Set(["Javier", "Incio", "Prieto", 27, true])

    let myMap = new Map([
        ["name", "Javi"],
        ["mail", "javi@email.com"],
        ["age", 28]
    ])

    myArray.forEach((value) => console.log(value))
    mySet.forEach((value) => console.log(value))
    myMap.forEach((value) => console.log(value))
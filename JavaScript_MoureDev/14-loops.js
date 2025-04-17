// Loops o bucles

    // for
    for(let i = 0; i < 5; i++){
        console.log(`Hola ${i}`)
    }

    const numbers = [1, 2, 3, 4, 5]
    for(let i = 0; i < numbers.length; i++){
        console.log(`Elemento: ${numbers[i]}`)
    }

    // while
    let i = 0
    while (i < 5){
        console.log(`Hola ${i}`)
        i++
    }

    // do while
    let j = 6
    do{
        console.log(`Adiós ${j}`)
    }while(j < 5)

    //for of
    let myArray = [1, 2, 3, 4]

    let mySet = new Set(["Javier", "Incio", "Prieto", 27, true])

    let myMap = new Map([
        ["name", "Javi"],
        ["mail", "javi@email.com"],
        ["age", 28]
    ])

    let myString = "Hola, ¿qué tal?"

    // Imprime cada valor del array
    for(let valor of myArray){
        console.log(valor)
    }

    // Imprime cada elemento del set
    for(let valor of mySet){
        console.log(valor)
    }

    // Imprime cada entrada del map
    for(let valor of myMap){
        console.log(valor)
    }

    // Imprime cada caracter del string
    for(let valor of myString){
        console.log(valor)
    }


// Buenas prácticas

    // break y continue
    for(let i = 0; i < 10; i++){
        if(i == 5){
            continue // Se salta la condición evaluada y continua la iteración
        }else if (i == 8){
            break // Cuando se cumple la condición evaluada, se detiene la iteración
        }
        console.log(`Elemento: ${i}`)
    }
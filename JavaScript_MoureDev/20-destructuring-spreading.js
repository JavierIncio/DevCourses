// Asignacicion de variables por defecto
    let myArray = [1, 2, 3, 4]

    let person = {
        name: "Javier",
        age: 28,
        email: "javi@email.com"
    }

    let myValue = myArray[1]
    console.log(myValue)

    let myName = person.name
    console.log(myName)

// Desestructuración
// Nos permite extraer valores de estructuras (arrays, objetos...) y asignarlos a varias variables con una sola instrucción

    // Sintaxis arrays
        let [myValue0, myValue1, myValue2, myValue3, myValue4] = myArray
        console.log(myValue0)
        console.log(myValue1)
        console.log(myValue2)
        console.log(myValue3)
        console.log(myValue4)

        // Sintaxis arrays con valores predeterminados
            let [myValue5 = 0, myValue6 = 0, myValue7 = 0, myValue8 = 0, myValue9 = 0] = myArray
            console.log(myValue5)
            console.log(myValue6)
            console.log(myValue7)
            console.log(myValue8)
            console.log(myValue9)

        // Ignorar elementos array
            let [myValue10, , , myValue13] = myArray
            console.log(myValue10)
            console.log(myValue13)


    // Sintaxis objetos
    // El orden no importa, busca la propiedad por nombre
        let { email, name, age } = person
        console.log(name)
        console.log(age)
        console.log(email)

        // Sintaxis objetos con valores predeterminados
            let { name2, age2, email2, telefono = 667345532 } = person
            console.log(name2) // No existe; hay que usar el nombre de la propiedad (key)
            console.log(age2) // No existe
            console.log(email2) // No existe
            console.log(telefono)
        
        // Sintaxis objetos con nuevos nombres de variables
            let { name: name3, age: age3, email: email3 } = person
            console.log(name3)
            console.log(age3)
            console.log(email3)

        // Objetos anidados
            let person2 = {
                name: "Javier",
                age: 28,
                email: "javi@email.com",
                walk: function(){
                    console.log("La persona camina.")
                },
                job: {
                    name: "Programador",
                    exp: 10,
                    work: function(){
                        console.log(`La persona de ${this.exp} años de experiencia trabaja de ${this.name.toLowerCase()}.`)
                    }
                }
            }

            let { name: name4, job: {name: jobName} } = person2
            console.log(name4)
            console.log(jobName)

// Propagación (...)
// Nos permite expandir elementos de un array o un objeto a otros arrays u objetos

    //Sintaxis arrays
        let myArray2 = [...myArray, 5, 6]
        console.log(myArray2)

        // Copia de arrays
            let myArray3 = [...myArray] // copia el array
            console.log(myArray3)

        // Combinación de arrays
            let myArray4 = [...myArray, ...myArray2, ...myArray3]
            console.log(myArray4)

    // Sintaxis objetos
        let person3 = { ...person, telefono: 667345532 }
           console.log(person3)

        // Copia de objetos
            let person4 = { ...person }
            console.log(person4)
// Objects

// Sintaxis
    let person = {
        name: "Javier",
        age: 28,
        email: "javi@email.com"
    }

// Acceso a propiedades
    // Notación por punto (recomendada)
        console.log(person.name)

    // Notación de corchetes
        console.log(person["age"])

    // Modificación de valor y tipo
        person.name = "Javier Incio"
        console.log(person.name)

        console.log(typeof person.age)
        person.age = "28"
        console.log(person.age)
        console.log(typeof person.age)

    // Eliminación de propiedades
        delete person.age
        console.log(person)

    // Nueva propiedad
        person.telefono = 667345532
        console.log(person)

        person["age"] = 28
        console.log(person)

// Métodos (funciones)
    let person2 = {
        name: "Javier",
        age: 28,
        email: "javi@email.com",
        walk: function(){
            console.log("La persona camina.")
        }
    }
    person2.walk();

// Anidación de objetos
    let person3 = {
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
    console.log(person3)
    console.log(person3.job)
    console.log(person3.job.name)
    person3.job.work()

// Igualdad de objetos
    let person4 = {
        name: "Javier Incio",
        age: 28,
        email: "javi@email.com"
    }

    console.log(person)
    console.log(person4)

    // Se compara la dirección de memoria, no su valor
    console.log(person == person4)
    console.log(person === person4)

    console.log(person.name == person4.name)

// Iteración
    for(let key in person4){
        // console.log(value) // Accede a las claves
        console.log(key + ": " + person4[key]) // Accede a los valores
    }

// Funciones como objetos
    function Person(name,age) { //No es una buena practica, debería ser una clase
        this.name = name
        this.age = age
    }

    let person5 = new Person("Javier", 28)

    console.log(person5)
    console.log(typeof person4)
    console.log(typeof person5)
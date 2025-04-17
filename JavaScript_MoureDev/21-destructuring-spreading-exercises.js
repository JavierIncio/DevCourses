// 1. Usa desestructuración para extraer los dos primeros elementos de un array 
    let array = [1,2,3,4]
    let [value00, value01] = array

// 2. Usa desestructuración en un array y asigna un valor predeterminado a una variable
    let array1 = [5,6,7,8]
    let [value10, value11, value12, value13, value14 = 0] = array1

// 3. Usa desestructuración para extraer dos propiedades de un objeto
    let objeto = {
        nombre: "Jose",
        edad: 33,
        telefono: 666778899,
        job: {
            puesto: "Programador",
            experiencia: 20
        }
    }
    let {nombre, telefono, edad} = objeto

// 4. Usa desestructuración para extraer dos propiedades de un objeto y asígnalas a nuevas variables con nombres diferentes
    let {nombre: name, edad: age} = objeto

// 5. Usa desestructuración para extraer dos propiedades de un objeto anidado
    let {job: {puesto, experiencia} } = objeto

// 6. Usa propagación para combinar dos arrays en uno nuevo
    let array2 = [...array, ...array1]

// 7. Usa propagación para crear una copia de un array
    let arrayCopia = [...array1]

// 8. Usa propagación para combinar dos objetos en uno nuevo
    let objeto1 = {
        name: "Ana",
        age: 27,
        telefono: 666554433
    }

    let objeto2 = { ...objeto, ...objeto1 }

// 9. Usa propagación para crear una copia de un objeto
    let objetoCopia = { ...objeto1 }

// 10. Combina desestructuración y propagación
    // Array
    let arrayFinal = [1,2,3,4]
    let [val0, val1, val2, val3, val4, val5 = 0] = [...arrayFinal, 5]

    // Objeto
    let objetoA = {
        nombreA: "Carlos",
        detalles: {
            edadA: 28,
            ciudadA: "Madrid"
        }
    };
    
     let {nombreA, detalles: {edadA, ciudadA}, perfil: {trabajoA, expA} } = {...objetoA, perfil: {trabajoA: "Profesor", expA: 5}}
     console.log(nombreA)
     console.log(edadA)
     console.log(ciudadA)
     console.log(trabajoA)
     console.log(expA)
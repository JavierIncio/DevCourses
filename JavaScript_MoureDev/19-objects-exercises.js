// 1. Crea un objeto con 3 propiedades
    let coche = {
        marca: "Seat",
        traccion: "Trasera",
        precio: 9999.99
    }
// 2. Accede y muestra su valor
    console.log(coche)

// 3. Agrega una nueva propiedad
    coche.modelo = "Ibiza"

// 4. Elimina una de las 3 primeras propiedades
    delete coche.traccion

// 5. Agrega una función e invócala
    coche["segundaMano"] = function() {
        console.log(`El ${coche.marca} ${coche.modelo} es de seguna mano`)
    }
    coche.segundaMano()

// 6. Itera las propiedades del objeto
    for(key in coche){
        console.log(key + ": " + coche[key])
    }
// 7. Crea un objeto anidado
    let vehiculo = {
        precio: 11000,
        marca: "Fiat",
        modelo: {
            nombre: "Tipo",
            CC: 120
        }
    }

// 8. Accede y muestra el valor de las propiedades anidadas
    console.log(vehiculo.modelo.nombre)

// 9. Comprueba si los dos objetos creados son iguales
    console.log(coche == vehiculo)

// 10. Comprueba si dos propiedades diferentes son iguales
    console.log(coche.marca == vehiculo.modelo.CC)
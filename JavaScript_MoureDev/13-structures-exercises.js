// 1. Crea un array que almacene cinco animales
    arrayAnimales = ["perro", "gato", "águila", "atún", "oso"]
    console.log(arrayAnimales)

// 2. Añade dos más. Uno al principio y otro al final
    arrayAnimales.push("Vaca")
    arrayAnimales.unshift("Caballo")
    console.log(arrayAnimales)

// 3. Elimina el que se encuentra en tercera posición
    arrayAnimales.splice(2,1)
    console.log(arrayAnimales)
    
// 4. Crea un set que almacene cinco libros
    let setLibros = new Set(["Libro1", "Libro2", "Libro3", "Libro4", "Libro5"])
    console.log(setLibros)

// 5. Añade dos más. Uno de ellos repetido
    setLibros.add("Libro6")
    setLibros.add("Libro1")
    console.log(setLibros)

// 6. Elimina uno concreto a tu elección
    setLibros.delete("Libro5")
    console.log(setLibros)

// 7. Crea un mapa que asocie el número del mes a su nombre
    mapMeses = new Map([
        [1, "Enero"],
        [2, "Febrero"],
        [3, "Marzo"],
        [4, "Abril"],
        [5, "Mayo"],
        [6, "Junio"],
        [7, "Julio"],
        [8, "Agosto"],
        [9, "Septiembre"],
        [10, "Octubre"],
        [11, "Noviembre"],
        [12, "Diciembre"]
    ])

// 8. Comprueba si el mes número 5 existe en el map e imprime su valor
    console.log(mapMeses.has(5))    
    console.log(mapMeses.get(5))

// 9. Añade al mapa una clave con un array que almacene los meses de verano
    mapMeses.set("verano", ["Junio", "Julio", "Agosto"])
    console.log(mapMeses.get("verano"))

// 10. Crea un Array, transfórmalo a un Set y almacénalo en un Map
    let myArray = [1,2,3,4]
    let mySet = new Set(myArray);
    let myMap = new Map([
        ["set1", mySet]
    ])
    console.log(myArray)
    console.log(mySet)
    console.log(myMap)
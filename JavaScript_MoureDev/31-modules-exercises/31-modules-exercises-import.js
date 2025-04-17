// 1. Importa una función
    import { multiplicacion } from "./31-modules-exercises-export.js";
    console.log(multiplicacion(2, 3))

// 2. Importa una constante
    import { IVA } from "./31-modules-exercises-export.js";
    console.log(IVA)

// 3. Importa una clase
    import { Compra } from "./31-modules-exercises-export.js";
    let compra = new Compra(1234, 4, 12.99)
    console.log("ID:", compra.id_producto)
    console.log(compra.calcularTotal().toFixed(2), "€")

// 4. Importa una función, una constante y una clase por defecto (en caso de que lo permita)
    // Sólo se puede tener una importación por defecto

    /*
    import defaultFunction from "./31-modules-exercises-export.js"
    console.log(defaultFunction(6, 2))
    */
    /* 
    import defaultConst from "./31-modules-exercises-export.js"
    console.log(defaultConst)
    */
    import defaultClass from "./31-modules-exercises-export.js"
    let defClass = new defaultClass(2, 3)
    console.log(defClass.area())

// 5. Importa una función, una constante y una clase desde un directorio diferente al anterior
    import { modulo, CONSTANTE, MyClass } from "./carpeta/31.5-modules-exercises-dir-export.js";
    console.log(modulo(25, 6))
    console.log(CONSTANTE)
    let clase = new MyClass("Clase")
    console.log(clase.nombre)
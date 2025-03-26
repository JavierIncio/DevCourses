// Importación de módulos
    // OPCIÓN A:
        // Convertimos los ficheros en .mjs (siempre que trabajemos con node.js)
        // import { add, PI } from "./28-export-modules.mjs";

    // OPCIÓN B:
        // Creamos un package.json con "type": "module" y mantenemos la extensión de los ficheros en .js
            import { add, PI, name, Circle } from "./28-export-modules.js";
    
        
    // Funciones
        console.log(add(5, 10))

    // Propiedades
        console.log(PI)
        console.log(name)

    // Clases
        let circle = new Circle(10)
        console.log(circle.radius)
        console.log(circle.area().toFixed(2)) // Muestra el area con dos decimales
        
    // Importación por defecto
    // Solo hace caso a lo que se ha exportado por defecto
        import defaultImport from "./28-export-modules.js"

        console.log(defaultImport(4,3))
        /* 
        let myClass = new defaultImport()
        myClass.func()
         */

    // Proyecto modular
        // import { MyImport} from "./dir/file.js"

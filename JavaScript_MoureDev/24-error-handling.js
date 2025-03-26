// Excepción
    let myObject
    // console.log(myObject.email)
    // Produce una excepción porque el objeto no tiene esa propiedad

// Captura de errores
    // try-catch
        try {
            // Código que se intenta ejecutal y es susceptible a errores
            console.log(myObject.email)
            console.log("Finaliza la ejecución sin errores")
        } catch {
            // Bloque de error
            console.log("Se ha producido un error")
        }

        // Captura del error
            try {
                console.log(myObject.email)
            } catch (error) {
                console.log("Se ha producido un error: ", error.message)
            }

            // finally
                try {
                    console.log(myObject.email)
                } catch (error) {
                    console.log("Se ha producido un error: ", error.message)
                } finally {
                    console.log("El código en el bloque 'finally' se ejecuta siempre")
                }
                /* // No soportado. Se produce un error y no se captura
                try {
                    console.log(myObject.email)
                } finally {
                    console.log("El código en el bloque 'finally' se ejecuta siempre")
                } */

// Lanzamiento de errores
    // throw
        //throw new Error("Se ha producido un error")

        function sumIntegers(a, b) {
            if(typeof a !== "number" || typeof b !== "number"){
                throw new TypeError("Esta operación sólo suma números")
            }
            if(!Number.isInteger(a) || !Number.isInteger(b)){
                // Comprueba si es un número
                throw new Error("Esta operación sólo suma números enteros")
            }
            if (a == 0 || b == 0){
                throw new SumZeroIntegerError("Se está intentando sumar '0'", a, b)
                
            }
            return a + b
        }

        try {
            console.log(sumIntegers(5, 10))
            console.log(sumIntegers("5", 10)) // La ejecución del 'try' se para en el primer error
            console.log(sumIntegers(5.5, 10))
        } catch (error) {
            console.log("Se ha producido un error: ", error.message)
        }

// Captura de varios errores
    try {
        console.log(sumIntegers(5.5, 10))
        console.log(sumIntegers("5", 10))
    } catch (error) {
        if (error instanceof TypeError) {
            console.log("Se ha producido un error de tipo: ", error.message)
        } else if (error instanceof Error) {
            console.log("Se ha producido un error: ", error.message)
        }
    }

// Creación de excepciones personalizadas
    class SumZeroIntegerError extends Error {
        constructor(message, a, b){
            super(message)
            this.a = a
            this.b = b
        }

        printNumbers(){
            console.log(this.a, " + ", this.b)
        }
    }
    
    try {
        console.log(sumIntegers(0, 10))
    }catch (error){
        console.log("Se ha producido un error personalizado: ", error.message)
        error.printNumbers()
    }


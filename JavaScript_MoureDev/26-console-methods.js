// Métodos de consola
    // log
        console.log("¡Hola, Mundo!")

    // error
        console.error("Este es un mensaje de error.")
        console.error("Error al conectarse a la base de datos: ", new Error("Conexión fallida"))

    // warn
        console.warn("Este es un mensaje de advertencia.")

    // info
        console.info("Este es un mensaje de información adicional.")

    // table
        let data = [
            ["Javier", 28],
            ["Ana", 24]
        ]
        console.table(data)

        data = [
            {name: "Javier", age: 28},
            {name: "Ana", age: 24}
        ]
        console.table(data)

    // group
        console.group("Usuario:")
        console.log("Nombre: Javier")
        console.log("Nombre: Javier")
        console.groupEnd()
        console.log("Este texto está fuera del usuario")

    // time
        console.time("Tiempo de ejecución")
        for (let i = 0; i < 10000; i++){

        }
        console.timeEnd("Tiempo de ejecución") // El texto tiene que ser igual; funciona como id

    // assert
        let age = 16
        console.assert(age >= 18, "El usuario debe ser mayor de edad.")

    // count
        console.count("Click")
        console.count("Click")
        console.count("Click")
        console.countReset("Click")
        console.count("Click")

    // trace
        function funcA() {
            funcB()
        }

        function funcB() {
            console.trace("Seguimiento de la ejecución.")
        }

        funcA()

    // clear
        // console.clear()
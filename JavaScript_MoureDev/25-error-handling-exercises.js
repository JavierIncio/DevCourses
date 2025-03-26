// 1. Captura una excepción utilizando try-catch
    let animal = {
        tipo: "Perro",
        edad: 5
    }

    try{
        console.log(animal.tipo)
        console.log(animal.edad)
        console.log(animal.dueño)
    }catch(error){
        console.log("Se ha producido un error: ", error.message)
    }

// 2. Captura una excepción utilizando try-catch y finally
    let animal2 = {
        tipo: "Gato",
        sonido: function() {
            console.log(`El ${animal2.tipo} maulla`)
        }
    }

    try{
        console.log(animal2.tipo)
        console.log(animal2.edad)
    }catch(error){
        console.log("Se ha producido un error: ", error.message)
    }finally{
        animal2.sonido()
    }

// 3. Lanza una excepción genérica
    function doble(num) {
        if (typeof num !== "number" || isNaN(num)){
            throw new Error(`${num} no es un valor numérico`);
        }
        if(num === 0) {
            throw new DoubleZeroError("No se puede doblar '0'");
            
        }
        return num * 2
    }

    try{
        console.log(doble(1.2))
        console.log(doble(9))
        console.log(doble("6"))
    }catch(error){
        console.log("Se ha producido un error: ", error.message)
    }

// 4. Crea una excepción personalizada
    class DoubleZeroError extends Error {
        constructor(message, num){
            super(message)
            this.num = num
        }

        print(){
            console.log(num, " * 2")
        }
    }

// 5. Lanza una excepción personalizada
    try{
        console.log(doble(0))
    }catch(error){
        console.log("Se ha producido un error por introducir 0: ", error.message)
    }

// 6. Lanza varias excepciones según una lógica definida
    class Account {
        #pass
        constructor(user='user1234', pass = 1111111111){
            this.user = user
            this.#pass = pass
        }
        set pass(newPass){
            this.#pass = newPass
        }
    }

    function safePass (pass) {
        if (typeof pass !== "number"){
            throw new TypeError("La contraseña tiene que ser un valor numérico");
        }
        if (pass.toString().length <= 5){
            throw new Error("La contraseña tiene que tener al menos 5 dígitos")
        }
        if (pass.toString().length > 10){
            throw new Error("La contraseña tiene que tener entre 5 y 10 dígitos")
        }
    }

    let cuenta = new Account("jinciopr")

// 7. Captura varias excepciones en un mismo try-catch
    try {
        cuenta.pass = safePass(1234)
        cuenta.pass = safePass(12345678901234)
        cuenta.pass = safePass("1234")
    } catch (error) {
        if (error instanceof TypeError) {
            console.log("Se ha producido un error de tipo: ", error.message)
        } else if (error instanceof Error) {
            console.log("Se ha producido un error: ", error.message)
        }
    }

// 8. Crea un bucle que intente transformar a float cada valor y capture y muestre los errores
    let valores = [1, 1.45, "hola", true, "123.45", null, undefined, "NaN"]

    function hacerFloat(valor){
        if(isNaN(valor)){
            throw new TypeError("El valor no es un número");
        }
        if((typeof valor === "number") && !(Number.isInteger(valor))){
            throw new TypeError("El valor ya es un número decimal");
        }
        return parseFloat(valor)
    }

    for(let valor of valores){
        try {
            console.log(hacerFloat(valor))
        } catch (error) {
            console.log("Se ha producido un error al pasar a Float: ", error.message)
        }
    }

// 9. Crea una función que verifique si un objeto tiene una propiedad específica y lance una excepción personalizada
    class ErrorPersonalizado extends Error{
        constructor(message){
            super(message)
        }    
    }

    function tienePropiedad (objeto, propiedad){
        if (!(propiedad in objeto)) {
            throw new ErrorPersonalizado(`El objeto no tiene la propiedad ${propiedad}`);
        } else {
            console.log(`El valor de la propiedad ${propiedad} en el objeto es: ${objeto[propiedad]}`);
        }
    }

    let persona1 = {
        nombre: "Javier",
        edad: 27,
        email: "email@email.com"
    }

    let persona2 = {
        nombre: "Juan",
        edad: 23
    }

    try {
        tienePropiedad(persona1, "email")
        tienePropiedad(persona2, "email")
    } catch (error) {
        if (error instanceof Error) {
            console.log("Se ha producido un error: ", error.message)
        } else if (error instanceof ErrorPersonalizado) {
            console.log("Se ha producido un error personalizado: ", error.message)
        }
    }

// 10. Crea una función que realice reintentos en caso de error hasta un máximo de 10
    const INTENTOS = 10
    const MIN = 1
    const MAX = 20

    function reintentar(){
        try {
            let numero = parseInt(prompt(`Introduzca un número entre ${MIN} y ${MAX}`))
            if(isNaN(numero)){
                throw new TypeError("No se ha introducido un número");         
            }
            if(numero < MIN){
                throw new Error(`${numero} es menor que ${MIN}`);                             
            }
            if(numero > MAX){
                throw new Error(`${numero} es mayor que ${MAX}`);         
            }
            return numero
        } catch (error) {
            console.log("Se ha producido un error: ", error.message)
        }
    }

    for (let intento = 1; intento <= INTENTOS; intento++){
        let num = reintentar()
        if(num >= MIN && num <= MAX){
            console.log("El número es válido")
            break
        }                
    }
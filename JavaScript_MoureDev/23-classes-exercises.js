// 1. Crea una clase que reciba dos propiedades
    class Persona {

        constructor(name, age){
            this.name = name
            this.age = age
        }

        static jubilacion(persona, edadJubilacion){
            return (edadJubilacion - persona.age)
        }

        work(){
            console.log(`${this.name} trabaja en producción. Tiene ${this.age} años.`)
        }
    }

    let persona = new Persona("Paco", 44)

// 2. Añade un método a la clase que utilice las propiedades

// 3. Muestra los valores de las propiedades e invoca a la función
    console.log(persona)
    persona.work()

// 4. Añade un método estático a la primera clase

// 5. Haz uso del método estático
    console.log(`Le quedan ${Persona.jubilacion(persona, 68)} años para jubilarse.`)

// 6. Crea una clase que haga uso de herencia
    class Vehiculo {
        constructor(motor){
            this.motor = motor
        }
        plazas(){
            console.log("El vehículo tiene n plazas")
        }
    }

    class Coche extends Vehiculo{
        constructor(motor, maletero){
            super(motor)
            this.maletero = maletero
        }
        plazas(){
            console.log("El coche tiene 4 plazas")
        }
    }

// 7. Crea una clase que haga uso de getters y setters
    class Cuenta {
        #user
        #pass
        constructor(user = "user1234", pass = "password1234", email){
            this.#user = user
            this.#pass = pass
            this.email = email
        }

        get user(){
            return this.#user
        }

        set pass(newPass){
            this.#pass = newPass
        }

    }

// 8. Modifica la clase con getters y setters para que use propiedades privadas
    let myAccount = new Cuenta("jinciopr", "123456789abc", "email@email.com")
    console.log(myAccount)
    console.log(myAccount.pass)

// 9. Utiliza los get y set y muestra sus valores
    console.log(myAccount.user)
    myAccount.pass = "newPassword"

// 10. Sobrescribe un método de una clase que utilice herencia 
    // Añadido al ejercicio 6
// Clases

// Sintaxis
    class Person {
        constructor(name, age, phone){
            this.name = name
            this.age = age
            this.phone = phone
        }
    }

    let person = new Person("Javier", 28, 667345532)
    let person2 = new Person("Javier", 28, 667345532) // Se pueden asignar los mismos valores a multiples objetos

    console.log(person)
    console.log(person2)

    console.log(typeof person)


// Valores por defecto
    class DefaultPerson {
        constructor(name = "Sin nombre", age = 0, phone = "Sin teléfono"){
            this.name = name
            this.age = age
            this.phone = phone
        }
    }

    let person3 = new DefaultPerson() // Sin valores asignados, coge los valores por defecto
    console.log(person3)

    let person4 = new DefaultPerson("Javier") // Asignamos el valor del nombre
    console.log(person4)

    let person5 = new DefaultPerson('Javier', 667345532, 27) // Los parámetros deben de estar en orden
    console.log(person5)


// Acceso a propiedades
    console.log(person3.name)
    console.log(person3["name"])

    person3.name = "Javier" // Podemos acceder a la propiedad y modificar su valor
    console.log(person3.name)


// Funciones en clases
    class PersonWithMethod {
        constructor(name, age, phone){
            this.name = name
            this.age = age
            this.phone = phone
        }
        walk(){
            console.log("La persona camina")
        }
    }

    let person6 = new PersonWithMethod("Javier", 28, 667345532)
    person6.walk()

// Propiedades privadas
    class PrivatePerson {
        #bank // Para que una propiedad sea privada, hay que definirla antes en la clase
        constructor(name, age, phone, bank) {
            this.name = name
            this.age = age
            this.phone = phone
            this.#bank = bank
        }
        pay(){
            this.#bank
        }
    }

    let person7 = new PrivatePerson("Javier", 28, 667345532, "ES00123456789012")
    console.log(person7.bank) // No podemos acceder desde fuera de la clase
    
    person7.bank = "aaaaaaaaaaa" // Crea una nueva propiedad 'bank' pública. No es #bank
    console.log(person7)

// Getter y Setter
    class GetSetPerson {
        #name
        #age
        #phone
        #bank
        constructor(name, age, phone, bank) {
            this.#name = name
            this.#age = age
            this.#phone = phone
            this.#bank = bank
        }

        // Permite acceder al nombre, sin modificarlo
        get name(){
            return this.#name
        }

        // Permite modificar el banco, sin acceder a su valor
        set bank(newBank){
            this.#bank = newBank
        }
    }

    let person8 = new GetSetPerson("Javier", 28, 667345532, "ES00123456789012")
    console.log(person8)
    console.log(person8.name)

    person8.bank = "new ES00123456789012"
    console.log(person8)

// Herencia de clases
    class Animal {

        constructor(name){
            this.name = name
        }

        sound(){
            console.log("El animal emite un sonido genérico")
        }
    }

    class Dog extends Animal{

        sound(){ //redefinición de método
            console.log("El perro ladra")
        }

        run() {
            console.log("El perro corre")
        }
    }

    class Fish extends Animal{

        constructor(name, size){
            super(name)
            this.size = size
        }

        swim() {
            console.log("El pez nada")
        }
    }

    let myDog = new Dog("Joaquín")
    myDog.run()
    myDog.sound()

    let myFish = new Fish("Arturo",10)
    myFish.swim()
    myFish.sound()

// Metodos estáticos
    class MathOperations {

        static sum(a, b){
            return a + b
        }
    }

    /*
    // No es necesario instanciar la clase para llamar a un método estático
    let myMath = new MathOperations()
    console.log(myMath.sum(5,10))
    */

    console.log(MathOperations.sum(5, 10)) // Llamamos a la función en la propia clase
// if/else/else if/ternaria

// 1. Imprime por consola tu nombre si una variable toma su valor
    let myName = "Javier"

    if(myName == "Javier"){
        console.log("Mi nombre es "+myName)
    }

// 2. Imprime por consola un mensaje si el usuario y contraseña concide con unos establecidos
    let usuario = "user1234"
    let passwd = "passwd1234"

    if(usuario == "user1234" && passwd == "passwd1234"){
        console.log("Iniciando sesión")
    }

// 3. Verifica si un número es positivo, negativo o cero e imprime un mensaje
    let numero = 3
    if(numero < 0){
        console.log("El número es negativo")
    }else if(numero > 0){
        console.log("El número es positivo")
    }else{
        console.log("El número es '0'")
    }

// 4. Verifica si una persona puede votar o no (mayor o igual a 18) e indica cuántos años le faltan
    let edad = 14
    const mayoriaEdad = 18

    if(edad >= mayoriaEdad){
        console.log("Está en edad legal para votar")
    }else{
        let diferencia = mayoriaEdad - edad
        console.log(`Aún no es mayor de edad. Le faltan ${diferencia} años para votar`)
    }

// 5. Usa el operador ternario para asignar el valor "adulto" o "menor" a una variable dependiendo de la edad 
    let message = edad >= mayoriaEdad ? "adulto" : "menor"
    console.log(message)

// 6. Muestra en que estación del año nos encontramos dependiendo del valor de una variable "mes"
    let mes = 14
    if(mes > 2 && mes < 6){
        console.log("Primavera")
    }else if(mes > 5 && mes < 9){
        console.log("Verano")
    }else if(mes > 8 && mes < 12){
        console.log("Otoño")
    }else if(mes > 11 && mes < 3){
        console.log("Invierno")
    }else{
        console.log("No es un número de mes válido")
    }

// 7. Muestra el número de días que tiene un mes dependiendo de la variable del ejercicio anterior
if(mes < 1 || mes > 12){
    console.log(`${mes} no es un número de mes válido`)
}else if(mes == 2){
    console.log("28 días")
}else if((mes < 8 && mes % 2 != 0) || (mes >= 8 && mes % 2 == 0)){
    console.log("31 días")
}else{
    console.log("30 días")
}

// switch

// 8. Usa un switch para imprimir un mensaje de saludo diferente dependiendo del idioma
    let idioma = "spanish"
    switch(idioma){
        case "spanish":
            console.log("Hola")
            break
        case "english":
            console.log("Hello")
            break
        case "french":
            console.log("Salùt")
            break
        case "deutch":
            console.log("Hallo")
            break
        default:
            console.log("No se ha introducido un idioma válido")
    }

// 9. Usa un switch para hacer de nuevo el ejercicio 6
    mes = 1
    switch(mes){
        case 3, 4, 5:
            console.log("Primavera")
            break
        case 6, 7, 8:
            console.log("Verano")
            break
        case 9, 10, 11:
            console.log("Otoño")
            break
        case 1, 2, 12:
            console.log("Invierno")
            break
        default:
            console.log("No se ha introducido un número de mes válido")
    }

// 10. Usa un switch para hacer de nuevo el ejercicio 7
    mes = 1
    switch(mes){
        case 1, 3, 5, 7, 8, 10, 12:
            console.log("31")
            break
        case 2:
            console.log("28")
            break
        case 4, 6, 9, 11:
            console.log("30")
            break
        default:
            console.log("No se ha introducido un número de mes válido")
    }
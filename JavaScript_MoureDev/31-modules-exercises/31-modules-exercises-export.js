// 1. Exporta una función
    export function multiplicacion(a, b) {
        return a * b
    }

// 2. Exporta una constante
    export const IVA = 0.21

// 3. Exporta una clase
    export class Compra {

        constructor(id_producto, cantidad, precio){
            this.id_producto = id_producto
            this.cantidad = cantidad
            this.precio = precio
        }

        calcularTotal(){
            return (this.cantidad * ((this.precio*IVA)+this.precio))
        }
    }

// 4. Exporta una función, una constante y una clase por defecto (en caso de que lo permita)
    /*
    export default function division(a, b) {
        return (a / b)
    }
    */
    /* 
    const PI = 3.14
    export default PI
    */
    export default class Rectangulo {

        constructor(base, altura) {
            this.base = base
            this.altura = altura
        }

        area() {
            return (this.base * this.altura)
        }
    }
    

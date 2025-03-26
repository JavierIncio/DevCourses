// Exportación de módulos
    // Funciones
        export function add(a, b){
            return a + b
        }

    // Propiedades
        export const PI = 3.1416
        export let name = "Javier"

    // Clases
        export class Circle {
            constructor(radius) {
                this.radius = radius
            }

            area() {
                return Math.PI * Math.pow(this.radius, 2)
            }
        }

    // Exportación por defecto
    // Sólo puede haber una exportación por defecto
        export default function substract(a, b){
            return a - b
        }

    // Clases
        /* 
        export default class MyClass {

            func() {
                console.log("Mi clase")
            }
        }
         */
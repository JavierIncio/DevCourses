# string1 = 'single quotes'
# string2 = "double quotes"

# index_var = "cadena"
# print(index_var[2]) # Se accede al indice 2 de la string
# print("cadena"[2]) # Se accede al indice 2 de la string

# slice_var = "murciélago"
# print(slice_var[:7]) # Trocea la cadena desde el inicio [0] hasta el índice [7], el último no está incluido
# print(slice_var[3:]) # Trocea la cadena desde el índice [3] hasta el final
# print(slice_var[4:7]) # Trocea la cadena desde el índice [4] hasta el índice [7], el último no está incluido

# ------------- Concatenación de cadenas -------------------------------------------------------------------------------
# print("Esto es una"+" "+"cadena de texto concatenada")
# print("Esto es una pal" + "abra concatenada")

# concatenated = "R2" + "-" + "D2"
# print(concatenated)
# print(concatenated[3])
# print(concatenated[1:4])

# nike = "Just do it!"
# print(nike[10])
# print(nike[5:7])
# print(nike[8:])
# print(nike[:4])
# print("Don't " + nike[5:])

# str() convierte un valor a string
# type() devuelve el tipo del valor entre paréntesis
# floatToStr = str(3.14)
# print(floatToStr[:1] + floatToStr[2:])
# print(type(floatToStr))

# ------------- ESCAPE SEQUENCES ---------------------------------------------------------------------------------------
# \t (tabulación)
# print("Este es un texto normal")
# print("\tEste es un texto con sangrado")

# \n (salto de línea)
# print("Línea 1\nLínea 2")

# \' & \"
# print("Este es un texto con \'comillas simples\'")
# print("Este también es un texto con 'comillas simples'")
# print("Este es un texto con \"comillas dobles\"")

# \\
# print("Todas las secuencias de escape contienen una \\")

# ------------- Exercises ----------------------------------------------------------------------------------------------
# variable_float = 12.34
# print(type(variable_float))
# variable_float = str(variable_float)
# print(variable_float + " is a float")
# print("\"Hello, I'm Javier, it's nice to meet you!\"")

# ------------- Asterisk Triangle --------------------------------------------------------------------------------------
# print("*******\n *****\n  ***\n   *")

# ------------- input() ------------------------------------------------------------------------------------------------
# name_var = input("Please enter your name: ")
# print("Your name is " + name_var + ".")
# (type(name_var))

# fav_num = input("Whats your favourite number?")
# print("Your favourite number is " + fav_num + ".")
# print(type(fav_num)) # input() siempre devuelve un valor de tipo string

# ------------- MONTY PYTHON -------------------------------------------------------------------------------------------
# name = input("What is your name?")
# quest = input("What is your quest?")
# fav_color = input("What is your favourite colour?")
# print("So your name is " + name + ", your quest is " + quest + ", and your favourite colour is " + fav_color + ".")

# ------------- int() --------------------------------------------------------------------------------------------------
# user_int = int(input("Introduzca un número entero: "))
# print(user_int)
# print(type(user_int)) # Convierte de 'string' a 'integer'

# print(int(11.9)) # Trunca los decimales
# print(int('11.9')) # Error

# print(int(10.1 + 9.3)) # Realiza la operación y trunca los decimales
# print(int('10.1 + 9.3')) # Error

# print(int("'Texto', '4567' y '$%&'")) # Error

# ------------- float() ------------------------------------------------------------------------------------------------
# user_float = float(input("Introduzca un número decimal: "))
# print(user_float)
# print(type(user_float)) # Convierte de 'string' a 'float'

# print(float(1)) # Devuelve 1.0 (float)
# print(float('1')) # Devuelve 1.0 (float)

# print(float(1 + 2)) # Devuelve 3.0 (float)
# print(float('1 + 2')) # Error

# print(float("'Texto', '4567' y '$%&'")) # Error

# ------------- int() exercises ----------------------------------------------------------------------------------------
# numeroMas10 = int(input("Introduce un número entero al que sumarle '10': "))
# print(numeroMas10 + 10)

# ------------- FUNCIONES ----------------------------------------------------------------------------------------------
# Para definir una función, usamos la palabra reservada 'def', seguida del 'nombre de la función', '(parámetros)' y ':'
# El cuerpo de la función se coloca indentado debajo de la cabecera
# Como buena práctica, se dejan dos líneas en blanco antes y después de definir una función


# def function_name(parameter):
    # print(parameter + 2)


# Llamada a la función (pasando argumentos si es necesario):
# function_name(4)


# def default_example(num1=7, num2=8):
    # print(num1*num2)


# default_example() # 'num1' y 'num2' toman sus valores predeterminados
# default_example(2) # '2' se asigna a 'num1', mientras que 'num2' toma su valor predeterminado
# default_example(2, 5)


# def return_example(num1=7, num2=8):
    # return num1 * num2


# product = return_example(2)
# print(product)

# print(return_example() + 44)

# ------------- FUNCTION EXERCISES -------------------------------------------------------------------------------------
# def hello_world_printer():
    # print("Hello, World!")


# hello_world_printer()

# ----------------------------------------------------------------------------------------------------------------------
# def name_printer(user_name):
    # print(user_name)


# name = input("Introduce tu nombre: ")
# name_printer(name)

# ------------- VOLUME OF A RECTANGULAR PRISM --------------------------------------------------------------------------
# length = int(input("Please, enter the length of the rectangular prism: "))
# width = int(input("Please, enter the width of the rectangular prism: "))
# height = int(input("Please, enter the height of the rectangular prism: "))

# def calculate_volume(l, w, h):
    # return l * w * h


# print("The volume of the rectangular prism is " + str(calculate_volume(length, width, height)) + " cubic feet")

# ------------- CELSIUS TO FAHRENHEIT ----------------------------------------------------------------------------------
# celsius_temp = int(input("Enter an integer value for the temperature in celsius: "))


# def fahrenheit(celsius):
#    return (18 * celsius + 320) / 10
#    return round((1.8 * celsius + 32), 1)


# print("The Fahrenheit equivalent of "+ str(celsius_temp) +" degrees Celsius is "+ str(fahrenheit(celsius_temp)) +".")

# ------------- MODULES ------------------------------------------------------------------------------------------------
# Importar el módulo 'random'
# import random
# print(random.randint(1, 10))

# Importar la función 'randint' desde el módulo 'random'
# from random import randint
# print(randint(10, 20))

# Importación universal
# from random import *
# print(random())

# ------------- MILES PER GALLON ---------------------------------------------------------------------------------------
# from random import randint
# gallons = randint(10, 25)
# miles = randint(200, 400)


# def miles_per_gallon(m, g):
    # return m // g


# print("Gallons of gas in the car's fuel tank: " + str(gallons))
# print("Number of miles the car can travel on a full tank: " + str(miles))
# print("Miles per gallon: " + str(miles_per_gallon(miles, gallons)))

# ------------- SCOPES -------------------------------------------------------------------------------------------------
# scope_example = "Hello, World!" # global variable


# def local_scope_example():
    # scope_example = "this is a string" # local variable
    # return scope_example


# print(scope_example)
# print(local_scope_example())


# Local variables cannot be used by code in the global scope.
# Global variables can be accessed by code in a local scope.
# The local scope of one function cannot use variables from another function's local scope.
# You can use the same name for different variables as long as they are in different scopes.

# ------------- IF STATEMENT -------------------------------------------------------------------------------------------
# if [condition]:
#     [Code to run if the condition is true]

# veg = input("Type the name of a vegetable: ")

# if veg == "corn":
#     print("The vegetable is corn.")

# ------------- ELSE STATEMENT -----------------------------------------------------------------------------------------
# if [condition]:
#     [Code to run if the condition is true]
# else:
#     [Code to run if the condition is false]

# if veg == "corn":
#     print("The vegetable is corn.")
# else:
#     print("The vegetable is not corn.")

# ------------- NESTED IF & ELSE STATEMENTS ----------------------------------------------------------------------------
# gpa = float(input("What was the applicant's grade point average?"))
# inst_app = input("Is the student going to be educated at an approved institution?")

# if gpa >= 3.7:
#     if inst_app == "yes":
#         print("The applicant qualifies for a low APR student loan.")
#     else:
#         print("The applicant does not qualify since they haver not been accepted into an approved institution.")
# else:
#     print("The applicant did not have high enough grades to qualify.")

# ------------- GRADE DETERMINER ---------------------------------------------------------------------------------------
# student_score = int(input("Enter the student's grade: "))

# if student_score >= 90:
#     print("The student's score of "+ str(student_score) +" is an A.")
# else:
#     if student_score >= 80:
#         print("The student's score of "+ str(student_score) +" is a B.")
#     else:
#         if student_score >= 70:
#             print("The student's score of "+ str(student_score) +" is a C.")
#         else:
#             if student_score >= 60:
#                 print("The student's score of "+ str(student_score) +" is a D.")
#             else:
#                 print("The student's score of "+ str(student_score) +" is an F.")

# ------------- ELIF STATEMENT -----------------------------------------------------------------------------------------
# user_num = int(input("Please, enter an integer: "))

# if user_num < 0:
#     print("The number you entered is less than 0.")
# elif user_num == 0:
#     print("The number you entered is 0.")
# elif 0 < user_num <= 100:
#     print("The number you entered can be anything between 1 and 100, both included.")
# else:
#     print("The number you entered is greater than 100.")

# ------------- ROMAN NUMERAL EQUIVALENT -------------------------------------------------------------------------------
# from random import randint
# rdm_number = randint(1, 10)

# if rdm_number == 1:
#     print("The roman numeral equivalent to "+str(rdm_number)+" is I")
# elif rdm_number == 2:
#     print("The roman numeral equivalent to "+str(rdm_number)+" is II")
# elif rdm_number == 3:
#     print("The roman numeral equivalent to "+str(rdm_number)+" is III")
# elif rdm_number == 4:
#     print("The roman numeral equivalent to "+str(rdm_number)+" is IV")
# elif rdm_number == 5:
#     print("The roman numeral equivalent to "+str(rdm_number)+" is V")
# elif rdm_number == 6:
#    print("The roman numeral equivalent to "+str(rdm_number)+" is VI")
# elif rdm_number == 7:
#     print("The roman numeral equivalent to "+str(rdm_number)+" is VII")
# elif rdm_number == 8:
#     print("The roman numeral equivalent to "+str(rdm_number)+" is VIII")
# elif rdm_number == 9:
#     print("The roman numeral equivalent to "+str(rdm_number)+" is IX")
# else:
#     print("The roman numeral equivalent to " + str(rdm_number) + " is X")

# ------------- TRUTHY & FALSEY VALUES ---------------------------------------------------------------------------------
# strings_example = input("Enter any string other than an empty one.")

# if strings_example != "": # Una cadena que no este vacía se considera como el valor booleano "True"
#     print("Thank you for entering something.")
# else: # Mientras que una cadena vacía se considera como "False"
#     print("You did not enter a string.")

# FALSEY string   --> ""
# FALSEY integers --> 0
# FALSEY floats   --> 0.0

# La función bool() nos devuelve el valor booleano equivalente de cualquier dato
# print(bool(0))       --> False
# print(bool(1))       --> True
# print(bool(0.0))     --> False
# print(bool(0.1))     --> True
# print(bool(""))      --> False
# print(bool("Hola"))  --> True

# ------------- WHILE LOOPS --------------------------------------------------------------------------------------------
# CLOSED LOOP
# while [condition]:
#     [Code to run if the condition is true]
#     [Condition modifier to avoid infinite loops]

# INFINITE LOOP
# while [condition]:
#     [Code to run if the condition is true]

# counter = 0
# while counter < 3:
#     print("something")
#     counter += 1

# ------------- WHILE LOOPS EXERCISE -----------------------------------------------------------------------------------
# countdown = 10
# while countdown > 0:
#     print(countdown)
#     countdown -= 1

# ------------- SUM OF NUMBERS FROM A POSITIVE INTEGER -----------------------------------------------------------------
# pos_int = abs(int(input("Enter a positive integer: ")))
# total = 0
# while pos_int > 0:
#     total += pos_int
#     pos_int -= 1

# print(total)

# ------------- FOR LOOPS ----------------------------------------------------------------------------------------------
# for [variable that contains a value from the thing being iterated] in [thing being iterated]:
#     [Code to run if the condition is true]

# word = "house"
# for letter in word:
#     print(letter)

# ------------- FOR LOOPS EXERCISE -------------------------------------------------------------------------------------
# word = "Hello world"
# for char in word:
#     print(char)

# ------------- FIND THE NUMBER OF CHARACTERS IN A STRING --------------------------------------------------------------
# user_string = input("Enter a string: ")
# num_char = 0

# for char in user_string:
#     num_char += 1

# print("La cadena \"" + user_string + "\" tiene " + str(num_char) + " caracteres.")

# ------------- RANGE() ------------------------------------------------------------------------------------------------
# one_input = range(5) # Recorre el rango desde '0' hasta '5-1'
# for num in one_input:
#     print(num)

# print(type(one_input)) # --> <class 'range'>

# two_inputs = range(5, 10) # Recorre el rango desde '5' hasta '10-1'
# for num in two_inputs:
#     print(num)

# three_inputs1 = range(1, 20, 3) # Recorre el rango desde '1' hasta '20-1', sumando de '3' en '3'
# for num in three_inputs1:
#     print(num)

# three_inputs2 = range(23, 2, -3) # Recorre el rango desde '23' hasta '2+1', restando de '3' en '3'
# for num in three_inputs2:
#     print(num)

# ------------- FIZZ BUZZ ----------------------------------------------------------------------------------------------
# for num in range(1, 51):
#     if num % 3 == 0 and num % 5 == 0:
#         print("FizzBuzz")
#     elif num % 3 == 0:
#         print("Fizz")
#     elif num % 5 == 0:
#         print("Buzz")
#     else:
#         print(num)

# ------------- FACTORIAL ----------------------------------------------------------------------------------------------
# user_num = abs(int(input("Enter a positive integer: ")))

# def factorial(numero):
#     fact = 1
#     for num in range(numero, 1, -1):
#         fact *= num

#     return fact


# print("El factorial de " + str(user_num) + " es: " + str(factorial(user_num)))

# ------------- STRING METHODS (I) -------------------------------------------------------------------------------------
# .upper() & .lower()
# all_low = "lower case string"
# print(all_low.upper())
# print(all_low) # Si queremos que se guarde en mayusculas, debemos asignarlo a una variable
# all_up = "UPPER CASE STRING"
# print(all_up.lower())

# .isupper() & .islower()
# print("Mixed Case".isupper()) # False
# print("ALL CAPS!".isupper()) # True
# print("AAAAAAAH!".islower())  # False
# print("100$ is a lot to make in an hour.".islower()) # True
# print("".isupper()) # False
# print("37&8.,?:\"".islower()) # False

# .isalpha() only returns True if all the characters are letters
# print("Hola".isalpha()) # True
# print("Hola, ¿qué tal?".isalpha()) # False

# .isalnum() only returns True if all the characters are numbers and letters (sin espacios)
# # print("Password1234".isalnum()) # True
# # print("Tengo 28 años".isalnum()) # False

# .isdecimal() only returns True if all the characters are numbers
# print("1234".isdecimal()) # True
# print("3.1415".isdecimal()) # False

# .isspace() only returns True if all the characters are spaces
# print(" ".isspace()) # True
# print("Not just space".isspace()) # False
# print("Not just space"[3].isspace()) # True

# .istitle() only returns True if all the words in the string have their first letter capitalized
# print("Hola, mi nombre es Javier".istitle()) # False
# print("Hola, Mi Nombre Es Javier".istitle()) # True

# .title() turns all the words in string into titlecase
# print("the great gatsby".title())

# .startswith() & .endswith()
# print("This is a string!".startswith("This is")) # True
# print("This is a string!".startswith("T")) # True
# print("This is a string!".startswith("t")) # False (Case-sensitive)
# print("This is a string!".endswith("a string!")) # True
# print("This is a string!".endswith("!")) # True
# print("This is a string!".endswith("string")) # False

# .join()
# "[separator]".join(["str1", "str2", "str3"])
# print("-".join(["one", "two", "three"]))

# .split()
# "string to split".split() -- Separa la cadena por sus espacios (por defecto)
# print("One, two, three, four".split()) # Mantiene las comas
# print("One, two, three, four".split(",")) # Mantiene los espacios y separa por las comas
# print("One, two, three, four".split(", ")) # Mantiene solo las palabras

# ------------- STRING METHODS (I) EXERCISES ---------------------------------------------------------------------------
# mixed_case = "A Song of Ice and Fire"
# print(mixed_case.isupper())
# print(mixed_case.islower())
# print(mixed_case.upper())
# print(mixed_case.lower())
# print(mixed_case.istitle())
# title_case = mixed_case.title()
# print(title_case)
# print(mixed_case.startswith("A"))
# print(mixed_case.endswith("e"))
# words = mixed_case.split()
# print(words)
# print("".join(words).isalpha())

# ------------- STRING METHODS (II) ------------------------------------------------------------------------------------
# .rjust() & .ljust()
# print("Hello, World!".rjust(25)) # hace que la cadena ocupe 25 espacios, rellenando por la izquierda
# print("Hello, World!".ljust(25) + "space after the string.") # la cadena ocupa 25 espacios, rellenando por la derecha
# Se pueden sustituir los espacios por otro caracter, siempre que se introduzca como cadena.
# print("Hello, World!".rjust(25, "*"))
# print("Hello, World!".ljust(25, "-"))

# .center()
# print("Hello, World!".center(25)) # Reparte los espacios a ambos lados
# print("Hello, World!".center(25, ":"))

# .strip(), .rstrip() & .lstrip()
# print("111Hello, 11 World!111".strip("1")) # Elimina el caracter indicado en ambos extremos
# print("111Hello, 11 World!111".rstrip("1")) # Elimina el caracter indicado en el extremo derecho
# print("111Hello, 11 World!111".lstrip("1")) # Elimina el caracter indicado en el extremo izquierdo
# .strip() para de eliminar caracter cuando se encuentra con el primer caracter que no coincide con la selección
# print("juice, bread, cheese, beef, bread".rstrip(", bread"))
# print("juice, bread, cheese, beef, bread".rstrip("red, ba"))
# print("blueblueyellowblue".strip("eulb"))

# .replace()
# print("Good morning".replace("morning", "afternoon"))

# len()
# print(len("Hello, World!")) # Devuelve el número de caracteres del objeto entre paréntesis
# print("This" + " " + "is a " + "string.")
# print(len("This" + " " + "is a " + "string."))
# print("antidisestablishmentarianism"[7:20])
# print(len("antidisestablishmentarianism"[7:20]))

# .format()
# name = input("What is the job applicant's name?")
# degree = input("What did they major in at college?")
# job = input("What is their current occupation?")
# experience = input("How many years have they been working on their field?")
# print("{} majored in {}, works as a {}, and has {} years of experience.".format(name, degree, job, experience))

# ------------- STRING METHODS (II) EXERCISES --------------------------------------------------------------------------
# the_string = "North Dakota"
# print(the_string.rjust(17))
# print(the_string.ljust(17, "*"))
# center_plus = the_string.center(16, "+")
# print(center_plus)
# print(the_string.lstrip("North"))
# print(center_plus.rstrip("+"))
# print(center_plus.strip("+"))
# print(the_string.replace("North", "South"))

# ------------- STRING REVERSER ----------------------------------------------------------------------------------------
# user_input = input("Enter a string to reverse: ")
# empty_str = " "

# for char in range(len(user_input)-1, -1, -1):
#     empty_str += user_input[char]

# print(empty_str)

# ------------- WORD COUNTER -------------------------------------------------------------------------------------------
# user_string = input("Introduce una cadena con al menos una palabra: ")


# def word_counter(str_to_count):
#     return len(str_to_count.split())


# print(word_counter(user_string))

# ------------- LISTS --------------------------------------------------------------------------------------------------
# ex_list_1 = [5, 4, 3, 2, 1] # Lista de números enteros
# ex_list_2 = [3.14, 4.20] # Lista de números decimales
# ex_list_3 = ["blue", "red", "green"] # Lista de cadenas de texto
# ex_list_4 = [True, False, True]  # Lista de booleanos
# ex_list_5 = [[1, 2, 3], [4, 5], [6, 7, 8, 9]] # Lista de listas
# ex_list_6 = [5, [3.14, 4.20], True, "String"]

# list()
# print(list("Hola, Mundo!")) # Devuelve una lista con todos los caracteres de la string

# in & not in
# checked_list = [1, 2, 3, 4]
# print(1 in checked_list) # Devuelve "True" si '1' es un valor de 'checked_list'
# not_in_example = 8 not in checked_list
# print(not_in_example) # True

# ------------- INTRODUCTION TO LISTS EXERCISES ------------------------------------------------------------------------
# exercise_list = [7, 3.14, True, "Hello", [1, 2, 3]]
# var_listf = list("Exercise")
# print("e" in var_listf)
# print("a" not in var_listf)

# ------------- INDEX NUMBERS ------------------------------------------------------------------------------------------
# indexes_examples = ["index0", "index1", "index2"]
# print(indexes_examples[2]) # Devuelve el valor de la cadena con índice '2'
# print(indexes_examples[2][1]) # Devuelve el valor del caracter en la posición '1' de la cadena con índice '2'
# indexes_examples2 = [[1, 2, 3], [4, 5], [6, 7, 8, 9]]
# print(indexes_examples2[2][1]) # Devuelve el valor del objeto con índice '1' dentro de la lista con índice '2'

# negative index numbers
# negative_indexes = [1, 2, 3, 4, 5]
# print(negative_indexes[-1]) # '-1' devuelve el último elemento de la lista
# print(negative_indexes[-2])

# mixed_list = [7, 3.14, True, "Hello"]
# print(mixed_list[1] + 4.20)
# print(mixed_list[-1] + ", World!")

# slicing lists
# sliced_list = [1, 2, 3, 4, 5, 6, 7, 8, 9]
# print(sliced_list[:4])
# print(sliced_list[3:8])
# print(sliced_list[6:])

# reassigning values on a list
# example = [2, 4, 6, 8, 0]
# print(example)
# example[4] = 10
# print(example)
# example[1:4] = [2, 3, 4] # reassigning a range of values
# print(example)
# example[4:7] = [7, 6, 5] # reassigning a range of values extending the original list
# print(example)

# ------------- INDEXES AND LISTS SLICING EXERCISES --------------------------------------------------------------------
# list_of_lists = [[0, 2], [4, 6], [8, 10], [12, 14]]
# print(list_of_lists[0])
# print(list_of_lists[3][1])
# string_list = ["chair", "table", "desk", "lamp", "bed"]
# print(string_list[-5])
# print("Most people own at least {} {}s.".format(list_of_lists[0][-1], string_list[0]))
# float_list = [0.98, 8.76, 6.54, 4.32]
# print(float_list[1:])
# print(float_list[1:3])
# print(float_list[:2])

# ------------- DEL AND LIST STATEMENTS --------------------------------------------------------------------------------
# planets = ["Pluto", "Mars", "Earth", "Venus"]
# del planets[0]
# print(planets)
# ----------------------------------------------------------------------------------------------------------------------
# colours = ["blue", "red", "yellow", "blue", "white", "blue"]
# colours.remove("blue") # Only the first element will be removed
# print(colours)
# ----------------------------------------------------------------------------------------------------------------------
# .append()
# pets = ["cat", "dog", "snake"]
# print(pets)
# pets.append("bird") # Adds the element at the end
# print(pets)
# ----------------------------------------------------------------------------------------------------------------------
# .insert()
# pets = ["cat", "dog", "snake"]
# print(pets)
# pets.insert(1, "bird") # Adds the element at a specific position
# print(pets)
# ----------------------------------------------------------------------------------------------------------------------
# .sort()
# num_list = [2.4, 1, -23, 1000, 0]
# print(num_list)
# name_list = ["Ringo", "John", "George", "Paul"]
# print(name_list)
# num_list.sort()
# name_list.sort() # Ordena alfabeticamente
# print(num_list)
# print(name_list)

# num_list.sort(reverse=True)
# name_list.sort(reverse=True)
# print(num_list)
# print(name_list)

# mixed_list = [7, 3.14, True, "Hello"]
# mixed_list.sort() # No funciona porque no puede comparar una string a un valor numérico
# mixed_list_2 = [1.23, False, True, -23]
# mixed_list_2.sort() # 'False' equivale a '0' y 'True' a '1'
# print(mixed_list_2)

# ASCIIbetical = ["Andy", "kiwi", "apple", "Karen", "Brian", "banana"]
# ASCIIbetical.sort() # En orden alfabético, primero mayúsculas y luego minúsculas por código ASCII
# print(ASCIIbetical)
# ASCIIbetical.sort(key=str.lower) # Ahora ordena en orden alfabético ignorando mayúsculas y minúsculas
# print(ASCIIbetical)
# ----------------------------------------------------------------------------------------------------------------------
# .index()
# metals = ["copper", "gold", "silver", "iron"]
# print(metals.index("silver")) # Devuelve el número de índice del elemento especificado
# print(metals.index("platinum")) # Devuelve un error si el elemento especificado no está en la lista
# num_list = [4, 3, 2, 1, 0, 1, 2, 3, 4]
# print(num_list.index(2)) # # Devuelve el número de índice del primer elemento que coincida
# ----------------------------------------------------------------------------------------------------------------------
# .pop()
# bands = ["Queen", "Led Zeppelin", "The Beatles", "Muse", "Radiohead"]
# end = bands.pop() # Elimina el último elemento de la lista y lo almacena en la variable
# print(bands)
# print(end)
# end2 = bands.pop(3) # Elimina el elemento con índice '3' de la lista y lo almacena en la variable
# print(bands)
# print(end2)

# ------------- DEL AND LIST METHODS EXERCISES -------------------------------------------------------------------------
# arctic_animals = ["penguin", "elephant", "polar bear", "walrus", "tiger", "reindeer"]
# del arctic_animals[-2]
# arctic_animals.remove("elephant")
# arctic_animals.append("arctic fox")
# arctic_animals.insert(2, "snowy owl")
# arctic_animals.sort()
# print(arctic_animals)
# print(arctic_animals.index("reindeer"))
# print(arctic_animals.pop())

# ------------- LISTS VS. STRINGS --------------------------------------------------------------------------------------
# lists are mutable
# ex_1 = [1, 2, 3]
# ex_1[1] = 4
# print(ex_1)
# strings are immutable
# ex_2 = "123"
# ex_2[1]= 5
# print(ex_2)
# Para modificar parte de una variable, es mejor asignarla a otra nueva
# ex_3 = "No, you can't."
# ex_4 = "Yes" + ex_3[3:11] + "!"
# print(ex_4)
# ----------------------------------------------------------------------------------------------------------------------
# references
# ex_5 = 3.14
# ex_6 = "coconut"
# ex_7 = ex_5
# ex_8 = ex_6
# print(ex_7)
# print(ex_8)
# Esto no se puede hacer con listas, ya que se almacena una referencia a la lista, no la lista en si misma
# ex_9 = [1, 2, 3, 4, 5]
# ex_10 = ex_9
# ex_10[2] = 2
# print(ex_9) # La variable ex_9 también muestra la lista modificada
# print(ex_10)
# ----------------------------------------------------------------------------------------------------------------------
# deepcopy()
# import copy
# ex_12 = [1, 2, 3, 4, 5]
# ex_13 = copy.deepcopy(ex_12) # Permite crear una copia de la lista con otra referencia
# ex_13[0] = 9
# print(ex_12)
# print(ex_13)
# ----------------------------------------------------------------------------------------------------------------------
# list line continuation
# ex_14 = ["bush",
#          "fern",
#          "tree",
#          "moss"]
# print(ex_14)
# \ line continuation
# ex_15 = 2 + \
#         4 + \
#         1
# print(ex_15)
# ex_16 = "This \
# is a sin\
# gle str\
# ing."
# print(ex_16)
# ex_17 = "Hello " + \
#         "World"
# print(ex_17)

# ------------- DICTIONARIES -------------------------------------------------------------------------------------------
# SINTAXIS
# dictionary_name = {"key1": "value1", "key2": "value2", ...}
# consoles = {"nintendo": "wii", "microsoft": "xbox", "sony": "playstation"}
# print(consoles["microsoft"])
# val = consoles["microsoft"]
# print(val)
# print("The " + consoles["sony"] + " 5 is Sony's newest gaming console.")
# ----------------------------------------------------------------------------------------------------------------------
# VALUES
# mohs_hardness = {9: "corundum", 10: "diamond"}
# floats = {1.23: 1000, 3.14159: 10000, 2.718: 100000 }
# mixed = {"string": 1, 10210: 2, 4.976: 3, False: 4}
# ----------------------------------------------------------------------------------------------------------------------
# LISTS VS DICTIONARIES
# print([2, 4, 6] == [2, 4, 6]) # True
# print([2, 4, 6] == [6, 4, 2]) # False

# first = {1: "A", 2: "B", 3: "C"}
# second = {3: "C", 2: "B", 1: "A"}
# print(first == second) # True
# ----------------------------------------------------------------------------------------------------------------------
# in & not in
# [dictionary_name] in / not in [key]
# first = {1: "A", 2: "B", 3: "C"}
# print(1 in first) # True
# print(0 not in first) # True
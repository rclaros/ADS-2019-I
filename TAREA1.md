# Búsqueda binaria O(log n)

La intuición de la búsqueda binaria es similar a cuando se busca en un diccionario, cuando queremos buscar la letra R, nadie comienza a buscar por la A y luego la B, así en adelante secuencialmente, normalmente se abre el diccionario por la mitad y dependiendo de que la letra inicial es mayor a la que buscamos descartamos y solo buscamos en la mitad restante.

Para determinar la complejidad de la busque binaria, comenzarnos por analizar N, tras realizar la primera división, el numero será a lo mucho N/2(Reducimos a la mitad de los elementos), tras realizar la segunda división el numero será a lo mucho N/4 y así sucesivamente, entonces por lo general tras una división por un numero i, el número de elementos a analizar será como mucho:
```
n/2^i 
```

```
1 = n/2
2 = n/4
3 = n/8
.. =..
i = n/2^i 
```

Cuando dividimos la lista suficientes veces, el resultado es un único ítem, sea lo que estamos buscando o no, en todo caso el algoritmo ha terminado el recorrido.

El numero de operaciones necesarias para llegar a ese punto es i, donde 
n/2^i  =1, la solución para i nos da: i=log n, el número máximo de comparaciones es logarítmico respecto al número de ítems de la lista O(log n)


Vamos a ver en código como podemos ver la cantidad de operaciones en 3 casos específicos.
```
int NEEDLE = 249;
List<Integer> valueList = Arrays.asList(2, 4, 4, 5, 7, 10, 23, 25, 64, 65, 70, 90, 123, 249, 403, 499, 600, 900, 1000);
```
```
Tamaño de lista : 5000000
Encontrar el Nro. 5000000
=========================================================
Iteracción : 0
      => Nro. Mínimo : (0) < Nro. Objetivo : 5000000 > Nro. Máximo: (5000000)
Iteracción : 1
      => Nro. Mínimo : (2500001) < Nro. Objetivo : 5000000 > Nro. Máximo: (5000000)
Iteracción : 2
      => Nro. Mínimo : (3750001) < Nro. Objetivo : 5000000 > Nro. Máximo: (5000000)
Iteracción : 3
      => Nro. Mínimo : (4375001) < Nro. Objetivo : 5000000 > Nro. Máximo: (5000000)
Iteracción : 4
      => Nro. Mínimo : (4687501) < Nro. Objetivo : 5000000 > Nro. Máximo: (5000000)
Iteracción : 5
      => Nro. Mínimo : (4843751) < Nro. Objetivo : 5000000 > Nro. Máximo: (5000000)
Iteracción : 6
      => Nro. Mínimo : (4921876) < Nro. Objetivo : 5000000 > Nro. Máximo: (5000000)
Iteracción : 7
      => Nro. Mínimo : (4960939) < Nro. Objetivo : 5000000 > Nro. Máximo: (5000000)
Iteracción : 8
      => Nro. Mínimo : (4980470) < Nro. Objetivo : 5000000 > Nro. Máximo: (5000000)
Iteracción : 9
      => Nro. Mínimo : (4990236) < Nro. Objetivo : 5000000 > Nro. Máximo: (5000000)
Iteracción : 10
      => Nro. Mínimo : (4995119) < Nro. Objetivo : 5000000 > Nro. Máximo: (5000000)
Iteracción : 11
      => Nro. Mínimo : (4997560) < Nro. Objetivo : 5000000 > Nro. Máximo: (5000000)
Iteracción : 12
      => Nro. Mínimo : (4998781) < Nro. Objetivo : 5000000 > Nro. Máximo: (5000000)
Iteracción : 13
      => Nro. Mínimo : (4999391) < Nro. Objetivo : 5000000 > Nro. Máximo: (5000000)
Iteracción : 14
      => Nro. Mínimo : (4999696) < Nro. Objetivo : 5000000 > Nro. Máximo: (5000000)
Iteracción : 15
      => Nro. Mínimo : (4999849) < Nro. Objetivo : 5000000 > Nro. Máximo: (5000000)
Iteracción : 16
      => Nro. Mínimo : (4999925) < Nro. Objetivo : 5000000 > Nro. Máximo: (5000000)
Iteracción : 17
      => Nro. Mínimo : (4999963) < Nro. Objetivo : 5000000 > Nro. Máximo: (5000000)
Iteracción : 18
      => Nro. Mínimo : (4999982) < Nro. Objetivo : 5000000 > Nro. Máximo: (5000000)
Iteracción : 19
      => Nro. Mínimo : (4999992) < Nro. Objetivo : 5000000 > Nro. Máximo: (5000000)
Iteracción : 20
      => Nro. Mínimo : (4999997) < Nro. Objetivo : 5000000 > Nro. Máximo: (5000000)
Iteracción : 21
      => Nro. Mínimo : (4999999) < Nro. Objetivo : 5000000 > Nro. Máximo: (5000000)
Iteracción : 22
      => Nro. Mínimo : (5000000) < Nro. Objetivo : 5000000 > Nro. Máximo: (5000000)
=========================================================
Encontrado en la posición : 5000000
Iteraciones : 22
```

# Sucesión de Fibonacci N(n^2)

Es una secuencia infinita de número, que se define de forma recursiva, los primeros 2 números son 0 y 1 y luego cada numero es igual a la suma de los 2 anteriores.

0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89...

Esta explicación va estar basada en el algoritmo siguiente, donde se aplica la recursividad el cual tiene una complejidad exponencial, por que en medida que N crece, se incrementa el tiempo y las operaciones de cálculo.

El siguiente algoritmo es una forma de calcular la sucesión Fibonacci de forma recursiva y con complejidad exponencial.
```
    static long fibonacci(long n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
```

La complejidad:

Analizamos como se ejecuta el algoritmo para determinar por que tiene una complejidad exponencial.

Que pasa cuando queremos calcular el Fibonacci de 6:
-	La función llama primero a fibonacci(5) y después a fibonacci(4), a su vez fibonacci(5) primero llamo a fibonacci(4) y fibonacci(3).

Entonces que ha pasado.

¡Tenemos cálculos repetidos!
El fibonacci(4) lo acabamos de repetir 2 veces y otros números de la secuencia se calculan más veces todavía.

![alt text](https://github.com/rclaros/ADS-2019-I/blob/master/fibonacci-arbol.png)

Entonces las operaciones resultantes generan un árbol de llamadas similar al árbol de la imagen con las operaciones de parámetro 6.

Para sustentar lo dicho, a continuación, mostramos la cantidad de veces que se repiten en calcularse cada numero en una serie determinada.

```
Fibonacci(6)=8
Nro:2 ,Nro. veces calculado : 5
Nro:3 ,Nro. veces calculado : 3
Nro:4 ,Nro. veces calculado : 2
Nro:5 ,Nro. veces calculado : 1
Nro:6 ,Nro. veces calculado : 1
```
```
Fibonacci(20)=6765
Nro:2 ,Nro. veces calculado : 4181
Nro:3 ,Nro. veces calculado : 2584
Nro:4 ,Nro. veces calculado : 1597
Nro:5 ,Nro. veces calculado : 987
Nro:6 ,Nro. veces calculado : 610
Nro:7 ,Nro. veces calculado : 377
Nro:8 ,Nro. veces calculado : 233
Nro:9 ,Nro. veces calculado : 144
Nro:10 ,Nro. veces calculado : 89
Nro:11 ,Nro. veces calculado : 55
Nro:12 ,Nro. veces calculado : 34
Nro:13 ,Nro. veces calculado : 21
Nro:14 ,Nro. veces calculado : 13
Nro:15 ,Nro. veces calculado : 8
Nro:16 ,Nro. veces calculado : 5
Nro:17 ,Nro. veces calculado : 3
Nro:18 ,Nro. veces calculado : 2
Nro:19 ,Nro. veces calculado : 1
Nro:20 ,Nro. veces calculado : 1
```

Entonces, si ejecuto la misma función con números mas grandes, se verá como se prolonga el tiempo de respuesta del programa, es decir podemos concluir que la función es de complejidad exponencial.

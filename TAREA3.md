
# Clonación de un proyecto en GitHub

Para tener preparado el ambiente de trabajo del curso ADS-2019-I, necesitamos alinearnos al estandar de trabajo del profesor del curso.

Para ello se va a realizar los siguientes pasos:

1. Instalación de Git
2. Clonación del proyecto
3. Actualizar el codigo en el proyecto
4. Subir al Stage Area de Git
5. Subir los cambios a la rama principal de GitHub.

Manos a la obra.

# Paso 1:
Para la instalación de GitHub, debemos tener en cuenta el sistema operativo en el cual vamos a trabajar, para los Windows Lovers
descargar desde la siguiente ruta.

[Descargar Git para Windows](https://git-scm.com/download/win)

Una vez instalado Git comprobamos con el siguiente comando.
```
>git version
>git version 2.15.1.windows.2
```

# Paso 2:

Ahora nos movemos a un directorio raiz para clonar nuestro proyecto

El proyecto a clonar se encuentra en la siguiente dirección
https://github.com/rclaros/ADF-FIBONACCI
```
G:\mygithub>git clone https://github.com/rclaros/ADF-FIBONACCI
Cloning into 'ADF-FIBONACCI'...
remote: Enumerating objects: 21, done.
remote: Counting objects: 100% (21/21), done.
remote: Compressing objects: 100% (12/12), done.
remote: Total 21 (delta 2), reused 3 (delta 1), pack-reused 0
Unpacking objects: 100% (21/21), done.

```
Nos movemos al directorio del proyecto
```
cd ADF-FIBONACCI
```
# Paso 3:
Posteriormente creamos un archivo con el contenido MIARCHIVO.md
```
Mi primer archivo en GitHub.
```
Una vez modificado el codigo fuente del proyecto, se procede a ejecutar el comando que agrega al versionador local.

# Paso 4:
```
git add .
```
Agregado el archivo hacemos commit con el comentario especifico.

```
G:\mygithub\ADF-FIBONACCI>git commit -m "Mis primeros cambios"
[master 9dac854] Mis primeros cambios
 1 file changed, 4 insertions(+)
 create mode 100644 MIARCHIVO.md
```

Una vez realizado el commit estamos listo para subir a nuestro repositorio a GitHub.
# Paso 5:
```
G:\mygithub\ADF-FIBONACCI>git push origin master

Username for 'https://github.com': reyiclaros@gmail.com
Password for 'https://reyiclaros@gmail.com@github.com':
Counting objects: 3, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (3/3), done.
Writing objects: 100% (3/3), 331 bytes | 331.00 KiB/s, done.
Total 3 (delta 1), reused 0 (delta 0)
remote: Resolving deltas: 100% (1/1), completed with 1 local object.
To https://github.com/rclaros/ADF-FIBONACCI
   8f480fb..9dac854  master -> master
```
Y listo, nuestros cambios ya se encuentran en el repositorio de GitHub.

Podemos ver nuestro archivo en:
[MIARCHIVO.md](https://github.com/rclaros/ADF-FIBONACCI/blob/master/MIARCHIVO.md)

De esta forma podemos hacer cambios en nuestro codigo fuente y con unos simples comandos tenerlo subido en GitHub.



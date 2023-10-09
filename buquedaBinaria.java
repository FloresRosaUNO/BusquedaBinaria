int busquedaBinaria(int A[], int x, int i, int j) {
		int medio;
		if(i>j) {
			return 0;
		}
		medio =(i+j)/2;
		if(A[medio]< x) {
			return busquedaBinaria(A,x,medio+1, j);
		} else if(A[medio]>x) {
			return busquedaBinaria(A,x,i,medio-1);
		} else {
			return medio+1;
		}
	}

/**
	    * Algoritmo de búsqueda binaria recursiva en Java.
	    * Esta vez para buscar en arreglos de Strings o cadenas
	    *
	    * @see https://parzibyte.me/blog/2018/10/31/comparar-cadenas-java-equals-compareto-forma-correcta/ 
	    * @author parzibyte
	    * @web parzibyte.me/blog
	    */
	public static int busquedaBinariaRecursiva(String[] arreglo, String busqueda, int izquierda, int derecha) {
	    // Si izquierda es mayor que derecha significa que no encontramos nada
	    if (izquierda > derecha) {
	        return -1;
	    }
	 
	    // Calculamos las mitades...
	    int indiceDelElementoDelMedio = (int) Math.floor((izquierda + derecha) / 2);
	    String elementoDelMedio = arreglo[indiceDelElementoDelMedio];
	 
	    // Primero vamos a comparar y luego vamos a ver si el resultado es negativo,
	    // positivo o 0
	    int resultadoDeLaComparacion = busqueda.compareTo(elementoDelMedio);
	 
	    // Si el resultado de la comparación es 0, significa que ambos elementos son iguales
	    // y por lo tanto quiere decir que hemos encontrado la búsqueda
	    if (resultadoDeLaComparacion == 0) {
	        return indiceDelElementoDelMedio;
	    }
	 
	    // Si no, entonces vemos si está a la izquierda o derecha
	    if (resultadoDeLaComparacion < 0) {
	        derecha = indiceDelElementoDelMedio - 1;
	        return busquedaBinariaRecursiva(arreglo, busqueda, izquierda, derecha);
	    } else {
	        izquierda = indiceDelElementoDelMedio + 1;
	        return busquedaBinariaRecursiva(arreglo, busqueda, izquierda, derecha);
	    }
	}
}

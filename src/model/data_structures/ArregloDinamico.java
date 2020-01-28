package model.data_structures;

/**
 * 2019-01-23
 * Estructura de Datos Arreglo Dinamico de Strings.
 * El arreglo al llenarse (llegar a su maxima capacidad) debe aumentar su capacidad.
 * @author Fernando De la Rosa
 *
 */
public class ArregloDinamico <T extends Comparable<T>> implements IArregloDinamico<T> {
		/**
		 * Capacidad maxima del arreglo
		 */
        private int tamanoMax;
		/**
		 * Numero de elementos presentes en el arreglo (de forma compacta desde la posicion 0)
		 */
        private int tamanoAct;
        /**
         * Arreglo de elementos de tamaNo maximo
         */
        private String elementos[ ];

        /**
         * Construir un arreglo con la capacidad maxima inicial.
         * @param max Capacidad maxima inicial
         */
		public ArregloDinamico( int max )
        {
               elementos = new String[max];
               tamanoMax = max;
               tamanoAct = 0;
        }
        
	
		public void agregar(T dato) {
			// TODO Auto-generated method stub
			 if ( tamanoAct == tamanoMax )
             {  // caso de arreglo lleno (aumentar tamaNo)
                  tamanoMax = 2 * tamanoMax;
                  String[] copia = elementos;
                  elementos = new String[tamanoMax];
                  for ( int i = 0; i < tamanoAct; i++)
                  {
                   	 elementos[i] = copia[i];
                  } 
          	    System.out.println("Arreglo lleno: " + tamanoAct + " - Arreglo duplicado: " + tamanoMax);
             }	
             elementos[tamanoAct] =  (String) dato;
             tamanoAct++;
		}
		public int darCapacidad() {
			return tamanoMax;
		}

		public int darTamano() {
			return tamanoAct;
		}

		@SuppressWarnings("unused")
		public T darElemento(int i) {
			// TODO implementar
			if(tamanoAct!=0)
			{
			for (int j = 0; j < tamanoAct; j++) {
				{
					if(i==j)
					{
						return (T) elementos[j];
					}
				}
			 return null;
			}
		}
			return null;
		}

		@SuppressWarnings("unused")
		public T buscar(T dato) {
			if(tamanoAct!=0)
			{
				
				for (int i = 0; i < elementos.length; i++) {
					 T comp = (T) elementos[i];
					if(comp.compareTo( dato)==0)
					{
						return comp;
				}
		        return null;
				}
		}// TODO implementar
			// Recomendacion: Usar el criterio de comparacion natural (metodo compareTo()) definido en Strings.
			return null;
		}

		public T eliminar(T dato) {
			if(tamanoAct!=0)
			{
				
			}
			// TODO implementar
			// Recomendacion: Usar el criterio de comparacion natural (metodo compareTo()) definido en Strings.
			return null;
		}

		

		

}

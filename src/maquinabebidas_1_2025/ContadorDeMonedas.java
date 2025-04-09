
/** JAVADOC
 * @author Héctor Garrigues Morales
 * @version 1.0
 * Fecha: 09/04/2025
 * Descripción: Clase que servirá como contador de monedas al introducirse dentro de la máquina de bebidas. Se usará en la clase MaquinaDeBebidas, 
 * aparte de la clase TestMaquina como campo de pruebas del código.
 */

 public class ContadorDeMonedas {

    //Atributos
    /**
     * @param float cantidad: Dinero introducido por el cliente
     * @param float disponible: Dinero almacenado en la máquina, utilizado para dar cambio
     * @param float cambio: Variable para almacenar el cambio
     * @param float aDevoler: Guarda el dinero del cliente para devolverlo
     */

    private float cantidad;   // Dinero introducido por el cliente
    private float disponible; // Dinero almacenado en la máquina, utilizado para dar cambio

    // Inicializa el objeto y fija el cambio disponible inicialmente.
    // Entradas: float i, saldo inicialmente disponible para cambios
    // Salidas: Ninguna

    public ContadorDeMonedas(float i) {
        this.cantidad = 0.0f; // Inicialmente no hay dinero introducido
        this.disponible = i;  // Se fija el saldo disponible para cambios
    }


    // Informa sobre el saldo actual del cliente
    // Entradas: Ninguna
    // Salidas: float, el saldo del cliente
    public float saldo() {
        return cantidad;
    }


    // Inserta una moneda, aumentando el saldo del cliente
    // Entrada: float m, la cantidad de dinero introducida
    // Salidas: Ninguna 
    public void insertarMoneda(float m) {
        cantidad += m; // Aumenta la cantidad introducida por el cliente
    }


    // Devuelve el cambio si es posible
    // Una vez entregado el cambio, el dinero introducido por el cliente
    // pasa a engrosar el disponible de la máquina
    // Entradas: float c, el precio del producto
    // Salidas: float, el cambio, negativo si falta dinero
    public float darCambioDe(float c) {
        float cambio = cantidad - c;
        if (cambio < 0) {
            return cambio; // No hay suficiente dinero, devuelve negativo 
        } else if (disponible >= cambio) {
            disponible -= cambio; // La máquina da el cambio y lo descuenta
            cantidad = 0.0f; // El dinero del cliente ya se ha entregado a la máquina
            return cambio; // Devuelve el cambio al cliente
        } else {
            return -999f; // Si no hay suficiente dinero para dar el cambio
        }
    }


    // El cliente recupera el dinero introducido si todavía no se ha realizado la venta
    // Entradas: Ninguna
    // Salidas: float, la cantidad devuelta 
    public float retornar() {
        float aDevolver = cantidad; // Guarda el dinero del cliente para devolverlo
        cantidad = 0.0f; // Resetea la cantidad introducida
        return aDevolver; // Devuelve la cantidad que el cliente introdujo 
    }
}



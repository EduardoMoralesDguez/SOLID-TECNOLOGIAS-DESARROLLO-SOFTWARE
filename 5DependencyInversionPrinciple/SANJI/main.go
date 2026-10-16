package main

import "fmt"

func main() {
	fmt.Println("=== ENTORNO REAL ===")

	pasarelaReal := &AdaptadorMercadoPago{TokenAccess: "12344!#$"}
	emisorReal := &AdaptadorTwilio{IdentificadorCuenta: "54321&%$#"}

	servicioReal := NuevoServicioPago(pasarelaReal, emisorReal)
	_ = servicioReal.ProcesarPago("ChangoTremendo@gmail.com", 1500.00)

	fmt.Println("=== Prueba ===")

	pasarelaMock := &SimuladorPasarela{DebeFallar: true}
	emisorMock := &SimuladorEmisor{}

	servicioMock := NuevoServicioPago(pasarelaMock, emisorMock)
	_ = servicioMock.ProcesarPago("Magdielitos@gmail.com", 4500.00)
}

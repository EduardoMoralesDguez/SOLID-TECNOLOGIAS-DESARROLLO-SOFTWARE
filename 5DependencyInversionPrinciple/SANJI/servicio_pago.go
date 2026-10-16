package main

import "fmt"

type ServcioPago struct {
	pasarela PasarelaPago
	emisor   EmisorComprobante
}

func NuevoServicioPago(pasarela PasarelaPago, emisor EmisorComprobante) *ServcioPago {
	return &ServcioPago{
		pasarela: pasarela,
		emisor:   emisor,
	}
}

func (sp *ServcioPago) ProcesarPago(correo string, monto float64) error {
	if err := sp.pasarela.Cobrar(monto); err != nil {
		return fmt.Errorf("Ha fallado con exito %w \n", err)

	}
	if err := sp.emisor.Enviar(correo, monto); err != nil {
		return fmt.Errorf("Ha fallado con exito %w \n", err)

	}

	return nil
}

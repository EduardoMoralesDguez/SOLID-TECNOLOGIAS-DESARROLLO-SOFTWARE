from abc import ABC, abstractmethod

class Personaje(ABC):

    def __init__ (self, nombre, vida):
        self.nombre = nombre
        self.vida = vida

    def recibir_danio(self, cantidad):
        self.vida -= cantidad
        print(f"recibe {cantidad} de daño, vida restante: {self.vida}")

    @abstractmethod
    def atacar(self):
        pass

class ICurable(ABC):
    @abstractmethod
    def curar(self, objetivo):
        pass

class Guerrero (Personaje):
    def atacar(self):
        print(f"{self.nombre} ataca con su espada")

class Mago (Personaje, ICurable):
    def atacar (self):
        print(f"{self.nombre} ataca con una fireball")

    def curar(self, objetivo):
        objetivo.vida += 20
        print(f"{self.nombre} cura a {objetivo.nombre} +20 de vida")

class Soporte(Personaje, ICurable) :
    def atacar(self):
        print(f"{self.nombre} ataca con baston")

    def curar(self, objetivo):
            objetivo.vida += 20
            print(f"{self.nombre} cura a {objetivo.nombre} +20 de vida")

guerrero = Guerrero("Pako", 100)
mago = Mago ("Justin", 60)
soporte = Soporte("Eric", 70)

guerrero.atacar()
mago.atacar()
soporte.atacar()

guerrero.recibir_danio(30)
mago.curar(guerrero)
soporte.curar(guerrero)

print(f"Vida final de {guerrero.nombre}: {guerrero.vida}")
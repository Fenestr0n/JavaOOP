from Computer import Computer

class Desktop(Computer):

    def __init__(self, brand, model, price) -> None:
        super().__init__(brand)
        self.__model = model
        self.__price = price
    
        
    @property
    def model(self):
        return self.__model
    

    @property
    def price(self):
        return self.__price
    

    @model.setter
    def model(self, model):
        self.__model = model
    

    @price.setter
    def price(self, price):
        self.__price = price
    

    def __str__(self) -> str:
        return f"{super().brand} {self.model} {self.price}"

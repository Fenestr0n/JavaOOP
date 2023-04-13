from Computer import Computer
from Desktop import Desktop
from Notebook import Notebook

class Store:

    def __init__(self) -> None:
        lst = []
        self.__lst = lst
    

    def add_to_store(self, computer):
        self.__lst.append(computer)
    

    def remove_from_store(self, computer):
        self.__lst.remove(computer)

    
    def info(self):
        for item in self.__lst:
            print(str(item))
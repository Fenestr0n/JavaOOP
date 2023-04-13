from Desktop import *
from Notebook import *
from Store import *

notebook1 = Notebook("Apple", "Macbook Pro", 250_000)
notebook2 = Notebook("Samsung", "Galaxy Book3 ", 340_000)
desktop1 = Desktop("HP", "260 G4 Mini", 55_000)
desktop2 = Desktop("Apple", "Mac mini M2", 192_000)

shop = Store()
shop.add_to_store(notebook1)
shop.add_to_store(notebook2)
shop.add_to_store(desktop1)
shop.add_to_store(desktop2)
shop.info()
print("---")
shop.remove_from_store(notebook2)
shop.remove_from_store(desktop1)
shop.info()

"""
Apple Macbook Pro 250000
Samsung Galaxy Book3  340000
HP 260 G4 Mini 55000
Apple Mac mini M2 192000
---
Apple Macbook Pro 250000
Apple Mac mini M2 192000
"""

class Animal:
    def __init__(self, name):
        self.__name = name

    def getName(self):
        return self.__name

    def feed(self):
        print(f"{self.__name} is fed now")
    def care(self):
        pass
    def soundmake(self):
        pass

class Amphibian(Animal):
    def amphibian(self, name):
        self.__name = name
    def care(self):
        print(f"An Amphibian {self.getName()} has access to clean water now")
    def soundmake(self):
        print(f"An Amphibian {self.getName()} says 'Qua-qua'")

class Reptile(Animal):
    def reptile(self, name):
        self.__name = name
    def care(self):
        print(f"Reptile {self.getName()} has access to clean water and good grass now")
    def soundmake(self):
        print(f"Reptile {self.getName()} says 'shhhhhh'")

class Bird(Animal):
    def bird(self, name):
        self.__name = name
    def care(self):
        print(f"Bird {self.getName()} has clean cage now")
    def soundmake(self):
        print(f"Bird {self.getName()} says 'chirp-chirp'")

class Mammal(Animal):
    def mammal(self, name):
        self.__name = name
    def care(self):
        print(f"Mammal {self.getName()} has clean cage now")
    def soundmake(self):
        print(f"Mammal {self.getName()} talks")

class ZooManager:
    def __init__(self):
        self.__mainArray = AnimalsArray().main()

    def performAnimalActions(self, animal):
        animal.feed()
        animal.care()
        animal.soundmake()

    def wholeZoo(self):
        for animal in self.__mainArray:
            self.performAnimalActions(animal)

    def FindAnimalByName(self, arr, name):
        for animal in arr:
            if animal.getName().lower() == name.lower():
                return animal
        return '0'
    def oneAnimal(self, animalname):
        result_animal = self.FindAnimalByName(self.__mainArray, animalname)
        if result_animal != '0':
            self.performAnimalActions(result_animal)
        else:
            print("This animal is not found, enter the valid name")



class AnimalsArray:
    def __init__(self):
        frog = Amphibian("Quak")
        kingSnake = Reptile("Priscilla")
        downyChicken = Bird("Kyle")
        whiteAlpaca = Mammal("Derek")
        self.arr = [frog, kingSnake, downyChicken, whiteAlpaca]
    def main(self):
        return self.arr

if __name__ == "__main__":
    choice = 0
    valid_input = 0
    zoo = ZooManager()

    print("You`ve entered our Zoo!/nChoose how you can help us today:/ntake care of the whole zoo - press 1/ncheck on one exact animal - press 2/n exit - press 0")
    while valid_input != 1:
        choice = input("Please enter a number 1, 2 or 0: ")
        if choice.isdigit() and int(choice) in [0, 1, 2]:
            valid_input = 1
        else:
            print("Invalid input. Please enter a number 1, 2, or 0.")
            continue

    if int(choice) == 1:
        zoo.wholeZoo()
    elif int(choice) == 2:
        animal_name = input("You`re going to check on one animal. Please, enter the name of the animal: ")
        zoo.oneAnimal(animal_name)
    elif int(choice) == 0:
        exit()
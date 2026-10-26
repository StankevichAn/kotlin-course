package Lessons.lesson15;


open class GeometricShape(val name: String, val color: String) {
        open fun draw() {
        println("Рисуем фигуру: $name, цвет: $color")
        }
        }

ing, val radius: Double) : GeometricShape("Круг", color) {
        val area: Double = 3.14 * radius * radius
        }


        open class Polygon(name: String, color: String, val numberOfSides: Int) : GeometricShape(name, color)


        class Triangle(color: String, val sideA: Double, val sideB: Double, val sideC: Double)
        : Polygon("Треугольник", color, 3)


        class Quadrilateral(color: String, val width: Double, val height: Double)
        : Polygon("Четырехугольник", color, 4)
        }




        // Базовый класс
        open class EducationalInstitution(val name: String, val address: String, var studentCount: Int) {
        fun printInfo() {
        println("$name находится по адресу $address. Студентов: $studentCount")
        }
        }

// Производный класс: Школа
        open class School(name: String, address: String, studentCount: Int, val accreditationLevel: Int)
        : EducationalInstitution(name, address, studentCount)

// Дополнительное разветвление для Школы: Гимназия
        class Gymnasium(name: String, address: String, studentCount: Int, val profileDirection: String)
        : School(name, address, studentCount, 11)

// Производный класс: Университет
        class University(name: String, address: String, studentCount: Int, val numberOfFaculties: Int)
        : EducationalInstitution(name, address, studentCount)


// Базовый класс
        open class Furniture(val type: String, val material: String, var price: Double)

// Производный класс: Мебель для хранения
        open class StorageFurniture(type: String, material: String, price: Double, val hasDoors: Boolean)
        : Furniture(type, material, price)

// Дополнительное разветвление для Хранения: Шкаф-купе
        class Wardrobe(material: String, price: Double, val numberOfSections: Int)
        : StorageFurniture("Шкаф-купе", material, price, true)

// Производный класс: Мебель для отдыха
        open class SeatingFurniture(type: String, material: String, price: Double, val maxWeightCapacity: Int)
        : Furniture(type, material, price)

// Дополнительное разветвление для Отдыха: Кресло-качалка
        class RockingChair(material: String, price: Double, val isCushioned: Boolean)
        : SeatingFurniture("Кресло-качалка", material, price, 120)

fun main(){
    val e1 = mapOf<String, Double>("test1" to 00.33, "test2" to 00.44, "test3" to 00.29)
    val e1_1 = e1.values.average()
    println(e1_1)
//    Имеется словарь с метаданными автоматизированных тестов, где ключи — это имена тестовых методов а значения - строка с метаданными. Выведите список всех тестовых методов.
    val e2 = mapOf<String, String>("test1" to "data1", "test2" to "data2" , "test3" to "data3")
    println(e2.keys)
//    В изменяемый словарь с данными о прохождении тестов добавьте новый тест и его результат.
    val e3 = mutableMapOf<String, String>("test1" to "data1", "test2" to "data2" , "test3" to "data3")
    e3["test 4"] = "data 4"
    println(e3)
//    Посчитайте количество успешных тестов в словаре с результатами (ключ - название, значение - результат из passed, failed, skipped).
    val e4 = mapOf<String, String>("test1" to "passed", "test2" to "failed" , "test3" to "skipped")
//e4.count("passed")
//    Удалите из изменяемого словаря с баг-трекингом запись о баге, который был исправлен (ключ - название, значение - статус исправления).
    val e5 = mutableMapOf<String, String>("test1" to "passed", "test2" to "failed" , "test3" to "skipped", "test4" to "fixed")
    e5 - "fixed"
    println(e4)
//    Для словаря с результатами тестирования веб-страниц (ключ — URL страницы, значение — статус ответа), выведите сообщение о странице и статусе её проверки.
    val e6 = mutableMapOf<String, String>("URL страницы" to "200", "URL страницы2" to "100" , "URL страницы3" to "300")
    e6.entries.forEach {
        println("Веб-страница: ${it.key} -> Статус проверки: ${it.value}")
    }

//    Найдите в словаре с названием и временем ответа сервисов только те, время ответа которых превышает заданный порог.
    val e7 = mutableMapOf<String, Int>("test1" to 1, "test2" to 2, "test3" to 3, "test4" to 4)
    println (e7.filter({it.value > 1}))
//    В словаре хранятся результаты тестирования API (ключ — endpoint, значение — статус ответа в виде строки).
//    Для указанного endpoint найдите статус ответа, если endpoint отсутствует, предположите, что он не был протестирован.
    val e8 = mutableMapOf<String, String?>("endpoint1" to "1", "endpoint2" to "2", "endpoint3" to "3", "endpoint4" to "")

    val key =   "endpoint5"
    val search = e8.getOrElse(key){ "он не был протестирован" }
    println("$key: $search")

//    Из словаря, содержащего конфигурации тестового окружения (ключ — название параметра конфигурации,
//    значение - сама конфигурация), получите значение для "browserType". Ответ не может быть null.
    val e9 = mutableMapOf<String, String>("browserType" to "1", "browserType2" to "2", "browserType3" to "3", "browserType4" to "4")
    val e9_1 = e9.getOrDefault("browserType", "1")
//    Создайте копию неизменяемого словаря с данными о версиях тестируемого ПО, добавив новую версию.
    val e10 = mapOf<String, String>("тестируемого ПО" to "1", "тестируемого ПО2" to "2", "тестируемого ПО3" to "3", "тестируемого ПО4" to "4")
    val e10_1 = e10 + mapOf( "тестируемого ПО5" to "5")
    println(e10_1)

//    Используя словарь с настройками тестирования для различных мобильных устройств (ключ — модель устройства, значение - строка с настройками),
//    получите настройки для конкретной модели или верните настройки по умолчанию.
    val e11 = mapOf<String, String>("модель устройства" to "1", "модель устройства2" to "2", "модель устройства3" to "3", "модель устройства4" to "4")
    val e11_1 = e11.getOrDefault("модель устройства","настройки по умолчанию" )

//    Проверьте, содержит ли словарь с ошибками тестирования (ключ - код ошибки, значение - описание ошибки) определенный код ошибки.
    val e12 = mapOf<String, String>("код ошибки" to "1", "код ошибки2" to "2", "код ошибки3" to "3", "код ошибки4" to "4")
    val e12_1 = e12.getValue("код ошибки")

//    Дан неизменяемый словарь, где ключи — это идентификаторы тестовых сценариев в формате "TestID_Version", а значения —
//    статусы выполнения этих тестов ("Passed", "Failed", "Skipped"). Отфильтруйте словарь, оставив только те сценарии, идентификаторы
//    которых соответствуют определённой версии тестов, то-есть в ключе содержится требуемая версия.
    val e13 = mapOf<String, String>("TestID_Version1" to "passed", "TestID_Version2" to "failed" , "TestID_Version3" to "skipped", "TestID_Version4" to "fixed")
    val e13_1 = e13.filterKeys {it == "TestID_Version3"}
    println(e13_1)

//    У вас есть словарь, где ключи — это названия функциональных модулей приложения, а значения — результаты их тестирования. Проверьте, есть ли модули с неудачным тестированием.
    val e14 = mapOf<String, String>("названия функциональных модулей приложения1" to "passed", "названия функциональных модулей приложения2" to "failed" , "TestID_Version3" to "skipped", "TestID_Version4" to "fixed")
    val e14_1 = e14.filterValues {it == "failed"}
    println(e14_1)
//    Добавьте в изменяемый словарь с настройками тестовой среды настройки из другого словаря.
    val e15 = mapOf<String, String>("настройки тест среды1" to "1", "настройи тест среды2" to "2" , "настройки тест среды3" to "3")
    val e15_1 = mapOf<String, String>("настройки тест среды4" to "4")
    val e15_2 = e15 + e15_1
    println(e15_2)

//    Объедините два неизменяемых словаря с данными о багах.
    val map1 = mapOf("endpoint1" to "passed", "endpoint2" to "failed")
    val map2 = mapOf("endpoint3" to "skipped", "endpoint4" to "passed")
    val combinedMap = map1 + map2
//    Очистите изменяемый словарь с временными данными о последнем прогоне автоматизированных тестов.
    e9.clear()
//    Исключите из отчета по автоматизированному тестиров анию те случаи, где тесты были пропущены (имеют статус “skipped”).
//    Ключи - название теста, значения - статус.
    //val e5 = mutableMapOf<String, String>("test1" to "passed", "test2" to "failed" , "test3" to "skipped", "test4" to "fixed")
    e5.entries.removeIf { it.value == "skipped" }

//    Создайте копию словаря с конфигурациями тестирования удалив из него несколько конфигураций.
      val e9_4 = mutableMapOf<String, Int>("browserType" to 1, "browserType2" to 2, "browserType3" to 3, "browserType4" to 4)
    val e16 = e9_4.filter{ it.value > 3 }
    println(e16)

//    Создайте отчет о тестировании, преобразовав словарь с результатами тестирования (ключ — идентификатор теста, значение — результат) в список строк формата "Test ID: результат".
    val e17 = mapOf<String, String>("TestID_Version1" to "passed", "TestID_Version2" to "failed" , "TestID_Version3" to "skipped", "TestID_Version4" to "fixed")
    val e17_1: List<String> = e17.map { (name, status) -> "$name: $status" }
    println(e17_1)
//    Преобразуйте изменяемый словарь с результатами последнего тестирования в неизменяемый для архивации.
    val e17_2 = e17.toMap()
//    Преобразуйте словарь, содержащий числовой ID теста и данные о времени выполнения тестов, заменив идентификаторы тестов на их строковый аналог (например через toString()).
   val e18 = mapOf<Int, Double>(1 to 00.33, 2 to 00.44, 3 to 00.29)
    val result: Map<String, Double> = e18.mapKeys { it.key.toString() }

//    Для словаря с оценками производительности различных версий приложения (ключи - строковая версия, значения - дробное число времени ответа сервера)
//    увеличьте каждую оценку на 10%, чтобы учесть новые условия тестирования.
    val e19 = mutableMapOf<String, Double>("1" to 00.33, "2" to 00.44, "3" to 00.29)
    val e19_1: Map<String, Double> = e19.mapValues { it.value * 1.1 }

//    Проверьте, пуст ли словарь с ошибками компиляции тестов.
    val e20 = mutableMapOf<String?, Double?>()
    val e20_1 = e20.isEmpty()
    println(e20_1)

//    Убедитесь, что словарь с результатами нагрузочного тестирования не пуст.
    val e21 = e20.isNotEmpty()
//    Проверьте, прошли ли успешно все автоматизированные тесты в словаре с результатами.
    //val e17 = mapOf<String, String>("TestID_Version1" to "passed", "TestID_Version2" to "failed" , "TestID_Version3" to "skipped", "TestID_Version4" to "fixed")
    val allPassed: Boolean = e17.values.all { it == "passed" }
//    Определите, содержит ли словарь с результатами тестирования хотя бы один тест с ошибкой.
    e17.values.any { it == "failed" }

//    Отфильтруйте словарь с результатами тестирования сервисов, оставив только те тесты, которые не прошли успешно и содержат в названии “optional”.
    val filtered = e17.filter { (name, status) ->
        name.contains("optional") && status != "passed"
    }

}


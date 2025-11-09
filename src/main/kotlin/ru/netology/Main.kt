package ru.netology

fun main() {

// ПРОГРАММА СОСТАВЛЯЕТСЯ С УЧЕТОМ ПРОЙДЕННОГО МАТЕРИАЛА , В ДЖАВЕ БЫЛА БЫ МАП ,
    // ГДЕ ХРАНИЛАСЬ БЫ ИНФОРМАЦИЯ О КЛИЕНТАХ И БЫЛИ БЫ ОТДЕЛЬНЫЕ ФУНКЦИИ
    // УСЛОВИЕМ ВЫПОЛНЕНИЯ ДОМАШНИХ ЗАДАНИЙ В НЕТОЛОГИИ ЯВЛЯЕТСЯ ИХ ВЫПОЛНЕНИЕ С УЧЕТОМ ПРОЙДЕННОГО МАТЕРИАЛА 


    val klientStatus = true // статус клиента как постоянного/не постоянного
    val prise = 15000 // сумма покупки
    var priseFinal = 0;

    if (klientStatus) {
        if (prise in 0..1000) {
            priseFinal = (prise * 0.99).toInt()
        } else if (prise in 1001..10000) {
            priseFinal = ((prise - 100) * 0.99).toInt()
        } else if (prise > 10001) {
            val intermediatePrice = prise * 0.95
            priseFinal = (intermediatePrice * 0.99).toInt()
        }


    }

    if (!klientStatus) {
        if (prise in 0..1000) {
            priseFinal = prise
        } else if (prise in 1001..10000) {
            priseFinal = prise - 100.toInt()
        } else if (prise > 10001) {
            priseFinal = (prise * 0.95).toInt()
        }
    }
    println("Сумма покупки с учетом скидки составляет $priseFinal")
}
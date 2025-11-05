package ru.netology

fun main() {

// ПРОГРАММА СОСТАВЛЯЕТСЯ С УЧЕТОМ ПРОЙДЕННОГО МАТЕРИАЛА , В ДЖАВЕ БЫЛА БЫ МАП ,
    // ГДЕ ХРАНИЛАСЬ БЫ ИНФОРМАЦИЯ О КЛИЕНТАХ И БЫЛИ БЫ ОТДЕЛЬНЫЕ ФУНКЦИИ
    // УСЛОВИЕМ ВЫПОЛНЕНИЯ ДОМАШНИХ ЗАДАНИЙ В НЕТОЛОГИИ ЯВЛЯЕТСЯ ИХ ВЫПОЛНЕНИЕ С УЧЕТОМ ПРОЙДЕННОГО МАТЕРИАЛА 


    val klientStatus = false // статус клиента как постоянного/не постоянного
    val prise = 2000 // сумма покупки
    var priseFinal = 0;

    if (klientStatus == true) {
        if (prise in 0..1000) {
            priseFinal = prise - (prise * 0.01).toInt()
        } else if (prise in 1001..10000) {
            priseFinal = ((prise - 100) * 0.01).toInt()
        } else if (prise > 10001) {
            priseFinal = prise - ((prise * 0.05) * 0.01).toInt()
        }


    }

    if (klientStatus == false) {
        if (prise in 0..1000) {
            priseFinal = prise
        } else if (prise in 1001..10000) {
            priseFinal = prise - 100.toInt()
        } else if (prise > 10001) {
            priseFinal = prise - (prise * 0.05).toInt()
        }
    }
    println("Сумма покупки с учетом скидки составляет $priseFinal")
}
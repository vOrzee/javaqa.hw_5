package ru.netology.services;

public class RestTimeService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                money -= expenses; // вычитаем ежемесячные траты
                money /= 3; // вычитаем траты на отдых
            } else {
                money = money + income - expenses;
            }
        }
        return count;
    }
}

package ru.netology.services.javacycles2;

public class FreelancerRestService {
    public int calculate(int income, int expenses, int threshold) {
        int money = 0;    // количество денег на счету
        int countMonthsRest = 0; // счётчик месяцев отдыха

        for (int i = 0; i <= 11; i++) {
            if (money >= threshold) {
                // фрилансер отдыхает
                money = (money - expenses) / 3;
                countMonthsRest++;
            } else {
                // фрилансер работает
                money += income;
                money -= expenses;
            }
        }
        return countMonthsRest;
    }
}

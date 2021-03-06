package com.kodilla.kodillapatterns2.adapter.company.oldhrsystem;

public class Workers {

    private String[][] workers = {
            {"123456789", "John", "Smith"},
            {"111111111", "Ivone", "Novak"},
            {"222222222", "Jessie", "Pinkman"},
            {"333333333", "Walter", "White"},
            {"444444444", "Clara", "Lanson"}
    };

    private double[] salaries = {
            4500.00,
            3700.00,
            4350.00,
            9000.00,
            6200.00
    };

    public String getWorker(int n) {
        if (n > salaries.length){
            return "";
        }
        return workers[n][0] + ", " + workers[n][1] + ", " + workers[n][2] + ", " + salaries[n];
    }

    public String[][] getWorkers() {
        return workers;
    }

    public double[] getSalaries() {
        return salaries;
    }
}

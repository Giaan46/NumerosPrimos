package com.company;
// criba de eratostenes
public class Main {

    public static void main(String[] args) {
        int n = 100;
        boolean primo[];
        primo = new boolean[n + 1];


        for (int i = 1; i < n; i++) {
            primo[i] = true;

        }
        for (int j = 2; j <= n; j++) {
            if (true == primo[j]) ;


            for (int k = 2; k <= (n) / j; k++) {
                primo[k*j] = false;




            }


            }


        }
    }




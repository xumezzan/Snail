package com.epam.rd.autotasks.snail;

import javax.security.auth.Subject;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Snail
{
    public static void main(String[] args) {
        //Write a program that reads a,b and h (line by lyne in this order) and prints
        //the number of days for which the snail reach the top of the tree.
        //a - feet that snail travels up each day, b - feet that slides down each night, h - height of the tree

        Scanner scanner = new Scanner(System.in);

        int a, b, h, count = 0, sum = 0;


        a = scanner.nextInt();
        b = scanner.nextInt();
        h = scanner.nextInt();

        if (b < a || (a >= h)) {
            while (sum < h) {
                count++;
                sum += a;
                if (sum >= h)
                    break;
                sum -= b;
            }

            System.out.println(count);

        } else {
            System.out.println("Impossible");
        }

    }
}

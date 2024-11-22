package com.quest.practice_vars;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            try {
                System.out.println("Enter Dividend");
                int dividend = sc.nextInt();
                System.out.println("Enter Divisor");
                int divisor = sc.nextInt();
                int res = dividend / divisor;
                System.out.println(res);
                int[] numArr = {1, 2, 3, 4, 5};
                System.out.println(numArr[5]);
            }

            catch (InputMismatchException e) {
                throw new InputMismatchException();
            } catch (ArithmeticException e) {
                System.out.println("Div by zero is not possible");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("No number at the given position");
            } finally {
                System.out.println("exception handlled sucessfully");
            }

        }
    }

//compiled time exceptions
//run time exception(not in catch)
//
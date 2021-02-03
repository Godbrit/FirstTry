package Anonim;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.IOException;
import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) throws IOException, ScannerException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int x = Integer.parseInt(scanner.nextLine());

            if (x != 0) {

                try {

                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("Введи 0");
                    System.out.println("Вы не восхитительны");

                        if (x != 1) {

                            throw new ScannerException("1 хотя бы");


                        }
                    }

                }
            }

        }
    }

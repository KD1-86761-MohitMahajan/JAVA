package com.app.geometry;

import java.util.Scanner;

public class testerGeometry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the coordinates of Point 1 (x1, y1): ");
        float x1 = sc.nextFloat();
        float y1 = sc.nextFloat();

        System.out.println("Enter the coordinates of Point 2 (x2, y2): ");
        float x2 = sc.nextFloat();
        float y2 = sc.nextFloat();

        appGeometry geometry = new appGeometry(x1, y1, x2, y2);

        geometry.getDetails();

        if (geometry.isEqual()) {
            System.out.println("The points are at the same position.");
        } else {
            System.out.println("The points are at different positions.");
            double distance = geometry.Distance();
            System.out.println("Distance between Point 1 and Point 2: " + distance);
        }


    }
}

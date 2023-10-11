package com.example;

import com.example.robot.Robot;

public class TestRobot {
    public static void main(String[] args) {
        Robot robot1 = new Robot(1, 0, 0);
        Robot robot2 = new Robot(2, 2, 3);
        Robot robot3 = new Robot(3, -1, -1);

        int totalRobots2 = Robot.getCount();

        System.out.println("Nombre total de robots (via un objet Robot) : " + totalRobots2);

        robot1.Avancer(2);
        robot2.Tourner(1);
        robot3.Avancer(3);
        robot3.Tourner(12);

        robot1.Affiche();
        System.out.println("Numéro du robot : " + robot1.getNum());

        robot2.Affiche();
        System.out.println("Numéro du robot : " + robot2.getNum());

        robot3.Affiche();
        System.out.println("Numéro du robot : " + robot3.getNum());

        System.out.println("Nombre total de robots (via la classe Robot) : " + Robot.getCount());
    }
}

package com.company;

// The concrete builder class that assembles the parts
// of the finished Robot object
//everytime you want to create a robot, you create a new builder object that is base off of the robot builder interface

public class OldRobotBuilder implements RobotBuilder {

    private Robot robot;

    public OldRobotBuilder() {
        this.robot = new Robot();
    }

    public void buildRobotHead() {
        robot.setRobotHead("Tin Head");
    }

    public void buildRobotTorso() {
        robot.setRobotTorso("Tin Torso");
    }

    public void buildRobotArms() {
        robot.setRobotArms("Blowtorch Arms");
    }

    public void buildRobotLegs() {
        robot.setRobotLegs("Roller Skates");
    }

    public Robot getRobot() {
        return this.robot;
    }

}
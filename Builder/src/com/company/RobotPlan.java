package com.company;

// This is the interface that will be returned from the builder
//definal all the qualities that you want your object to have

public interface RobotPlan{

    public void setRobotHead(String head);

    public void setRobotTorso(String torso);

    public void setRobotArms(String arms);

    public void setRobotLegs(String legs);

}
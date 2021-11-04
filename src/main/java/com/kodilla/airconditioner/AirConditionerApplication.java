package com.kodilla.airconditioner;

public class AirConditionerApplication
{

    public static void main(String[] args)
    {
        Buildling buildling = new Buildling(4);
        BuildlingController controller = new BuildlingController(buildling);
        controller.controlLoop();
    }

}

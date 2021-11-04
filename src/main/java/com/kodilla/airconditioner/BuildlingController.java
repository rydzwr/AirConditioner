package com.kodilla.airconditioner;

public class BuildlingController
{
    private Buildling buildling;

    public BuildlingController(Buildling buildling)
    {
        this.buildling = buildling;
    }

    public void controlLoop()
    {
        while (!buildling.areAllRoomsCool())
        {
            System.out.println(buildling);
            buildling.coolRooms();
            sleepOneSecond();
        }
        System.out.println("All Rooms Cooled To Target Temperature");
    }

    private void sleepOneSecond()
    {
        try
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}

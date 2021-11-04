package com.kodilla.airconditioner;

import java.util.Random;
import  java.lang.*;

public class Buildling
{
    private Room[] rooms;

    public Buildling (int numberOfRooms)
    {
        rooms = new Room[numberOfRooms];
        generateRooms();
    }

    private void generateRooms()
    {
        Random random = new Random();
        for (int i = 0; i < rooms.length; i++)
        {
            int currentTemperature = 20 + random.nextInt(15);
            int targetTemperature = currentTemperature - random.nextInt(10);
            int volume = 20 + random.nextInt(30);
            AirConditioner airConditioner = getRandomAirConditioner();
            rooms[i] = new Room(i + 1, currentTemperature, targetTemperature, volume, airConditioner);
        }
    }

    private AirConditioner getRandomAirConditioner()
    {
        Random random = new Random();
        double value = random.nextDouble();
        if (value < 0.5)
            return new BasicAirConditioner();
        else
            return new ProAirConditioner();
    }

    public boolean areAllRoomsCool()
    {
        for (Room room : rooms)
        {
            if (room.getCurrentTemperature() > room.getTargetTemperature())
                return false;
        }
        return true;
    }

    public void coolRooms()
    {
        for (Room room : rooms)
            room.cool();
    }

    @Override
    public String toString()
    {
        StringBuilder bulider = new StringBuilder();
        for (Room room : rooms)
        {
            bulider.append(room.toSting()).append("\n");
        }
        return bulider.toString();
    }
}

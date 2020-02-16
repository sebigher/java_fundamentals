package com.play.withus.fundamentals.lesson10;

import java.util.Scanner;
import java.util.stream.Stream;

public class SwitchWithMoreEnumsTester {

    public static void main(String[] args) {
        PlayerStatus playerStatus = PlayerStatus.FORWARD;
        System.out.println(playerStatus);
        System.out.println(playerStatus.name()); // try to use toString()

        String in = new Scanner(System.in).nextLine(); // just giving the string with the same bane as enum values

        playerStatus = null;
        for (PlayerStatus status : PlayerStatus.values()) {
            if (in.equals(status.name())) {
                playerStatus = PlayerStatus.valueOf(in);// or just pick up status
                break;
            }
        }
        //playerStatus = PlayerStatus.valueOf(in);// this is dangerous:  we can have java.lang.IllegalArgumentException

        //another way to search:
        System.out.println("another way to search");
        playerStatus = PlayerStatus.stream().filter(ps -> ps.name().equals(in))
            .findAny().orElse(null);

        //another problem with the switch: it doesn't like to switch a null value:NPE
        if (playerStatus == null) {
            System.exit(0);
        }
        switch (playerStatus) {
            case FORWARD:
                System.out.println(PlayerStatus.FORWARD);
                break;
            //,,,
            default:
        }
    }

}

enum PlayerStatus {
    FORWARD("10"), MIDDLEFIELD("6"), GOALKEEPER("1"); // how we construct these possible values
    //we don't have a default constructor anymore
    // we need to provide one

    private String number; // the access to the field is controlled by providing a getter

    PlayerStatus(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "PlayerStatus{" +
            "number='" + number + '\'' +
            '}';
    }


    //streaming on enum:
    public static Stream<PlayerStatus> stream() {
        return Stream.of(PlayerStatus.values());
    }
}

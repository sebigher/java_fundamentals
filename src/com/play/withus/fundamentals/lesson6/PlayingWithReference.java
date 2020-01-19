package com.play.withus.fundamentals.lesson6;

public class PlayingWithReference {
    public static void main(String[] args) {
        // suppose we have 2 tv sets and 2 remote control
        // this is the best analogy
        // TVSet is called reference type
        // remoteControl i called reference variable
        TVSet remoteControl = new TVSet();
        remoteControl.play("news");

        TVSet remoteControl2 = new TVSet();
        remoteControl2.play("football");


        // we pair the second remote control with the first tv
        remoteControl2 = remoteControl;

        remoteControl2.play(); // news
        remoteControl.play();// news


        remoteControl2.play("music");
        remoteControl.play(); //music
        remoteControl2.play(); // music


        // we cannot control the second tvset as we don't have a handle
        SubWoofer remoteControl3 = new SubWoofer();
        remoteControl3.increase();
        remoteControl3.increase();
        remoteControl3.decrease();

        // can I use the SubWoofer remoteControl
        // for a TVSet?

        //  remoteControl3 = remoteControl; //compiler error
        //  java incompatible types
        //the reference type is pretty important

        //STACK and HEAP (java memory types)
        //references are kept in STACK(frames)
        //instances(objects) are kept in HEAP
        //what a reference knows is the address in
        // the HEAP of the instance referred

        // A reference can point(refer) to only one instance
        // but an instance can have many references


    }
}

class TVSet {
    public String content;

    public void play() {
        System.out.println("stream some: " + content);
    }

    public void play(String content) {
        this.content = content;
        play();
    }
}

class SubWoofer {
    public int volume;

    public void increase() {
        ++volume;
        System.out.println("volume increased by 1: " + volume);
    }

    public void decrease() {
        if (volume > 0) {
            volume--;
        }
        System.out.println("volume decreased: " + volume);
    }


}

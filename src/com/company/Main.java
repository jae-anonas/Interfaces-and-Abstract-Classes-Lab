package com.company;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 Create a List of Remote objects.

 Populate the List of Remote objects with new instances of the concrete classes you created.

 Create a loop that loops as many times as there are items in the List of Remote objects. (You choose the kind of loop)

 Inside the loop call the numberButtonPressed method on each object and pass it the current iteration value of the loop.

 Inside the loop call the channelUp, channelDown, volumeUp, volumeDown methods on each object.
 */

public class Main {

    public static int getRandomChannel(){
        Random r = new SecureRandom();
        return Math.abs(r.nextInt(50));
    }

    public static void main(String[] args) {
	// write your code here
        List<Remote> remotes = new ArrayList<>();
        remotes.add(new Sony());
        remotes.add(new Samsung());
        remotes.add(new ViewSonic());
        remotes.add(new LG());
        remotes.add(new Samsung());
        remotes.add(new JVC());
        remotes.add(new Sony());
        remotes.add(new ViewSonic());
        remotes.add(new LG());
        remotes.add(new LG());
        remotes.add(new Sony());
        remotes.add(new JVC());
        remotes.add(new Samsung());
        remotes.add(new JVC());
        remotes.add(new ViewSonic());
        remotes.add(new Panasonic());
        remotes.add(new JVC());

        String[] passCodes = {"abstract", "implements", "extends"};

        int i = 0;

        for (Remote remote : remotes) {
            remote.setPassCode(passCodes[getRandomChannel() % 3]);
        }

        i = 0;

        for (Remote remote : remotes) {
            String code = passCodes[i % 3];
            System.out.println("\nIteration #" + ++i + ": input code: " + code + " - Expected code: " + remote.getPassCode());

            if(remote.startScan(code)){
                remote.numberButtonPressed(getRandomChannel());
                remote.channelUp();
                remote.channelDown();
                remote.volumeUp();
                remote.volumeDown();
            }
            else{
                System.out.println("Wrong input, cannot use remote.\n");
            }
        }
    }
}

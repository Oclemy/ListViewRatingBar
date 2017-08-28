package com.tutorials.hp.listviewratingbar.mData;

import com.tutorials.hp.listviewratingbar.R;
import java.util.ArrayList;
/**
 * Created by Oclemy for ProgrammingWizards TV Channel and http://www.camposha.info.

 - Our SpaceshipsCollection class.
 - This class will contain a static method that returns an arraylist of spaceships that we can bind to our listview.
 - Think of this class as our data source, so it can be replaced with a database.
 */
public class SpaceshipsCollection{

    /*
    1.CREATE SPACESHIP OBJECTS AND ASSIGN THEM PROPERTIES
    2.RETURN LIST OF THESE SPACESHIP OBJECTS
     */

    public static ArrayList<Spaceship> getSpaceships()
    {
        ArrayList<Spaceship> spaceships=new ArrayList<>();

        Spaceship s=new Spaceship();
        s.setName("Spitzer");
        s.setRating(4);
        s.setImage(R.drawable.spitzer);
        spaceships.add(s);

        s=new Spaceship();
        s.setName("Enterpise");
        s.setRating(3);
        s.setImage(R.drawable.enterprise);
        spaceships.add(s);


        s=new Spaceship();
        s.setName("Voyager");
        s.setRating(5);
        s.setImage(R.drawable.voyager);
        spaceships.add(s);

        s=new Spaceship();
        s.setName("Opportunity");
        s.setRating(3);
        s.setImage(R.drawable.opportunity);
        spaceships.add(s);

        s=new Spaceship();
        s.setName("Pioneer");
        s.setRating(2);
        s.setImage(R.drawable.pioneer);
        spaceships.add(s);

        s=new Spaceship();
        s.setName("WMAP");
        s.setRating(4);
        s.setImage(R.drawable.wmap);
        spaceships.add(s);

        s=new Spaceship();
        s.setName("Rosetter");
        s.setRating(1);
        s.setImage(R.drawable.rosetta);
        spaceships.add(s);

        s=new Spaceship();
        s.setName("Hubble");
        s.setRating(5);
        s.setImage(R.drawable.hubble);
        spaceships.add(s);

        return spaceships;
    }
}

package devanir.soaresjunior.findprint;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    //Declared my TextView
    TextView tvBigArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bound my view
        tvBigArray = findViewById(R.id.tvBigArray);
        /*Initialized my method (method name is findUlfric because Ulfric
        is one of the game characters plus *Spoiler Alert* is the longest string in the Array)*/
        findUlfric();
    }
    //Here I created the method for finding Ulfric
    private void findUlfric() {
        {
            //Created an ArrayList called tesVSkyrim short for The Elder Scrolls V: Skyrim (google it!!!)
            List<String> tesVSkyrim = new ArrayList<>();

            //Added some names of places and characters from the game to fill up my list
            //In this order it is important to note that the index of all arrays starts at 0
            //following that logic "Alduin" would be index 0
            // "UlfricStormCloak" on the other hand would be 5 and so on...
            tesVSkyrim.add("Alduin");
            tesVSkyrim.add("Dragonborn");
            tesVSkyrim.add("Whiterun");
            tesVSkyrim.add("Khajit");
            tesVSkyrim.add("Orc");
            tesVSkyrim.add("UlfricStormcloak");
            tesVSkyrim.add("ArgonianMaid");
            tesVSkyrim.add("RiftenGuard");

            //here biggestString it's an int that will find the length of the biggest string
            int biggestString = tesVSkyrim.get(0).length(); //.get from the array to get a string object and .length to get its length.
            //index will find the position int the array of the biggest number
            int index = 0;

            //The For loop will increment starting from index 0 which would be our first value
            //You can use the size() method to find the length or size of ArrayList in Java.
            // The size() method returns an int equal to a number of elements present in the array list.
            //This is a classic target loop(search about it)
            for (int i = 0; i < tesVSkyrim.size(); i++) {
                //string.length() : length() method is a final variable
                // which is applicable for string objects. length() method returns
                // the number of characters presents in the string.
                if (tesVSkyrim.get(i).length() > biggestString) {
                    //if the item at position I is bigger then the biggestString
                    // then that item at position (i) is the biggest String!!!
                    biggestString = tesVSkyrim.get(i).length();
                    index = i;

                }
                 //Created a String called it skyrim whatever... here we will have the return values of ao loop
                String skyrim = (" Item found of index: " + index + "\n" + tesVSkyrim.get(index)+":" + "\n" +
                        " is the biggest String and has the size of: " + biggestString + " characters");
                //passed the string to the only textview for visualization purposes.
                tvBigArray.setText(skyrim);


            }

        }
    }
}
package com.itschool;

import com.itschool.classes.Bad;
import com.itschool.classes.Excellent;
import com.itschool.classes.Good;
import com.itschool.classes.Pupil;

public class Main {

   public static void main(String[] args) {
      Pupil pupil = new Pupil("Pupil");
      System.out.println(pupil);

      Excellent excellentPupil = new Excellent("Excellent Pupil");
      System.out.println(excellentPupil);
      Good goodPupil = new Good("Good Pupil");
      System.out.println(goodPupil);
      Bad badPupil = new Bad("Bad Pupil");
      System.out.println(badPupil);

      Pupil[] classroom = new Pupil[4];
      classroom[0] = goodPupil;
      classroom[1] = badPupil;
      classroom[2] = excellentPupil;
      classroom[3] = pupil;
      System.out.println("\n---------------------------------");
      for (Pupil item : classroom) {
         System.out.println(item);
      }
   }
}

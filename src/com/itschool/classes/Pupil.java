package com.itschool.classes;

public class Pupil {
   protected String type;
   protected String name;

   public Pupil(String name) {
      this.setName(name);
   }

   public String getType() {
      return type;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name.strip();
   }

   protected String study() {
      return "Studies ";
   }

   protected String read() {
      return "Reads ";
   }

   protected String write() {
      return "Writes ";
   }

   protected String relax() {
      return "Relaxes ";
   }

   @Override
   public String toString() {
      return "\n" + this.getClass().getSimpleName() + "\nname: '" + name + "\'"
              + "\n" + this.study()
              + "\n" + this.read()
              + "\n" + this.write()
              + "\n" + this.relax();
   }
}

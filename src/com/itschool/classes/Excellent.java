package com.itschool.classes;

public class Excellent extends Pupil {
   public Excellent(String name) {
      super(name);
      this.type = "excellent";
   }

   @Override
   protected String study() {
      return super.study() + type;
   }

   @Override
   protected String read() {
      return super.read() + type;
   }

   @Override
   protected String write() {
      return super.write() + type;
   }

   @Override
   protected String relax() {
      return super.relax() + " badly";
   }

   @Override
   public String toString() {
      return super.toString();
   }
}

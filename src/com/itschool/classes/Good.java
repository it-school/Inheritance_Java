package com.itschool.classes;

public class Good extends Pupil {
   public Good(String name) {
      super(name);
      this.type = " good";
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
      return super.relax() + type;
   }

   @Override
   public String toString() {
      return super.toString();
   }
}

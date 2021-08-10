package com.itschool.classes;

public class Bad extends Pupil {
   public Bad(String name) {
      super(name);
      this.type = " badly";
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
      return super.relax() + " excellent";
   }

   @Override
   public String toString() {
      return super.toString();
   }
}

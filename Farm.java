class Farm  {     
   private Animal[] barn = new Animal[1];
   public Farm()
   {
      barn[0] = new Chick("chick", "cheep", "peep");
   }
   public void animalSounds()
   {
      for (int i = 0; i < barn.length; i++)
      {
         System.out.println(barn[i].getType() + " goes " + barn[i].getSound());
      }
   }
} 

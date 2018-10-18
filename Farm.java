class Farm  {     
   private Animal[] barn = new Animal[4];
   public Farm()
   {
      barn[0] = new Chick("chick", "cheep", "peep");
      barn[1] = new Pig("pig", "sNNoORtt");
      barn[2] = new Cow("cow", "moooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
      barn[3] = new NamedCow("named cow", "angus", "\'i spik inglesh\'");
   }
   public void animalSounds()
   {
      for (int i = 0; i < barn.length; i++)
      {
         if (barn[i].getType() != "named cow")
            System.out.println(barn[i].getType() + " goes " + barn[i].getSound());
         else
            System.out.println("the cow named " + ((NamedCow)barn[i]).getName() + " goes " + barn[i].getSound());
      }
   }
} 

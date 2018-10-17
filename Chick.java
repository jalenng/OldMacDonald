class Chick implements Animal 
{     
    private String myType;
    private String[] mySound;
    public Chick(String type, String sound1, String sound2)
    {
    	myType = type;
    	mySound = new String[2];
    	mySound[0] = sound1;
    	mySound[1] = sound2;
    }
    public Chick(String type, String sound)
    {
    	myType = type;
    	mySound = new String[1];
    	mySound[0] = sound;
    }
    public Chick()
    {
    	myType = "unknown";
    	mySound = new String[1];
    	mySound[0] = "unknown";
    }
    public String getSound()
    {
    	int index = (int)(Math.random() * mySound.length);
    	return mySound[index];
    }
    public String getType()
    {
    	return myType;
    }
}

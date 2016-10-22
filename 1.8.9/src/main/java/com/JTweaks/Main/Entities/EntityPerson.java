package com.JTweaks.Main.Entities;

@SuppressWarnings("unchecked")
public class EntityPerson {

	public static int mobid = 0;
	public Object instance;

	    protected void addRandomArmor() {}

    	public boolean isAIEnabled()
		{
			   return false;
    	}

	    protected String getLivingSound()
	    {
	        return "";
	    }

	    protected String getHurtSound()
	    {
	        return "";
	    }

	    protected String getDeathSound(){
	        return "";
	    }

		public String getName() {
			return "Human";
		}

}

class Ascii 
{
    public static void main(String[] args) 
    {
        for(int i = 0; i<=127;i++)
	    {
	        System.out.println((char) i);
	    }

        for(int i = 0x0c80; i<=0x0cff;i++)
	    {
	        System.out.println((char) i);
	    }
        
    }
    
}

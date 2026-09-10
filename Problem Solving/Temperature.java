class Temperature 
{
    public static void main(String[] args) 
    {
        float celcius = 27.3f;

        float fahrenheit = celcius*9/5+32;

        System.out.println(celcius + " to fahrenheit : " + fahrenheit);
        System.out.println();

        fahrenheit = 97.82f;

        celcius = fahrenheit-32*5/9;
        
        System.out.println(fahrenheit + " to celcius : " + celcius);

    }
}

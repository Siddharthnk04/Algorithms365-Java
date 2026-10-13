import java.util.Arrays;

public class NameInitials 
{
    static char[] getNameInitials(char[] name)
    {
        if (name == null || name.length == 0)
            return name;

        int count = 0;

        for (int i =0; i < name.length; i++)
        {
            if (name[i] != ' ' && (i == 0 || name[i - 1] == ' '))
                count++;
        }

        char[] initials = new char[count];
        int index = 0;

        for (int i =0; i < name.length; i++)
        {
            if (name[i] != ' ' && (i == 0 || name[i - 1] == ' '))
            {
                // initials[index] = Character.toUpperCase(name[i]);
                if (name[i] >= 'a' && name[i] <= 'z')
                    initials[index] = (char)(name[i] - 32);
                else
                    initials[index] = name[i];
                index++;
            }
        }
        
        return initials;
    }

    public static void main(String[] args) 
    {
        char[] name = {'r','a','h','u','l',' ','d','r','a','v','i','d'};

        System.out.println(Arrays.toString(getNameInitials(name)));
    }
}

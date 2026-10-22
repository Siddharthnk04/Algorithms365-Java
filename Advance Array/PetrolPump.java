public class PetrolPump 
{
    static int findStartingPump(int[] petrol, int[] distance)
    {
        if (petrol == null || distance == null || petrol.length != distance.length || petrol.length == 0)
            return -1;

        int start = 0;
        int totalFuel = 0;
        int currentFuel = 0;

        for (int i = 0; i < petrol.length; i++)
        {
            currentFuel += petrol[i] - distance[i];
            totalFuel += petrol[i] - distance[i];
            
            if (currentFuel < 0)
            {
                start = i + 1;
                currentFuel = 0;
            }
        }

        if (totalFuel < 0)
            return -1;

        return start;
    }

    public static void main(String[] args) 
    {
        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};

        System.out.println(findStartingPump(petrol, distance));
    }
}

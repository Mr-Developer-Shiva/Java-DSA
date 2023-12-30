import java.util.HashMap;
public class Intro_HashMap{
    public static void main(String[] agrs){
        //for(int i = 1 ; i <= 25 ; i++){System.out.print((i%2==0)?"\n ":"* ")};
        HashMap<String,Integer> population = new HashMap<>();

        //add --> Time Complexity 0(1)
        population.put("India",138);
        population.put("Pakistan",22);
        population.put("USA",33);
        population.put("Nepal",4);
        population.put("Australia",4);

        //get -> 0(1)
        System.out.println( population.get("India"));
        System.out.println(population.get("USA"));

        //to check whether key value is Present or Not  -> 0(1)
        System.out.println(population.containsKey("India"));
        System.out.println(population.containsKey("Kenya"));

        //Traversing on Keys -> 0(n)
        for(String s : population.keySet()){    //keySet - Start k with lower case
            System.out.println(s);   //Notice that the Order is Changed. Look at that
        }

        //Size of HashMap -> 0(1)
        System.out.println(population.size());

        //Remove from HashMap   -> 0(1)
       System.out.println(population.remove("India"));

       //Let Check out 
       System.out.println(population.containsKey("India"));
       System.out.println(population.size());
    }
}
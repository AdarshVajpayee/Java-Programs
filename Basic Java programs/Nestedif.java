public class Nestedif {
    public static void main(String[] args)
    {
        String address="Delhi,India";
        if(address.endsWith("India"))
        {
            if(address.contains("Meerut"))
            {
                System.out.println("Your City is Meerut");
            }
            else if(address.contains("Raichur"))
            {
                System.out.println("Your City is Raichur");
            }
            else
            {
                System.out.println(address.split(",")[0]);
            }
        }
        else
        {
            System.out.println("You are not living in india ");
        }
    }
}

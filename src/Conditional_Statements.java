public class Conditional_Statements {

    static void myNameSwitch(String name)
    {
        switch (name)
        {
            case "usman Ghani":{
                System.out.println("Matched! name = usman Ghani");
            }
            case "Usman Ghani":
            {
                System.out.println("Matched! name = Usman Ghani");
                break;
            }
            case "usman ghani":
            {
                System.out.println("Matched! name = usman ghani");
            }

        }

    }

    public static void main(String[] args)
    {
        int i = 0;
        int j = 10;    // will call switch if I is smaller than J //

        String name = "Usman Ghani";

        if(i == j)
        {
            System.out.println("Matched!");
        }  // if and else if
        else if(i != j)
        {
            if(i < j)
            { // nested If
                    System.out.println("I is smaller than J, Calling Switch");
                    myNameSwitch(name);
            }
            else
            {
                System.out.println("i is larger than j, no switch called");
            }
        }
        else
        {
            System.out.println("Failure! Can't Call the switch");
        }

    }
}


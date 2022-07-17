public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        int dripcofeePrice = 14;
        double latte = 9.5;
        int cappuccino = 13;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "sam";
        String customer3 = "noah";
        String customer4 = "jimmy";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = false;
        
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        //System.out.println(generalGreeting + customer1);// // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //

        if (isReadyOrder3) {

            System.out.println(pendingMessage + customer3);
        }
        else {  
            System.out.println( readyMessage + customer3 );                         
        }


        System.out.println( displayTotalMessage + latte * 2);
        if (isReadyOrder2) {

            System.out.println(pendingMessage + customer2);
        }
        else {  
            System.out.println( readyMessage + customer2 );                         
        }


        System.out.println( displayTotalMessage   + (latte - dripcofeePrice));



    }
}
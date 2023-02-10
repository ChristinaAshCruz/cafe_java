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
        double lattePrice = 4.50;
        double cappucinoPrice = 4.25;
        double coffeePrice = 3.00;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam Cooke";
        String customer3 = "Jimmy Fallon";
        String customer4 = "Noah Wyle";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)

        // customer1 - app interactions:
        System.out.println(generalGreeting + customer1 + "!");
        
        if (isReadyOrder1){
            System.out.println(customer1 + readyMessage);
            System.out.println(displayTotalMessage + coffeePrice);
        } else {
            System.out.println(customer1 + pendingMessage);
        }

        System.out.println("---------------------------------------");

        // Noah - interactions
        System.out.println(generalGreeting + customer4 + "!");
        
        System.out.println(customer4 + pendingMessage);
        
        if (isReadyOrder2){
            System.out.println(customer4 + readyMessage);
        } else {
            System.out.println(customer4 + pendingMessage);
        }

        System.out.println("---------------------------------------");

        // Sam - interactions
        System.out.println(generalGreeting + customer2 + "!");
        System.out.println(displayTotalMessage + String.format("%.2f",(2 * cappucinoPrice)));

        if (isReadyOrder3){
            System.out.println(customer3 + readyMessage);
        } else {
            System.out.println(customer3 + pendingMessage);
        }

        System.out.println("---------------------------------------");

        // Jimmy interactions
        System.out.println("Sorry, Jimmy, you still owe us $" + String.format("%.2f",(lattePrice - coffeePrice)));

    }
}

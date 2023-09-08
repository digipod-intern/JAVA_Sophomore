public class profitLoss {
    public static void main(String[] args) {
        profitLoss p = new profitLoss();
        int sellingPrice = 120;
        int costPrice = 100;
        if (sellingPrice > costPrice){
            p.profit(sellingPrice, costPrice);
        } else {
            p.loss(sellingPrice, costPrice);
        }
    }

    public void profit(int sp, int cp){
        int profit = sp - cp;
        int profitPercentage = (profit * 100) / cp;
        System.out.println("Profit is: " + profit+ " and profit percentage is: " + profitPercentage);
    }

    public void loss(int sp, int cp){
        int loss = cp - sp;
        int lossPercentage = (loss * 100) / cp;
        System.out.println("Loss is: " + loss + " and loss percentage is: " + lossPercentage);
    }
    
}

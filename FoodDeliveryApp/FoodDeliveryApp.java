package FoodDeliveryApp;

 class FoodDeliveryApp {

        private String itemName;
        private Double price;
        private String category;

        // Setter with validation for itemName
        public  void setItemName(String itemName){

            if(itemName == null || itemName.isEmpty()){

                System.err.println("Error : item name cannot be null or empty ");
                System.exit(0);

            }

            else {

                this.itemName = itemName ;
            }
        }

        // Setter with validation for price
        public void setPrice (double price){

            if(price <  0){

                System.out.println("Kindly provide valid price");
                System.exit(0);
            }

            else {

                this.price = price;

            }
        }

        // Setter with validation for category
        public  void setCategory(String category){

            if(category == null || category.isEmpty()){
                System.err.println("Error : Kindly please Enter your valid category");
                System.exit(0);
            }
            else {
                this.category = category;
            }
        }





    public  double getPrice(){

        return price;

    }
    public String getCategory(){

        return category;
    }

    public String displayItem(){

        return "Item Name : "+itemName+
                "\nPrice : "+price+
                "\nCategory : "+category;

    }


}

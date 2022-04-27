class computingXY{
    public static void main(String[] args) {
        try{
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);
            System.out.println("Answer = "+(x*y));
        }catch(Exception e){
            System.out.println("The value is Invalide!");
        }
        System.out.println("Continue...");
    }
}
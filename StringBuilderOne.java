public class StringBuilderOne {
    
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Hello");
        sb.append("Sabrina"); //append means to add something extra to previous word
        sb.insert(5,","); 
        sb.delete(5, 6);
        sb.reverse(); //output letter jadi reversed

        System.out.println(sb.toString());
    }
}

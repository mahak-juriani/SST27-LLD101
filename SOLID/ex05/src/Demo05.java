public class Demo05 {
    static int areaAfterResize(Rectangle r){
        r.setWidth(5);
        r.setHeight(4);
        return r.area();      
    }
    public static void main(String[] args) {
        System.out.println(areaAfterResize(new Rectangle())); 

        Square sq = new Square();
        sq.setSide(4);
        System.out.println(sq.area());                        
    }
}
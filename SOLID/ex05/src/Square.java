class Square implements Shape {
    private int side;
    Square() {}
    Square(int side){ this.side = side; }
    void setSide(int side){ this.side = side; }
    @Override public int area(){ return side * side; }
}
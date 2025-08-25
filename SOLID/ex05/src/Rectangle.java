class Rectangle implements Shape {
    private int w, h;
    Rectangle() {}
    Rectangle(int w, int h){ this.w = w; this.h = h; }
    void setWidth(int w){ this.w = w; }
    void setHeight(int h){ this.h = h; }
    @Override public int area(){ return w * h; }
}
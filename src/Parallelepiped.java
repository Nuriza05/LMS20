public class Parallelepiped {
    private int length, height, width;

    public Parallelepiped(int length, int height, int width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void area(){
       System.out.println(2*((height * length) + (length * width) + (height * width)));
   }

   public void volume(){
       System.out.println( length*width*height);
   }
}

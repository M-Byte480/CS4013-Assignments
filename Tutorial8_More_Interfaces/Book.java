public class Book implements Comparable<Book>, Cloneable{

    private String title;
    private int pages;
    private double price;

    public Book(){}

    public Book(String title, int pages, double price){
        this.title = title;
        this.pages = pages;
        this.price = price;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Book o = (Book) super.clone();
        o.title = new String(this.title);

        return o;
    }

    @Override
    public int compareTo(Book that) {
        return title.compareTo(that.title);
    }


}

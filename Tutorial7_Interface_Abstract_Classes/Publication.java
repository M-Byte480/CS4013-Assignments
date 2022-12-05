import java.time.LocalDate;

public class Publication implements Comparable<Publication>{
    private String title;
    private String authors;
    private int numberPages;
    private LocalDate datePublished;
    private IReadable version;

    public Publication(String title, String authors, int numberPages, LocalDate datePublished, int version){
        this.title = title;
        this.authors = authors;
        this.numberPages = numberPages;
        this.datePublished = datePublished;

        if(version == 0){
            this.version = new PrintRead();
        }else if(version == 1){
            this.version = new ERead();
        }else{
            System.out.println("Invalid input");
            System.exit(-1);
        }
    }

    /**
     * Natural ordering by title. If titles are matching, it will sort it by the release date.
     * @param that
     * @return
     */
    public int compareTo(Publication that){
        if(!this.title.equals(that.title)){
            return title.compareTo(that.title);
        }else{
            return this.datePublished.compareTo(that.datePublished);
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public int getNumberPages() {
        return numberPages;
    }

    public void setNumberPages(int numberPages) {
        this.numberPages = numberPages;
    }

    public LocalDate getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(LocalDate datePublished) {
        this.datePublished = datePublished;
    }

    public IReadable getVersion() {
        return version;
    }

    public void setVersion(IReadable version) {
        this.version = version;
    }
}

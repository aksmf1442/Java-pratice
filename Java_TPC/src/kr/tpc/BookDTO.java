package kr.tpc;

public class BookDTO {
    public String title;
    public int price;
    public String company;
    public int page;

    public BookDTO(){};

    public BookDTO(String title, int price, String company, int page) {
        this.title = title;
        this.price = price;
        this.company = company;
        this.page = page;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", company='" + company + '\'' +
                ", page=" + page +
                '}';
    }
}

package order;

/**
 * Created by prabhu on 11/7/16.
 */
public class MedicineOrder {
    private final long id;
    private final String content;

    public MedicineOrder(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}

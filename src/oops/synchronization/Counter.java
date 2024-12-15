package oops.synchronization;

public class Counter {
    private Integer count;

    Counter(Integer c){
        count = c;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}

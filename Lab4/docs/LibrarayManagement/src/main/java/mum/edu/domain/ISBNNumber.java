package mum.edu.domain;

public class ISBNNumber {

    private int start;  //first 3
    private int middle;  //middle 3
    private int end;  // last 3

    public ISBNNumber() {
    }

    public ISBNNumber(int start, int middle, int end) {
        this.start = start;
        this.middle = middle;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getMiddle() {
        return middle;
    }

    public void setMiddle(int middle) {
        this.middle = middle;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "ISBNNumber{" +
                "start=" + start +
                ", middle=" + middle +
                ", end=" + end +
                '}';
    }
}

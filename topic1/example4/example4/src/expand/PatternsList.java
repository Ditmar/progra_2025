package expand;

public class PatternsList {
    private Integer number;
    private Integer start;
    private Integer end;

    public PatternsList(Integer number, Integer start, Integer end) {
        this.number = number;
        this.start = start;
        this.end = end;
    }

    public String getPrefixCharacter(String input) {
        return input.substring(this.getStart() - 1, this.getStart());
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getEnd() {
        return end;
    }

    public void setEnd(Integer end) {
        this.end = end;
    }

}
